/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.util;

import java.util.List;

import net.sf.eclipsecorba.idl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.eclipsecorba.idl.IdlPackage
 * @generated
 */
public class IdlSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlSwitch() {
		if (modelPackage == null) {
			modelPackage = IdlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IdlPackage.FILE_REGION: {
				FileRegion fileRegion = (FileRegion)theEObject;
				Object result = caseFileRegion(fileRegion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				Object result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				Object result = caseSpecification(specification);
				if (result == null) result = caseDefinitionContainer(specification);
				if (result == null) result = caseFileRegion(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				Object result = caseDefinition(definition);
				if (result == null) result = caseElement(definition);
				if (result == null) result = caseCommentable(definition);
				if (result == null) result = caseIdentifiable(definition);
				if (result == null) result = caseFileRegion(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.DEFINITION_CONTAINER: {
				DefinitionContainer definitionContainer = (DefinitionContainer)theEObject;
				Object result = caseDefinitionContainer(definitionContainer);
				if (result == null) result = caseFileRegion(definitionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.ELEMENT: {
				Element element = (Element)theEObject;
				Object result = caseElement(element);
				if (result == null) result = caseIdentifiable(element);
				if (result == null) result = caseFileRegion(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.DECLARATOR: {
				Declarator declarator = (Declarator)theEObject;
				Object result = caseDeclarator(declarator);
				if (result == null) result = caseElement(declarator);
				if (result == null) result = caseIdentifiable(declarator);
				if (result == null) result = caseFileRegion(declarator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				Object result = caseTypedElement(typedElement);
				if (result == null) result = caseElement(typedElement);
				if (result == null) result = caseTyped(typedElement);
				if (result == null) result = caseIdentifiable(typedElement);
				if (result == null) result = caseFileRegion(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.TYPED: {
				Typed typed = (Typed)theEObject;
				Object result = caseTyped(typed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.MODULE: {
				Module module = (Module)theEObject;
				Object result = caseModule(module);
				if (result == null) result = caseDefinition(module);
				if (result == null) result = caseDefinitionContainer(module);
				if (result == null) result = caseElement(module);
				if (result == null) result = caseCommentable(module);
				if (result == null) result = caseFileRegion(module);
				if (result == null) result = caseIdentifiable(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.IDL_CONST_DCL: {
				IdlConstDcl idlConstDcl = (IdlConstDcl)theEObject;
				Object result = caseIdlConstDcl(idlConstDcl);
				if (result == null) result = caseTypedElement(idlConstDcl);
				if (result == null) result = caseDefinition(idlConstDcl);
				if (result == null) result = caseExport(idlConstDcl);
				if (result == null) result = caseElement(idlConstDcl);
				if (result == null) result = caseTyped(idlConstDcl);
				if (result == null) result = caseCommentable(idlConstDcl);
				if (result == null) result = caseIdentifiable(idlConstDcl);
				if (result == null) result = caseFileRegion(idlConstDcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.IDL_EXCEPTION: {
				IdlException idlException = (IdlException)theEObject;
				Object result = caseIdlException(idlException);
				if (result == null) result = caseDefinition(idlException);
				if (result == null) result = caseExport(idlException);
				if (result == null) result = caseMemberContainer(idlException);
				if (result == null) result = caseElement(idlException);
				if (result == null) result = caseCommentable(idlException);
				if (result == null) result = caseTypedElement(idlException);
				if (result == null) result = caseIdentifiable(idlException);
				if (result == null) result = caseFileRegion(idlException);
				if (result == null) result = caseTyped(idlException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.MEMBER: {
				Member member = (Member)theEObject;
				Object result = caseMember(member);
				if (result == null) result = caseTypedElement(member);
				if (result == null) result = caseCommentable(member);
				if (result == null) result = caseElement(member);
				if (result == null) result = caseTyped(member);
				if (result == null) result = caseIdentifiable(member);
				if (result == null) result = caseFileRegion(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.MEMBER_CONTAINER: {
				MemberContainer memberContainer = (MemberContainer)theEObject;
				Object result = caseMemberContainer(memberContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.FORWARD_DCL: {
				ForwardDcl forwardDcl = (ForwardDcl)theEObject;
				Object result = caseForwardDcl(forwardDcl);
				if (result == null) result = caseIdlTypeDcl(forwardDcl);
				if (result == null) result = caseDefinition(forwardDcl);
				if (result == null) result = caseIdlType(forwardDcl);
				if (result == null) result = caseExport(forwardDcl);
				if (result == null) result = caseElement(forwardDcl);
				if (result == null) result = caseCommentable(forwardDcl);
				if (result == null) result = caseFileRegion(forwardDcl);
				if (result == null) result = caseTypedElement(forwardDcl);
				if (result == null) result = caseIdentifiable(forwardDcl);
				if (result == null) result = caseTyped(forwardDcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.IDL_INTERFACE_DCL: {
				IdlInterfaceDcl idlInterfaceDcl = (IdlInterfaceDcl)theEObject;
				Object result = caseIdlInterfaceDcl(idlInterfaceDcl);
				if (result == null) result = caseIdlTypeDcl(idlInterfaceDcl);
				if (result == null) result = caseDefinitionContainer(idlInterfaceDcl);
				if (result == null) result = caseExportContainer(idlInterfaceDcl);
				if (result == null) result = caseDefinition(idlInterfaceDcl);
				if (result == null) result = caseIdlType(idlInterfaceDcl);
				if (result == null) result = caseExport(idlInterfaceDcl);
				if (result == null) result = caseFileRegion(idlInterfaceDcl);
				if (result == null) result = caseElement(idlInterfaceDcl);
				if (result == null) result = caseCommentable(idlInterfaceDcl);
				if (result == null) result = caseTypedElement(idlInterfaceDcl);
				if (result == null) result = caseIdentifiable(idlInterfaceDcl);
				if (result == null) result = caseTyped(idlInterfaceDcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.EXPORT: {
				Export export = (Export)theEObject;
				Object result = caseExport(export);
				if (result == null) result = caseTypedElement(export);
				if (result == null) result = caseElement(export);
				if (result == null) result = caseTyped(export);
				if (result == null) result = caseIdentifiable(export);
				if (result == null) result = caseFileRegion(export);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.IDL_TYPE: {
				IdlType idlType = (IdlType)theEObject;
				Object result = caseIdlType(idlType);
				if (result == null) result = caseFileRegion(idlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.IDL_TYPE_DCL: {
				IdlTypeDcl idlTypeDcl = (IdlTypeDcl)theEObject;
				Object result = caseIdlTypeDcl(idlTypeDcl);
				if (result == null) result = caseDefinition(idlTypeDcl);
				if (result == null) result = caseIdlType(idlTypeDcl);
				if (result == null) result = caseExport(idlTypeDcl);
				if (result == null) result = caseElement(idlTypeDcl);
				if (result == null) result = caseCommentable(idlTypeDcl);
				if (result == null) result = caseFileRegion(idlTypeDcl);
				if (result == null) result = caseTypedElement(idlTypeDcl);
				if (result == null) result = caseIdentifiable(idlTypeDcl);
				if (result == null) result = caseTyped(idlTypeDcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.COMMENTABLE: {
				Commentable commentable = (Commentable)theEObject;
				Object result = caseCommentable(commentable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				Object result = caseValueType(valueType);
				if (result == null) result = caseMemberContainer(valueType);
				if (result == null) result = caseIdlInterfaceDcl(valueType);
				if (result == null) result = caseIdlTypeDcl(valueType);
				if (result == null) result = caseDefinitionContainer(valueType);
				if (result == null) result = caseExportContainer(valueType);
				if (result == null) result = caseDefinition(valueType);
				if (result == null) result = caseIdlType(valueType);
				if (result == null) result = caseExport(valueType);
				if (result == null) result = caseFileRegion(valueType);
				if (result == null) result = caseElement(valueType);
				if (result == null) result = caseCommentable(valueType);
				if (result == null) result = caseTypedElement(valueType);
				if (result == null) result = caseIdentifiable(valueType);
				if (result == null) result = caseTyped(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.EXPORT_CONTAINER: {
				ExportContainer exportContainer = (ExportContainer)theEObject;
				Object result = caseExportContainer(exportContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IdlPackage.VALUE_FORWARD_DCL: {
				ValueForwardDcl valueForwardDcl = (ValueForwardDcl)theEObject;
				Object result = caseValueForwardDcl(valueForwardDcl);
				if (result == null) result = caseForwardDcl(valueForwardDcl);
				if (result == null) result = caseIdlTypeDcl(valueForwardDcl);
				if (result == null) result = caseDefinition(valueForwardDcl);
				if (result == null) result = caseIdlType(valueForwardDcl);
				if (result == null) result = caseExport(valueForwardDcl);
				if (result == null) result = caseElement(valueForwardDcl);
				if (result == null) result = caseCommentable(valueForwardDcl);
				if (result == null) result = caseFileRegion(valueForwardDcl);
				if (result == null) result = caseTypedElement(valueForwardDcl);
				if (result == null) result = caseIdentifiable(valueForwardDcl);
				if (result == null) result = caseTyped(valueForwardDcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileRegion(FileRegion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefinitionContainer(DefinitionContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeclarator(Declarator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTyped(Typed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Const Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Const Dcl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdlConstDcl(IdlConstDcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdlException(IdlException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMemberContainer(MemberContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward Dcl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForwardDcl(ForwardDcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Dcl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdlInterfaceDcl(IdlInterfaceDcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExport(Export object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdlType(IdlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Dcl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdlTypeDcl(IdlTypeDcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommentable(Commentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExportContainer(ExportContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Forward Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Forward Dcl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueForwardDcl(ValueForwardDcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //IdlSwitch
