/**
 Copyright (C) 2006  ECP Project

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

 CHANGELOG:
 Created on Dec 19, 2006
 */
package net.sf.eclipsecorba.idl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.Assert;

import net.sf.eclipsecorba.idl.lexer.LexerException;
import net.sf.eclipsecorba.idl.node.TDirective;
import net.sf.eclipsecorba.idl.node.Token;
import net.sf.eclipsecorba.idl.parser.ParserException;

/**
 * A preprocessor handles preprocessor directives such as include and define.
 * The default implementation tracks definitions. Clients should subclass and implement
 * the include behaviour (and any pragmas).
 * @author michael
 */
public abstract class Preprocessor {
	private List includedDefinitions = new ArrayList();
	
	/**
	 * True while inside a valid ifdef block
	 */
	private LinkedList processingStack = new LinkedList();
	
	private Pattern directivePattern = Pattern.compile("#\\s*([^\\s]+)(\\s+(.*))?");
	private Pattern definitionPattern = Pattern.compile("([^\\s]+)(\\s+(.*))?");
	private HashMap definitions = new HashMap();

	public Preprocessor() {
		processingStack.add(Boolean.TRUE);
	}
	
	/**
	 * Add definitions from an included file to this lexer
	 * @param definitions
	 */
	public void include(HashMap definitions) {
		includedDefinitions.add(definitions);
	}
	
	protected void process(TDirective token) throws ParserException, LexerException {
    	Matcher matcher = directivePattern.matcher(token.toString());
		if (matcher.matches()) {
			String directive = matcher.group(1);
			String command = matcher.group(3);

			try {
				if (directive.toLowerCase().equals("define"))
					define(command, token);
				else if (directive.toLowerCase().equals("ifdef"))
					ifdef(command, token);
				else if (directive.toLowerCase().equals("ifndef"))
					ifndef(command, token);
				else if (directive.toLowerCase().equals("endif"))
					endif(token);
				else if (directive.toLowerCase().equals("else"))
					do_else(token);
				else if (directive.toLowerCase().equals("include"))
					include(command, token);
				else if (directive.toLowerCase().equals("pragma"))
					pragma(command, token);
			} catch (PreprocessorException e) {
				handle(e);
			}
		}
	}

	protected abstract void handle(PreprocessorException e);

	protected abstract void pragma(String command, TDirective token) throws PreprocessorException;

	protected abstract void include(String command, TDirective token) throws PreprocessorException;

	protected void endif(Token token) throws PreprocessorException {
		Assert.isTrue(!processingStack.isEmpty());
		if (processingStack.size() == 1)
			throw new PreprocessorException("endif found without corresponding ifdef or ifndef", token);
		processingStack.removeLast();
	}

    protected void do_else(TDirective token) throws PreprocessorException {
    	Assert.isTrue(!processingStack.isEmpty());
		if (processingStack.size() == 1)
			throw new PreprocessorException("else found without corresponding ifdef or ifndef", token);
		Boolean value = (Boolean) processingStack.removeLast();
		processingStack.add(Boolean.valueOf(!value.booleanValue()));
	}

	protected void ifndef(String command, TDirective token) throws PreprocessorException {
		Assert.isTrue(!processingStack.isEmpty());
		if (processingStack.getLast() == Boolean.TRUE) {
			Matcher matcher = definitionPattern.matcher(command);
			if (matcher.matches()) {
				String name = matcher.group(1);
				processingStack.add(Boolean.valueOf(findDefinition(name) == null));
			}
		}
		else
			processingStack.add(Boolean.FALSE);
	}

	protected PreprocessorDefinition findDefinition(String name) {
		// Start with local definitions and then work backwards from most recent to least
		PreprocessorDefinition definition = (PreprocessorDefinition) definitions.get(name);
		
		for (int i = includedDefinitions.size() - 1; i >= 0 && definition == null; i--) {
			definition = (PreprocessorDefinition) ((HashMap) includedDefinitions.get(i)).get(name);
		}
		
		return definition;
	}

	protected void ifdef(String command, TDirective token) throws PreprocessorException {
		Assert.isTrue(!processingStack.isEmpty());
		if (processingStack.getLast() == Boolean.TRUE) {
			Matcher matcher = definitionPattern.matcher(command);
			if (matcher.matches()) {
				String name = matcher.group(1);
				processingStack.add(Boolean.valueOf(findDefinition(name) != null));
			}
		}
		else
			processingStack.add(Boolean.FALSE);
	}

	protected void define(String command, Token token) throws PreprocessorException {
		if (processingStack.getLast() == Boolean.TRUE) {
			Matcher matcher = definitionPattern.matcher(command);
			if (matcher.matches()) {
				String name = matcher.group(1);
				String value = matcher.group(3);
				definitions.put(name, new PreprocessorDefinition(token, value));
			}
		}
	}

	public HashMap getDefinitions() {
		return definitions;
	}

}
