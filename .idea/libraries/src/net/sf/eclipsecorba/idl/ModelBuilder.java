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
 Created on May 18, 2006
 2007-07-26 - Improved type checking for typedefs
            - Added attributes to model
 */
package net.sf.eclipsecorba.idl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.eclipsecorba.idl.analysis.DepthFirstAdapter;
import net.sf.eclipsecorba.idl.analysis.ReversedDepthFirstAdapter;
import net.sf.eclipsecorba.idl.node.AAbstractInterfaceModifier;
import net.sf.eclipsecorba.idl.node.AArrayDeclarator;
import net.sf.eclipsecorba.idl.node.AArrayDeclaratorDeclarator;
import net.sf.eclipsecorba.idl.node.AAttrDcl;
import net.sf.eclipsecorba.idl.node.ABooleanBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.ACharBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.ACommaDeclarator;
import net.sf.eclipsecorba.idl.node.ACommaIdentifier;
import net.sf.eclipsecorba.idl.node.ACommaScopedName;
import net.sf.eclipsecorba.idl.node.AConstDcl;
import net.sf.eclipsecorba.idl.node.ADeclarators;
import net.sf.eclipsecorba.idl.node.AEnumType;
import net.sf.eclipsecorba.idl.node.AExceptDcl;
import net.sf.eclipsecorba.idl.node.AFixedTemplateTypeSpec;
import net.sf.eclipsecorba.idl.node.AFloatBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.AForwardDcl;
import net.sf.eclipsecorba.idl.node.AForwardDclIdlInterface;
import net.sf.eclipsecorba.idl.node.AIdentifierDeclarator;
import net.sf.eclipsecorba.idl.node.AIdentifierScopedName;
import net.sf.eclipsecorba.idl.node.AIdlModule;
import net.sf.eclipsecorba.idl.node.AInoutParamAttribute;
import net.sf.eclipsecorba.idl.node.AInterfaceDcl;
import net.sf.eclipsecorba.idl.node.AInterfaceHeader;
import net.sf.eclipsecorba.idl.node.AInterfaceInheritanceSpec;
import net.sf.eclipsecorba.idl.node.ALocalInterfaceModifier;
import net.sf.eclipsecorba.idl.node.ALongBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.ALonglongBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.AMember;
import net.sf.eclipsecorba.idl.node.AOctetBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.AOpDcl;
import net.sf.eclipsecorba.idl.node.AOutParamAttribute;
import net.sf.eclipsecorba.idl.node.AParamDcl;
import net.sf.eclipsecorba.idl.node.AScopedNameSimpleTypeSpec;
import net.sf.eclipsecorba.idl.node.AScopedParamTypeSpec;
import net.sf.eclipsecorba.idl.node.AScopedScopedName;
import net.sf.eclipsecorba.idl.node.AShortBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.ASimplePositiveSequenceType;
import net.sf.eclipsecorba.idl.node.ASimpleSequenceType;
import net.sf.eclipsecorba.idl.node.ASpecification;
import net.sf.eclipsecorba.idl.node.AStringParamTypeSpec;
import net.sf.eclipsecorba.idl.node.AStringTemplateTypeSpec;
import net.sf.eclipsecorba.idl.node.AStructDcl;
import net.sf.eclipsecorba.idl.node.AStructForwardDcl;
import net.sf.eclipsecorba.idl.node.ATypeDeclarator;
import net.sf.eclipsecorba.idl.node.AUlongBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.AUlonglongBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.AUnionDcl;
import net.sf.eclipsecorba.idl.node.AUnionForwardDcl;
import net.sf.eclipsecorba.idl.node.AUshortBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.AValueAbsDcl;
import net.sf.eclipsecorba.idl.node.AValueBoxDcl;
import net.sf.eclipsecorba.idl.node.AValueDcl;
import net.sf.eclipsecorba.idl.node.AValueForwardDcl;
import net.sf.eclipsecorba.idl.node.AValueHeader;
import net.sf.eclipsecorba.idl.node.AValuebaseBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.AVoidOpTypeSpec;
import net.sf.eclipsecorba.idl.node.AWcharBaseTypeSpec;
import net.sf.eclipsecorba.idl.node.AWstringTemplateTypeSpec;
import net.sf.eclipsecorba.idl.node.Node;
import net.sf.eclipsecorba.idl.node.PDeclarator;
import net.sf.eclipsecorba.idl.node.POrExpr;
import net.sf.eclipsecorba.idl.node.PScopedName;
import net.sf.eclipsecorba.idl.node.TIdentifier;
import net.sf.eclipsecorba.idl.node.Token;
import net.sf.eclipsecorba.idl.operations.Attribute;
import net.sf.eclipsecorba.idl.operations.Direction;
import net.sf.eclipsecorba.idl.operations.Operation;
import net.sf.eclipsecorba.idl.operations.OperationsFactory;
import net.sf.eclipsecorba.idl.operations.Parameter;
import net.sf.eclipsecorba.idl.types.EnumType;
import net.sf.eclipsecorba.idl.types.SequenceType;
import net.sf.eclipsecorba.idl.types.StructType;
import net.sf.eclipsecorba.idl.types.TypeDef;
import net.sf.eclipsecorba.idl.types.TypesFactory;
import net.sf.eclipsecorba.idl.types.UnionForwardDcl;
import net.sf.eclipsecorba.idl.types.UnionType;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.text.BadLocationException;

/**
 * Builds an EMF model (AST) from the concrete syntax tree, performing type checking
 * 
 * @author mhouston
 * 
 */
public class ModelBuilder extends DepthFirstAdapter {

	private final class FirstTokenFinder extends DepthFirstAdapter {

		private Token token = null;

