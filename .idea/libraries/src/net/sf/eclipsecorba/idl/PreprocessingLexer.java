/**
 Copyright (C) 2007  ECP Project

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
 Nov 17, 2007 	- Merged comment functionality from old CommentingParser class
 				- Implemented parsing inside defines
 */
package net.sf.eclipsecorba.idl;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.HashMap;

import net.sf.eclipsecorba.idl.lexer.Lexer;
import net.sf.eclipsecorba.idl.lexer.LexerException;
import net.sf.eclipsecorba.idl.node.EOF;
import net.sf.eclipsecorba.idl.node.TDirective;
import net.sf.eclipsecorba.idl.node.TDocumentationComment;
import net.sf.eclipsecorba.idl.node.TIdentifier;
import net.sf.eclipsecorba.idl.node.Token;


public class PreprocessingLexer extends Lexer {

	private Preprocessor preprocessor;
	private TDocumentationComment lastDocComment;
	private HashMap comments = new HashMap();
	private PreprocessingLexer macroLexer;
	private int posOffset;
	private int lineOffset;

	public PreprocessingLexer(PushbackReader in) {
		super(in);
	}

	public void setPreprocessor(Preprocessor preprocessor) {
		this.preprocessor = preprocessor;
	}
	
	protected void filter() throws LexerException, IOException {
		super.filter();
		if (token instanceof TDirective) {
			// Pass to external preprocessor
			try {
				preprocessor.process((TDirective) token);
			} catch (Exception e) {
				LexerException lexerException = new LexerException(e.getMessage());
				lexerException.initCause(e);
				throw lexerException;
			}
		} else if (token instanceof TDocumentationComment) {
			lastDocComment = (TDocumentationComment) token;
		} else if (token instanceof TIdentifier && lastDocComment != null) {
			comments.put(token, lastDocComment);
			lastDocComment = null;
			return;
		} else
			return;

		// Throw away current token if it has been handled by the preprocessor
		token = null;
	}

	public HashMap getComments() {
		return comments;
	}

	public Preprocessor getPreprocessor() {
		return preprocessor;
	}

	public Token getLastToken() {
		return token;
	}

	protected Token getToken() throws IOException, LexerException {
		Token token = null;
		// Currently inside macro
		if (macroLexer != null) {
			token = macroLexer.next();
			if (token instanceof EOF) {
				macroLexer = null;
				token = null;
			}
		}

		if (token == null)
			token = super.getToken();
		
		// Expand macros
		if (token instanceof TIdentifier) {
			// Is this actually a macro?
			PreprocessorDefinition definition = preprocessor.findDefinition(token.getText());
			if (definition != null) {
				macroLexer = new PreprocessingLexer(new PushbackReader(new StringReader(definition.getValue()), 512));
				macroLexer.setPreprocessor(getPreprocessor());
				macroLexer.setOffset(definition.getToken().getLine(), definition.getToken().getPos());
				token = null; // forces lexer to get next token
			}
		}
		
		// Apply offset
		if (token != null) {
			token.setLine(token.getLine() + lineOffset);
			token.setPos(token.getPos() + posOffset);
		}
		return token;
	}

	private void setOffset(int line, int pos) {
		lineOffset = line;
		posOffset = pos;
	}

}