		public void defaultCase(Node node) {
			if (node instanceof Token && token == null) {
				token = (Token) node;
			}
		}

		public Token getToken() {
			return token;
		}
	}
	
	private final class LastTokenFinder extends ReversedDepthFirstAdapter {

		private Token token = null;

		public void defaultCase(Node node) {
			if (node instanceof Token && token == null) {
				token = (Token) node;
			}
		}

		public Token getToken() {
			return token;
		}
	}

	private Specification spec;
	private LinkedList context;
	private final InputFile file;
	private final String name;
	private List includes;
	private Map macros;
	private HashMap comments;
	private ArrayList errors = new ArrayList();
	
	/**
	 * Maps each identifier (scoped name) to a model object.
	 * This is used by the editor to provide content assistance.
	 */
	private HashMap names;

	public ModelBuilder(InputFile file) {
		this.file = file;
		this.name = file.getFileName();
		if (file != null) {
			includes = file.getIncludes();
			macros = file.getMacros();
			comments = file.getComments();
			names = file.getNames();
		}
	}

	/**
	 * Constructs a new model builder without a corresponding document
	 * 
	 * @param includes
	 * @param start
	 */
	public ModelBuilder(String name, List includes, Map definitions) {
		this.name = name;
		this.macros = definitions;
		file = null;
		this.includes = includes;
	}

	public void caseTIdentifier(TIdentifier node) {
		Object comment = comments.get(node);
		if (comment instanceof Token && context.getLast() instanceof Commentable) {
			Commentable element = (Commentable)context.getLast();
			if (element.getComment() == null)
				element.setComment(((Token) comment).getText());
		}
		super.caseTIdentifier(node);
	}

	public synchronized Specification buildModel(ASpecification raw_spec) {
		spec = IdlFactory.eINSTANCE.createSpecification();
		spec.setName(name);

		context = new LinkedList();
		context.add(spec);

		// Add includes
		for (int i = 0; i < includes.size(); i++) {
			Object include = includes.get(i);
			if (include instanceof InputFile) { // depricated, should really
				// pre-parse specs
				InputFile inputFile = (InputFile) include;
				Specification model = inputFile.getModel();
				
				if (model != null)
					spec.getIncludes().add(model);
				else {
					file.addErrorMarker(1, 0, 0, "Unable to parse include file: " + inputFile.getFileName());
				}
			} else if (include instanceof Specification) {
				spec.getIncludes().add(include);
			} else if (include instanceof String) {
				Specification fakeSpec = IdlFactory.eINSTANCE.createSpecification();
				fakeSpec.setName((String) include);
				spec.getIncludes().add(fakeSpec);
			}
		}

		raw_spec.apply(this);

		return spec;
	}

	public void inAIdlModule(AIdlModule node) {
		// Find the existing module context if it exists
		Element element = findNameInContext(node.getIdentifier());
		Module extended_module = null;
		if (element instanceof Module)
			// Module has been extended
			extended_module = (Module) element;
		
		// Create new module
		Module module = IdlFactory.eINSTANCE.createModule();
		module.setExtends(extended_module);
		
		// Add to parent
		DefinitionContainer parent = (DefinitionContainer) context.getLast();
		parent.getDefinitions().add(module);

		module.setName(node.getIdentifier().getText());
		module.setLength(length(node));
		module.setPos(node.getModule().getPos());
		module.setLine(node.getModule().getLine());

		// Register name, replacing existing module reference if it exists
		if (names != null)
			names.put(IDLUtils.getScopedName(module), module);

		// Push context
		context.addLast(module);

		super.inAIdlModule(node);
	}

	public void outAIdlModule(AIdlModule node) {
		super.outAIdlModule(node);

		// Pop context
		Assert.isTrue(context.getLast() instanceof Module);
		context.removeLast();
	}

	private int length(Node node) {
		Token firstNode = firstToken(node);
		Token lastNode = lastToken(node);
		
		return getOffset(lastNode.getLine(), lastNode.getPos() + lastNode.getText().length()) 
			- getOffset(firstNode.getLine(), firstNode.getPos());
	}

	private Token lastToken(Node root) {
		LastTokenFinder tokenFinder = new LastTokenFinder();
		root.apply(tokenFinder);
		return tokenFinder.getToken();
	}

	private int getOffset(int line, int pos) {
		if (file != null) {
			try {
				return file.getDocument().getLineOffset(line-1) + pos;
			} catch (BadLocationException e) {
			}
		}
		return 0;
	}

	public void inAOpDcl(AOpDcl node) {
		// Create operation
		Operation operation = OperationsFactory.eINSTANCE.createOperation();
		operation.setName(node.getIdentifier().getText());
		operation.setLength(length(node));
		Token token = firstToken(node);
		operation.setPos(token.getPos());
		operation.setLine(token.getLine());

		// Add to parent
		Assert.isTrue(!context.isEmpty() && context.getLast() instanceof ExportContainer);
		ExportContainer parent = (ExportContainer) context.getLast();
		parent.getBody().add(operation);

		// push context
		context.addLast(operation);

		super.inAOpDcl(node);
	}

	protected void error(Node node, String string) {
		errors.add(new IDLSyntaxError(node, string));
	}

	public void outAOpDcl(AOpDcl node) {
		context.removeLast();
		super.outAOpDcl(node);
	}

	public void caseAScopedParamTypeSpec(AScopedParamTypeSpec node) {
		PScopedName scopedName = node.getScopedName();
		if (scopedName instanceof AIdentifierScopedName) {
			AIdentifierScopedName identifierScopedName = (AIdentifierScopedName) scopedName;
			TIdentifier identifier = identifierScopedName.getIdentifier();
			applyType(resolveType(identifier));
		} else if (scopedName instanceof AScopedScopedName) {
			AScopedScopedName ssname = (AScopedScopedName) scopedName;

			applyType(resolveType(ssname));
		}
		super.caseAScopedParamTypeSpec(node);
	}

	private LinkedList getScopes(AScopedScopedName ssname) {
		// Build list of IDs to use for searching
		LinkedList scopes = new LinkedList();
		scopes.add(ssname.getIdentifier());
		PScopedName scope = ssname.getScopedName();
		
		while (scope != null) {
			if (scope instanceof AIdentifierScopedName) {
				scopes.addFirst(((AIdentifierScopedName) scope).getIdentifier());
				scope = null;
			} else {
				scopes.addFirst(((AScopedScopedName) scope).getIdentifier());
				scope = ((AScopedScopedName) scope).getScopedName();
			}
		}
		return scopes;
	}

	private FileRegion resolveType(AScopedScopedName ssname) {
		LinkedList scopes = getScopes(ssname);
		Element type = findScopedNameInContext(scopes);
		if (type == null && file != null) {
			Token first = (Token) scopes.getFirst();
			Token last = (Token) scopes.getLast();
			file.addErrorMarker(first.getLine(), first.getPos(), getLength(first, last), "Type "
					+ ssname.toString() + " is undefined");
		}
		return type;
	}

	private int getLength(Token first, Token last) {
		if (first.getLine() == last.getLine()) {
			return last.getPos() + last.getText().length() - first.getPos();
		}
		return getOffset(last.getLine(), last.getPos() + last.getText().length())
				- getOffset(first.getLine(), first.getPos());
	}

	private void applyType(FileRegion type) {
		FileRegion parent = (FileRegion) context.getLast();
		if (type == null) {
			// do nothing
		} else if (!(type instanceof IdlType)) {
			if (file != null) {
				file.addErrorMarker(parent.getLine(), parent.getPos(), parent.getLength() - 1,
						"Expected type, found " + type);
			}
		} else if (parent instanceof Typed) {
			((Typed) parent).setType((IdlType) type);
		}
	}

	private Element findScopedNameInContext(List scopes) {
		Element scope = findNameInContext((TIdentifier) scopes.get(0));
		if (scope != null)
			for (int i = 1; i < scopes.size() && scope instanceof DefinitionContainer; i++) {
				scope = findNameInScope((Token) scopes.get(i), (DefinitionContainer) scope);
				if (i == scopes.size() - 1 && scope != null)
					return scope;
			}
		
		// Look in included files
		return findScopedNameInIncludes(this.spec, scopes, new HashSet());
	}

	private Element findScopedNameInIncludes(Specification spec, List scopes, Set searchedSpecs) {
		Element scope;
		// Search each spec for the scoped name
		for (Iterator i = spec.getIncludes().iterator(); i.hasNext();) {
			Specification inc = (Specification) i.next();
			if (!searchedSpecs.contains(inc)) {
				scope = findNameInSpec((TIdentifier) scopes.get(0), inc, searchedSpecs);
				if (scope != null)
					for (int j = 1; j < scopes.size() && scope instanceof DefinitionContainer; j++) {
						scope = findNameInScope((Token) scopes.get(j), (DefinitionContainer) scope);
						if (j == scopes.size() - 1 && scope != null)
							return scope;
					}
			}
		}
		
		// Now search each spec's includes
		for (Iterator i = spec.getIncludes().iterator(); i.hasNext();) {
			Specification inc = (Specification) i.next();
			if (!searchedSpecs.contains(inc)) {
				searchedSpecs.add(inc); // Don't search it again
				scope = findScopedNameInIncludes(spec, scopes, searchedSpecs);
				if (scope != null)
					return scope;
			}
		}
		return null;
	}

	private Element findNameInScope(Token id, DefinitionContainer scope) {
		EList definitions = scope.getDefinitions();

		// First check this container
		for (int j = 0; j < definitions.size(); j++) {
			Definition definition = (Definition) definitions.get(j);
			if (id.getText().equals(definition.getName()))
				return definition;
		}
		
		// If this is a module, check if it was extending an existing definition
		Module extended;
		if (scope instanceof Module && (extended = ((Module)scope).getExtends()) != null)
			return findNameInScope(id, extended);
		
		return null;
	}

	private Element findNameInContext(Token id) {
		// Check context
		for (int i = context.size() - 1; i >= 0; i--) {
			Object object = context.get(i);
			if (object instanceof DefinitionContainer) {
				Element result = findNameInScope(id, (DefinitionContainer) object);
				if (result != null)
					return result;
			}
		}

		// Check includes
		Element result = findNameInSpec(id, spec);
		if (result != null)
			return result;

		// Check definitions
		String definition = getDefinition(id.getText());
		if (definition != null) {
			// Attempt to parse DEFINE to real type
			String[] contexts = definition.split("::");
			ArrayList scopes = new ArrayList();

			int p = 0;
			for (int i = 0; i < contexts.length; i++) {
				scopes.add(new TIdentifier(contexts[i], id.getLine(), id.getPos() + p));
				p += contexts[i].length() + 2;
			}
			Element element = findScopedNameInContext(scopes);
			return element;
		}
		
		// Check names
		List name = new ArrayList();
		name.add(id.getText());
		return (Element) names.get(name);
	}

	private String getDefinition(String key) {
		if (macros.containsKey(key))
			return (String) macros.get(key);
		else {
			for (int i = 0; i < includes.size(); i++) {
				Object object = includes.get(i);
				if (object instanceof InputFile) {
					InputFile include = (InputFile) object;
					String string = include.getDefinition(key);
					if (string != null)
						return string;
				}
			}
		}
		return null;
	}

	private Element findNameInSpec(Token id, Specification spec) {
		return findNameInSpec(id, spec, new HashSet());
	}

	private Element findNameInSpec(Token id, Specification spec, Set searchedSpecs) {
		// Check this scope hasn't been searched
		if (searchedSpecs.contains(spec))
			return null;

		// Search this spec
		Element result = findNameInScope(id, spec);
		if (result != null)
			return result;

		// Add to list to prevent searching it again
		searchedSpecs.add(spec);

		// Search in includes
		for (Iterator i = spec.getIncludes().iterator(); i.hasNext();) {
			Specification inc = (Specification) i.next();
			result = findNameInSpec(id, inc, searchedSpecs);
			if (result != null)
				return result;
		}
		return null;
	}

	public void inAForwardDcl(AForwardDcl node) {
		DefinitionContainer parent = (DefinitionContainer) context.getLast();

		// Create new iface
		ForwardDcl iface = IdlFactory.eINSTANCE.createForwardDcl();
		iface.setName(node.getIdentifier().getText());
		iface.setLength(length(node));

		// Set file location
		Token firstToken = firstToken(node);
		iface.setPos(firstToken.getPos());
		iface.setLine(firstToken.getLine());

		// Add to parent
		parent.getDefinitions().add(iface);
		
		// Register type
		if (names != null)
			names.put(IDLUtils.getScopedName(iface), iface);
		
		super.inAForwardDcl(node);
	}

	public void inAInterfaceDcl(AInterfaceDcl node) {
		AInterfaceHeader interfaceHeader = (AInterfaceHeader) node.getInterfaceHeader();
		AForwardDcl forwardDcl = (AForwardDcl) interfaceHeader.getForwardDcl();

		DefinitionContainer parent = (DefinitionContainer) context.getLast();

		// Create new iface
		IdlInterfaceDcl iface = IdlFactory.eINSTANCE.createIdlInterfaceDcl();
		
		// Add to parent
		parent.getDefinitions().add(iface);

		// Apply new info to iface
		setupInterface(node, iface, forwardDcl);

		// Check for forward declaration
		Element fd = findNameInContext(forwardDcl.getIdentifier());
		List scopedName = IDLUtils.getScopedName(iface);
		if (fd instanceof ForwardDcl && IDLUtils.getScopedName((ForwardDcl)fd).equals(scopedName))
			iface.setForwardDcl((ForwardDcl) fd);
		
		// Register type
		if (names != null)
			names.put(scopedName, iface);

		// Push context
		context.addLast(iface);

		super.inAInterfaceDcl(node);
	}

	private void setupInterface(Node node, IdlInterfaceDcl iface, AForwardDcl forwardDcl) {
		iface.setName(forwardDcl.getIdentifier().getText());
		iface.setLength(length(node));

		// Modifiers
		Token firstToken;
		if (forwardDcl.getInterfaceModifier() instanceof AAbstractInterfaceModifier) {
			firstToken = ((AAbstractInterfaceModifier) forwardDcl.getInterfaceModifier())
					.getAbstract();
			iface.setAbstract(true);
		} else if (forwardDcl.getInterfaceModifier() instanceof ALocalInterfaceModifier) {
			firstToken = ((ALocalInterfaceModifier) forwardDcl.getInterfaceModifier()).getLocal();
			iface.setLocal(true);
		} else
			firstToken = forwardDcl.getInterface();

		// Set file location
		iface.setPos(firstToken.getPos());
		iface.setLine(firstToken.getLine());

		// Set inherited interfaces
		if (node instanceof AInterfaceDcl) {
			ArrayList superTypes = new ArrayList();
			AInterfaceDcl niface = (AInterfaceDcl) node;
			AInterfaceHeader header = (AInterfaceHeader) niface.getInterfaceHeader();
			AInterfaceInheritanceSpec supers = (AInterfaceInheritanceSpec) header
					.getInterfaceInheritanceSpec();
			if (supers != null) {
				PScopedName scopedName = supers.getScopedName();
				LinkedList scopes;
				Element type = null;
				if (scopedName instanceof AIdentifierScopedName) {
					type = findNameInContext(((AIdentifierScopedName) scopedName).getIdentifier());
				} else if (scopedName instanceof AScopedScopedName) {
					scopes = getScopes((AScopedScopedName) scopedName);
					type = findScopedNameInContext(scopes);
				}
				if (type != null)
					superTypes.add(type);

				for (Iterator i = supers.getCommaScopedName().iterator(); i.hasNext();) {
					ACommaScopedName csn = (ACommaScopedName) i.next();
					scopedName = csn.getScopedName();
					if (scopedName instanceof AIdentifierScopedName) {
						type = findNameInContext(((AIdentifierScopedName) scopedName).getIdentifier());
					} else if (scopedName instanceof AScopedScopedName) {
						scopes = getScopes((AScopedScopedName) scopedName);
						type = findScopedNameInContext(scopes);
					}
					if (type != null)
						superTypes.add(type);
				}

				// Add super types to model
				for (int i = 0; i < superTypes.size(); i++) {
					Object t = superTypes.get(i);
					if (t instanceof IdlInterfaceDcl)
						iface.getInheritedInterfaces().add(t);
					else if (file != null) {
						file.addErrorMarker(iface.getLine(), iface.getPos(), iface.getLength(),
								"Type " + ((Element) t).getName() + " is not an interface");
					}
				}
			}
		}
	}

	public void outAInterfaceDcl(AInterfaceDcl node) {
		super.outAInterfaceDcl(node);

		// Pop context
		context.removeLast();
	}

	public void inAForwardDclIdlInterface(AForwardDclIdlInterface node) {
		IdlInterfaceDcl iface = IdlFactory.eINSTANCE.createIdlInterfaceDcl();

		AForwardDcl forwardDcl = (AForwardDcl) node.getForwardDcl();
		setupInterface(node, iface, forwardDcl);

		// Add to parent
		DefinitionContainer parent = (DefinitionContainer) context.getLast();
		parent.getDefinitions().add(iface);

		// Push context
		context.addLast(iface);

		super.inAForwardDclIdlInterface(node);
	}

	public void inAExceptDcl(AExceptDcl node) {
		// Create exception
		IdlException exception = IdlFactory.eINSTANCE.createIdlException();
		exception.setName(node.getIdentifier().getText());
		exception.setLength(length(node));
		exception.setLine(node.getIdentifier().getLine());
		exception.setPos(node.getIdentifier().getPos());

		// Add exception details to model (TODO)

		// Add to parent
		DefinitionContainer parent = (DefinitionContainer) context.getLast();
		parent.getDefinitions().add(exception);

		// Register name
		if (names != null)
			names.put(IDLUtils.getScopedName(exception), exception);
		
		// Push context
		context.addLast(exception);

		super.inAExceptDcl(node);
	}

	public void outAExceptDcl(AExceptDcl node) {
		super.outAExceptDcl(node);
		context.removeLast();
	}

	public void outAForwardDclIdlInterface(AForwardDclIdlInterface node) {
		// Pop context
		context.removeLast();

		super.outAForwardDclIdlInterface(node);
	}

	public void inAEnumType(AEnumType node) {
		// Create enum
		EnumType newEnum = TypesFactory.eINSTANCE.createEnumType();
		newEnum.setName(node.getName().getText());
		newEnum.setLength(length(node));
		newEnum.setLine(node.getEnum().getLine());
		newEnum.setPos(node.getEnum().getPos());

		// Fill in enum details
		TIdentifier id = node.getIdentifier();
		newEnum.getEnumerators().add(id.getText());
		LinkedList ids = node.getCommaIdentifier();
		for (Iterator i = ids.iterator(); i.hasNext();) {
			ACommaIdentifier aci = (ACommaIdentifier) i.next();
			newEnum.getEnumerators().add(aci.getIdentifier().getText());
		}
		
		// Add to parent
		DefinitionContainer parent = (DefinitionContainer) context.getLast();
		parent.getDefinitions().add(newEnum);

		// Register name
		if (names != null)
			names.put(IDLUtils.getScopedName(newEnum), newEnum);

		super.inAEnumType(node);
	}

	public void inAStructDcl(AStructDcl node) {
		// Create struct
		Element element = findNameInContext(node.getIdentifier());
		StructType value;
		if (element instanceof StructType) {
			value = (StructType) element;
			ForwardDcl forward = IdlFactory.eINSTANCE.createForwardDcl();
			forward.setLine(value.getLine());
			forward.setPos(value.getPos());
			forward.setLength(value.getLength());
			value.setForwardDeclaration(forward);
		}
		else {
			value = TypesFactory.eINSTANCE.createStructType();

			// Add to parent
			if (!context.isEmpty() && context.getLast() instanceof DefinitionContainer) {
				DefinitionContainer parent = (DefinitionContainer) context.getLast();
				parent.getDefinitions().add(value);
			}
		}
		value.setName(node.getIdentifier().getText());
		value.setLength(length(node));
		value.setLine(node.getStruct().getLine());
		value.setPos(node.getStruct().getPos());
		
		// Register name
		if (names != null)
			names.put(IDLUtils.getScopedName(value), value);

		// Push onto stack
		context.addLast(value);

		super.inAStructDcl(node);
	}

	public void outAStructDcl(AStructDcl node) {
		// pop stack
		context.removeLast();
		super.outAStructDcl(node);
	}
	
	public void inAUnionForwardDcl(AUnionForwardDcl node) {
		UnionForwardDcl newUnion = TypesFactory.eINSTANCE.createUnionForwardDcl();

		newUnion.setName(node.getIdentifier().getText());
		newUnion.setLength(length(node));
		newUnion.setLine(node.getUnion().getLine());
		newUnion.setPos(node.getUnion().getPos());
		
		// Add to parent
		DefinitionContainer parent = (DefinitionContainer) context.getLast();
		parent.getDefinitions().add(newUnion);

		// Register name
		if (names != null)
			names.put(IDLUtils.getScopedName(newUnion), newUnion);
		
		super.inAUnionForwardDcl(node);
	}

	public void inAUnionDcl(AUnionDcl node) {
		// Create union
		UnionType newUnion = TypesFactory.eINSTANCE.createUnionType();
		newUnion.setName(node.getIdentifier().getText());
		newUnion.setLength(length(node));
		newUnion.setLine(node.getUnion().getLine());
		newUnion.setPos(node.getUnion().getPos());
		
		// Find forward dcl
		Element forwardDcl = findNameInContext(node.getIdentifier());
		if (forwardDcl instanceof UnionForwardDcl)
			newUnion.setForwardDcl((UnionForwardDcl) forwardDcl);

		/* TODO fill in type details to make union openable in model(tree) */

		// Register name
		if (names != null)
			names.put(IDLUtils.getScopedName(newUnion), newUnion);
		super.inAUnionDcl(node);
	}

	public void inASimplePositiveSequenceType(ASimplePositiveSequenceType node) {
		// Create type
		SequenceType type = TypesFactory.eINSTANCE.createSequenceType();
		type.setLength(length(node));
		type.setLine(node.getSequence().getLine());
		type.setPos(node.getSequence().getPos());

		type.setSize(evaluate(node.getOrExpr()));

		// Add to containing type def
		Object parent = context.getLast();
		if (parent instanceof TypedElement) {
			((TypedElement) parent).setType(type);
		}

		// Push context
		context.addLast(type);

		super.inASimplePositiveSequenceType(node);
	}

	private int evaluate(POrExpr orExpr) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void outASimplePositiveSequenceType(ASimplePositiveSequenceType node) {
		context.removeLast();

		super.outASimplePositiveSequenceType(node);
	}

	public void inASimpleSequenceType(ASimpleSequenceType node) {
		// Create type
		SequenceType type = TypesFactory.eINSTANCE.createSequenceType();
		type.setLength(length(node));
		type.setLine(node.getSequence().getLine());
		type.setPos(node.getSequence().getPos());

		// Add to containing type def
		Object parent = context.getLast();
		if (parent instanceof TypedElement) {
			((TypedElement) parent).setType(type);
		}

		// Push context
		context.addLast(type);

		super.inASimpleSequenceType(node);
	}

	public void outASimpleSequenceType(ASimpleSequenceType node) {

		context.removeLast();

		super.outASimpleSequenceType(node);
	}

	public void caseAVoidOpTypeSpec(AVoidOpTypeSpec node) {
		applyType(TypesFactory.eINSTANCE.createVoidType());
		super.caseAVoidOpTypeSpec(node);
	}
	
	private TypeDef createTypeDef(PDeclarator node) {
		// Create type
		TypeDef def = TypesFactory.eINSTANCE.createTypeDef();
		def.setLength(length(node));
		def.setLine(firstToken(node).getLine());
		def.setPos(firstToken(node).getPos());
	
		String name = null;
		if (node instanceof AIdentifierDeclarator) {
			name = ((AIdentifierDeclarator) node).getIdentifier().getText();
		} else if (node instanceof AArrayDeclaratorDeclarator) {
			name = firstToken(node).getText();
		}
		
		def.setName(name);
		
		return def;
	}

	public void inATypeDeclarator(ATypeDeclarator node) {

		ADeclarators declarators = (ADeclarators) node.getDeclarators();
		PDeclarator declarator = declarators.getDeclarator();
		TypeDef def = createTypeDef(declarator);
		
		// Add to parent
		((DefinitionContainer) context.getLast()).getDefinitions().add(def);
		
		// Register type
		if (names != null)
			names.put(IDLUtils.getScopedName(def), def);

		// Push context
		context.addLast(def);

		super.inATypeDeclarator(node);
	}

	public void caseATypeDeclarator(ATypeDeclarator node) {
		// Ensure types are set
		super.caseATypeDeclarator(node);
		
		if (!(context.getLast() instanceof TypeDef))
			return;
		
		ADeclarators declarators = (ADeclarators) node.getDeclarators();
		TypeDef firstDeclarator = (TypeDef) context.getLast();
		for (Iterator i = declarators.getCommaDeclarator().iterator(); i.hasNext();) {
			ACommaDeclarator declarator = (ACommaDeclarator) i.next();
			TypeDef def = createTypeDef(declarator.getDeclarator());
			
			def.setType(firstDeclarator.getType());

			((DefinitionContainer) firstDeclarator.eContainer()).getDefinitions().add(def);

			// Register type
			if (names != null)
				names.put(IDLUtils.getScopedName(def), def);
		}

		context.removeLast();
	}

	public void inAMember(AMember node) {
		// Create member
		Member member = IdlFactory.eINSTANCE.createMember();

		// Declarators
		ADeclarators declarators = (ADeclarators) node.getDeclarators();
		PDeclarator declarator = declarators.getDeclarator();
		if (declarator instanceof AIdentifierDeclarator) {
			member.setName(((AIdentifierDeclarator) declarator).getIdentifier().getText());
		} else if (declarator instanceof AArrayDeclaratorDeclarator) {
			member.setName(((AArrayDeclarator)((AArrayDeclaratorDeclarator) declarator).getArrayDeclarator()).getIdentifier().getText());
		}

		member.setLength(length(declarator));
		Token firstToken = firstToken(declarator);
		member.setLine(firstToken.getLine());
		member.setPos(firstToken.getPos());
		
		// Add to parent
		Assert.isTrue(context.getLast() instanceof MemberContainer);
		((MemberContainer) context.getLast()).getMembers().add(member);

		// Push context
		context.addLast(member);

		super.inAMember(node);
	}

	public void caseAMember(AMember node) {
		super.caseAMember(node);
		
		ADeclarators declarators = (ADeclarators) node.getDeclarators();
		
		Assert.isTrue(context.getLast() instanceof Member);
		Member firstDeclarator = (Member) context.getLast();
		for (Iterator i = declarators.getCommaDeclarator().iterator(); i.hasNext();) {
			PDeclarator declarator = ((ACommaDeclarator) i.next()).getDeclarator();
			
			// Create member
			Member member = IdlFactory.eINSTANCE.createMember();
			member.setLength(length(declarator));
			Token firstToken = firstToken(declarator);
			member.setLine(firstToken.getLine());
			member.setPos(firstToken.getPos());
			member.setType(firstDeclarator.getType());

			// Declarators
			if (declarator instanceof AIdentifierDeclarator) {
				member.setName(((AIdentifierDeclarator) declarator).getIdentifier().getText());
			} else if (declarator instanceof AArrayDeclaratorDeclarator) {
				member.setName(((AArrayDeclarator)((AArrayDeclaratorDeclarator) declarator).getArrayDeclarator()).getIdentifier().getText());
			}
			
			// Add to parent
			((MemberContainer) firstDeclarator.eContainer()).getMembers().add(member);
		}
		
		context.removeLast();
	}

	public void inAParamDcl(AParamDcl node) {
		// Create parameter
		Parameter parameter = OperationsFactory.eINSTANCE.createParameter();
		parameter.setLength(length(node));

		// Typespec
		// Added by traversal of child type node

		Token token = firstToken(node);
		parameter.setLine(token.getLine());
		parameter.setPos(token.getPos());
		parameter.setName(firstToken(node.getDeclarator()).getText());
		
		Direction direction = Direction.IN_LITERAL;
		if (node.getParamAttribute() instanceof AOutParamAttribute)
			direction = Direction.OUT_LITERAL;
		else if (node.getParamAttribute() instanceof AInoutParamAttribute)
			direction = Direction.INOUT_LITERAL;
		parameter.setDirection(direction);

		// Add to parent
		Assert.isTrue(!context.isEmpty() && context.getLast() instanceof Operation);
		((Operation) context.getLast()).getParameters().add(parameter);

		// Push context
		context.addLast(parameter);

		super.inAParamDcl(node);
	}

	public void outAParamDcl(AParamDcl node) {
		Assert.isTrue(context.getLast() instanceof Parameter);
		// Pop context
		context.removeLast();
		super.outAParamDcl(node);
	}

	private Token firstToken(Node root) {
		FirstTokenFinder tokenFinder = new FirstTokenFinder();
		root.apply(tokenFinder);
		return tokenFinder.getToken();
	}

	public void caseABooleanBaseTypeSpec(ABooleanBaseTypeSpec node) {
		applyType(PrimitiveTypes._boolean);
		super.caseABooleanBaseTypeSpec(node);
	}

	public void caseACharBaseTypeSpec(ACharBaseTypeSpec node) {
		applyType(PrimitiveTypes._char);
		super.caseACharBaseTypeSpec(node);
	}

	public void caseAFixedTemplateTypeSpec(AFixedTemplateTypeSpec node) {
		// TODO Add fixed type to model
		super.caseAFixedTemplateTypeSpec(node);
	}

	public void caseAFloatBaseTypeSpec(AFloatBaseTypeSpec node) {
		applyType(PrimitiveTypes._float);
		super.caseAFloatBaseTypeSpec(node);
	}

	public void caseALongBaseTypeSpec(ALongBaseTypeSpec node) {
		applyType(PrimitiveTypes._long);
		super.caseALongBaseTypeSpec(node);
	}

	public void caseALonglongBaseTypeSpec(ALonglongBaseTypeSpec node) {
		applyType(PrimitiveTypes.longLong);
		super.caseALonglongBaseTypeSpec(node);
	}

	public void caseAOctetBaseTypeSpec(AOctetBaseTypeSpec node) {
		applyType(PrimitiveTypes.octet);
		super.caseAOctetBaseTypeSpec(node);
	}

	public void caseAScopedNameSimpleTypeSpec(AScopedNameSimpleTypeSpec node) {
		PScopedName scopedName = node.getScopedName();
		if (scopedName instanceof AIdentifierScopedName) {
			AIdentifierScopedName identifierScopedName = (AIdentifierScopedName) scopedName;
			TIdentifier identifier = identifierScopedName.getIdentifier();
			applyType(resolveType(identifier));
		} else if (scopedName instanceof AScopedScopedName) {
			AScopedScopedName ssname = (AScopedScopedName) scopedName;
			applyType(resolveType(ssname));
		}
		super.caseAScopedNameSimpleTypeSpec(node);
	}

	private Element resolveType(TIdentifier id) {
		Element type = findNameInContext(id);
		if (type == null && file != null) {
			// Add error marker to file
			file.addErrorMarker(id.getLine(), id.getPos(), id.getText().length(), "Type "
					+ id.getText() + " is undefined");
		}
		return type;
	}

	public void caseAShortBaseTypeSpec(AShortBaseTypeSpec node) {
		applyType(PrimitiveTypes._short);
		super.caseAShortBaseTypeSpec(node);
	}

	public void caseAStringTemplateTypeSpec(AStringTemplateTypeSpec node) {
		applyType(PrimitiveTypes.string); // FIXME: not all strings are the
		// same
		super.caseAStringTemplateTypeSpec(node);
	}

	public void caseAUlonglongBaseTypeSpec(AUlonglongBaseTypeSpec node) {
		applyType(PrimitiveTypes.ulonglong);
		super.caseAUlonglongBaseTypeSpec(node);
	}

	public void caseAUshortBaseTypeSpec(AUshortBaseTypeSpec node) {
		applyType(PrimitiveTypes.ushort);
		super.caseAUshortBaseTypeSpec(node);
	}

	public void caseAValuebaseBaseTypeSpec(AValuebaseBaseTypeSpec node) {
		// TODO Add this type to the model
		super.caseAValuebaseBaseTypeSpec(node);
	}

	public void caseAWcharBaseTypeSpec(AWcharBaseTypeSpec node) {
		applyType(PrimitiveTypes.wchar);
		super.caseAWcharBaseTypeSpec(node);
	}

	public void caseAWstringTemplateTypeSpec(AWstringTemplateTypeSpec node) {
		applyType(PrimitiveTypes.wstring);
		super.caseAWstringTemplateTypeSpec(node);
	}

	public void caseAStringParamTypeSpec(AStringParamTypeSpec node) {
		applyType(PrimitiveTypes.string); // FIXME: not all strings are the
		// same
		super.caseAStringParamTypeSpec(node);
	}

	public void caseAUlongBaseTypeSpec(AUlongBaseTypeSpec node) {
		applyType(PrimitiveTypes.ulong);
		super.caseAUlongBaseTypeSpec(node);
	}

	public void setMacros(HashMap macros) {
		this.macros = macros;
	}

	public void inAAttrDcl(AAttrDcl node) {
		Attribute attribute = OperationsFactory.eINSTANCE.createAttribute();
		
		Token firstToken = firstToken(node);
		attribute.setLine(firstToken.getLine());
		attribute.setPos(firstToken.getPos());
		attribute.setLength(length(node));
		
		attribute.setName(node.getIdentifier().getText());
		attribute.setReadOnly(node.getReadonly() != null);
		
		ExportContainer parent = (ExportContainer) context.getLast();
		parent.getBody().add(attribute);
		
		context.addLast(attribute);
		
		super.inAAttrDcl(node);
	}
	
	public void caseAAttrDcl(AAttrDcl node) {
		// Ensure type is processed
		super.caseAAttrDcl(node);
		
		// Add attributes for rest of identifiers
		for (int i = 0; i < node.getCommaIdentifier().size(); i++) {
			ACommaIdentifier id = (ACommaIdentifier)node.getCommaIdentifier().get(i);
			
			Attribute attribute = OperationsFactory.eINSTANCE.createAttribute();
			
			Token firstToken = firstToken(id);
			attribute.setLine(firstToken.getLine());
			attribute.setPos(firstToken.getPos());
			attribute.setLength(id.toString().length());
			
			Attribute firstAttribute = (Attribute) context.getLast();
			attribute.setType(firstAttribute.getType());

			attribute.setName(id.getIdentifier().getText());
			
			((ExportContainer)firstAttribute.eContainer()).getBody().add(attribute);
		}
	}

	public void outAAttrDcl(AAttrDcl node) {
		super.inAAttrDcl(node);
		
		context.removeLast();
	}

	public void caseAConstDcl(AConstDcl node) {
		// TODO: add direct support for constants to model
		super.caseAConstDcl(node);
	}

	public ArrayList getErrors() {
		return errors;
	}

	public void inAStructForwardDcl(AStructForwardDcl node) {
		StructType value = TypesFactory.eINSTANCE.createStructType();
		
		Token firstToken = firstToken(node);
		value.setLine(firstToken.getLine());
		value.setPos(firstToken.getPos());
		value.setLength(length(node));
		
		value.setName(node.getIdentifier().getText());
		
		Assert.isTrue(!context.isEmpty() && context.getLast() instanceof DefinitionContainer);
		DefinitionContainer parent = (DefinitionContainer) context.getLast();
		parent.getDefinitions().add(value);
		
		context.addLast(value);
		super.inAStructForwardDcl(node);
	}

	public void outAStructForwardDcl(AStructForwardDcl node) {
		Assert.isTrue(context.getLast() instanceof StructType);
		context.removeLast();
		super.outAStructForwardDcl(node);
	}

	public void inAValueDcl(AValueDcl node) {
		AValueHeader header = (AValueHeader) node.getValueHeader();
		TIdentifier identifier = header.getIdentifier();
		createValueType(node, identifier);
		
		super.inAValueDcl(node);
	}
	
	public void outAValueDcl(AValueDcl node) {
		Assert.isTrue(context.getLast() instanceof ValueType);
		context.removeLast();
		super.outAValueDcl(node);
	}

	public void inAValueForwardDcl(AValueForwardDcl node) {
		ValueType value = IdlFactory.eINSTANCE.createValueType();
		
		Token firstToken = firstToken(node);
		value.setLine(firstToken.getLine());
		value.setPos(firstToken.getPos());
		value.setLength(length(node));
		
		value.setName(node.getIdentifier().getText());

		Assert.isTrue(!context.isEmpty() && context.getLast() instanceof DefinitionContainer);
		DefinitionContainer parent = (DefinitionContainer) context.getLast();
		parent.getDefinitions().add(value);
		
		context.addLast(value);
		super.inAValueForwardDcl(node);
	}

	public void outAValueForwardDcl(AValueForwardDcl node) {
		Assert.isTrue(context.getLast() instanceof ValueType);
		context.removeLast();
		super.outAValueForwardDcl(node);
	}

	public void inAValueAbsDcl(AValueAbsDcl node) {
		TIdentifier identifier = node.getIdentifier();
		ValueType value = createValueType(node, identifier);
		value.setAbstract(true);
		super.inAValueAbsDcl(node);
	}
	
	public void outAValueAbsDcl(AValueAbsDcl node) {
		Assert.isTrue(context.getLast() instanceof ValueType);
		context.removeLast();
		super.outAValueAbsDcl(node);
	}

	private ValueType createValueType(Node node, TIdentifier identifier) {
		// Create valuetype
		ValueType value = IdlFactory.eINSTANCE.createValueType();
		
		// Set location
		Token firstToken = firstToken(node);
		value.setLine(firstToken.getLine());
		value.setPos(firstToken.getPos());
		value.setLength(length(node));
		
		value.setName(identifier.getText());

		// Find forward declaration
		Element fd = findNameInContext(identifier);

		// Add to parent
		Assert.isTrue(!context.isEmpty() && context.getLast() instanceof DefinitionContainer);
		DefinitionContainer parent = (DefinitionContainer) context.getLast();
		parent.getDefinitions().add(value);

		List scopedName = IDLUtils.getScopedName(value);
		if (fd instanceof ForwardDcl && IDLUtils.getScopedName((ForwardDcl)fd).equals(scopedName))
			value.setForwardDcl((ForwardDcl) fd);
		
		if (names != null)
			names.put(scopedName, value);
		
		context.addLast(value);
		return value;
	}

	public void inAValueBoxDcl(AValueBoxDcl node) {
		TIdentifier identifier = node.getIdentifier();
		ValueType value = createValueType(node, identifier);
		super.inAValueBoxDcl(node);
	}
	
	public void outAValueBoxDcl(AValueBoxDcl node) {
		Assert.isTrue(context.getLast() instanceof ValueType);
		context.removeLast();
		super.outAValueBoxDcl(node);
	}
}
