/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types.util;

import java.util.List;

import net.sf.eclipsecorba.idl.Commentable;
import net.sf.eclipsecorba.idl.Definition;
import net.sf.eclipsecorba.idl.Element;
import net.sf.eclipsecorba.idl.Export;
import net.sf.eclipsecorba.idl.FileRegion;
import net.sf.eclipsecorba.idl.Identifiable;
import net.sf.eclipsecorba.idl.IdlType;
import net.sf.eclipsecorba.idl.IdlTypeDcl;
import net.sf.eclipsecorba.idl.MemberContainer;
import net.sf.eclipsecorba.idl.Typed;
import net.sf.eclipsecorba.idl.TypedElement;

import net.sf.eclipsecorba.idl.types.Any;
import net.sf.eclipsecorba.idl.types.EnumType;
import net.sf.eclipsecorba.idl.types.IdlChar;
import net.sf.eclipsecorba.idl.types.IdlString;
import net.sf.eclipsecorba.idl.types.LongDouble;
import net.sf.eclipsecorba.idl.types.LongLong;
import net.sf.eclipsecorba.idl.types.Octet;
import net.sf.eclipsecorba.idl.types.PrimitiveType;
import net.sf.eclipsecorba.idl.types.SequenceType;
import net.sf.eclipsecorba.idl.types.StructForwardDcl;
import net.sf.eclipsecorba.idl.types.StructType;
import net.sf.eclipsecorba.idl.types.TemplateType;
import net.sf.eclipsecorba.idl.types.TypeDef;
import net.sf.eclipsecorba.idl.types.TypesPackage;
import net.sf.eclipsecorba.idl.types.ULong;
import net.sf.eclipsecorba.idl.types.ULongLong;
import net.sf.eclipsecorba.idl.types.UShort;
import net.sf.eclipsecorba.idl.types.UnionForwardDcl;
import net.sf.eclipsecorba.idl.types.UnionType;
import net.sf.eclipsecorba.idl.types.VoidType;
import net.sf.eclipsecorba.idl.types.WChar;
import net.sf.eclipsecorba.idl.types.WString;

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
 * @see net.sf.eclipsecorba.idl.types.TypesPackage
 * @generated
 */
public class TypesSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesSwitch() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
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
			case TypesPackage.TYPE_DEF: {
				TypeDef typeDef = (TypeDef)theEObject;
				Object result = caseTypeDef(typeDef);
				if (result == null) result = caseTypedElement(typeDef);
				if (result == null) result = caseIdlTypeDcl(typeDef);
				if (result == null) result = caseElement(typeDef);
				if (result == null) result = caseTyped(typeDef);
				if (result == null) result = caseDefinition(typeDef);
				if (result == null) result = caseIdlType(typeDef);
				if (result == null) result = caseExport(typeDef);
				if (result == null) result = caseIdentifiable(typeDef);
				if (result == null) result = caseFileRegion(typeDef);
				if (result == null) result = caseCommentable(typeDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.VOID_TYPE: {
				VoidType voidType = (VoidType)theEObject;
				Object result = caseVoidType(voidType);
				if (result == null) result = caseIdlType(voidType);
				if (result == null) result = caseFileRegion(voidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UNION_TYPE: {
				UnionType unionType = (UnionType)theEObject;
				Object result = caseUnionType(unionType);
				if (result == null) result = caseIdlTypeDcl(unionType);
				if (result == null) result = caseDefinition(unionType);
				if (result == null) result = caseIdlType(unionType);
				if (result == null) result = caseExport(unionType);
				if (result == null) result = caseElement(unionType);
				if (result == null) result = caseCommentable(unionType);
				if (result == null) result = caseFileRegion(unionType);
				if (result == null) result = caseTypedElement(unionType);
				if (result == null) result = caseIdentifiable(unionType);
				if (result == null) result = caseTyped(unionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ENUM_TYPE: {
				EnumType enumType = (EnumType)theEObject;
				Object result = caseEnumType(enumType);
				if (result == null) result = caseIdlTypeDcl(enumType);
				if (result == null) result = caseDefinition(enumType);
				if (result == null) result = caseIdlType(enumType);
				if (result == null) result = caseExport(enumType);
				if (result == null) result = caseElement(enumType);
				if (result == null) result = caseCommentable(enumType);
				if (result == null) result = caseFileRegion(enumType);
				if (result == null) result = caseTypedElement(enumType);
				if (result == null) result = caseIdentifiable(enumType);
				if (result == null) result = caseTyped(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCT_TYPE: {
				StructType structType = (StructType)theEObject;
				Object result = caseStructType(structType);
				if (result == null) result = caseIdlTypeDcl(structType);
				if (result == null) result = caseMemberContainer(structType);
				if (result == null) result = caseDefinition(structType);
				if (result == null) result = caseIdlType(structType);
				if (result == null) result = caseExport(structType);
				if (result == null) result = caseElement(structType);
				if (result == null) result = caseCommentable(structType);
				if (result == null) result = caseFileRegion(structType);
				if (result == null) result = caseTypedElement(structType);
				if (result == null) result = caseIdentifiable(structType);
				if (result == null) result = caseTyped(structType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.TEMPLATE_TYPE: {
				TemplateType templateType = (TemplateType)theEObject;
				Object result = caseTemplateType(templateType);
				if (result == null) result = caseIdlType(templateType);
				if (result == null) result = caseFileRegion(templateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				Object result = caseSequenceType(sequenceType);
				if (result == null) result = caseTemplateType(sequenceType);
				if (result == null) result = caseTyped(sequenceType);
				if (result == null) result = caseIdlType(sequenceType);
				if (result == null) result = caseFileRegion(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.IDL_STRING: {
				IdlString idlString = (IdlString)theEObject;
				Object result = caseIdlString(idlString);
				if (result == null) result = caseTemplateType(idlString);
				if (result == null) result = caseIdlType(idlString);
				if (result == null) result = caseFileRegion(idlString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WSTRING: {
				WString wString = (WString)theEObject;
				Object result = caseWString(wString);
				if (result == null) result = caseTemplateType(wString);
				if (result == null) result = caseIdlType(wString);
				if (result == null) result = caseFileRegion(wString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				Object result = casePrimitiveType(primitiveType);
				if (result == null) result = caseIdlType(primitiveType);
				if (result == null) result = caseFileRegion(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.SHORT: {
				net.sf.eclipsecorba.idl.types.Short short_ = (net.sf.eclipsecorba.idl.types.Short)theEObject;
				Object result = caseShort(short_);
				if (result == null) result = casePrimitiveType(short_);
				if (result == null) result = caseIdlType(short_);
				if (result == null) result = caseFileRegion(short_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LONG: {
				net.sf.eclipsecorba.idl.types.Long long_ = (net.sf.eclipsecorba.idl.types.Long)theEObject;
				Object result = caseLong(long_);
				if (result == null) result = casePrimitiveType(long_);
				if (result == null) result = caseIdlType(long_);
				if (result == null) result = caseFileRegion(long_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.OCTET: {
				Octet octet = (Octet)theEObject;
				Object result = caseOctet(octet);
				if (result == null) result = casePrimitiveType(octet);
				if (result == null) result = caseIdlType(octet);
				if (result == null) result = caseFileRegion(octet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.FLOAT: {
				net.sf.eclipsecorba.idl.types.Float float_ = (net.sf.eclipsecorba.idl.types.Float)theEObject;
				Object result = caseFloat(float_);
				if (result == null) result = casePrimitiveType(float_);
				if (result == null) result = caseIdlType(float_);
				if (result == null) result = caseFileRegion(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.DOUBLE: {
				net.sf.eclipsecorba.idl.types.Double double_ = (net.sf.eclipsecorba.idl.types.Double)theEObject;
				Object result = caseDouble(double_);
				if (result == null) result = casePrimitiveType(double_);
				if (result == null) result = caseIdlType(double_);
				if (result == null) result = caseFileRegion(double_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.IDL_CHAR: {
				IdlChar idlChar = (IdlChar)theEObject;
				Object result = caseIdlChar(idlChar);
				if (result == null) result = casePrimitiveType(idlChar);
				if (result == null) result = caseIdlType(idlChar);
				if (result == null) result = caseFileRegion(idlChar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.WCHAR: {
				WChar wChar = (WChar)theEObject;
				Object result = caseWChar(wChar);
				if (result == null) result = casePrimitiveType(wChar);
				if (result == null) result = caseIdlType(wChar);
				if (result == null) result = caseFileRegion(wChar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.BOOLEAN: {
				net.sf.eclipsecorba.idl.types.Boolean boolean_ = (net.sf.eclipsecorba.idl.types.Boolean)theEObject;
				Object result = caseBoolean(boolean_);
				if (result == null) result = casePrimitiveType(boolean_);
				if (result == null) result = caseIdlType(boolean_);
				if (result == null) result = caseFileRegion(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LONG_LONG: {
				LongLong longLong = (LongLong)theEObject;
				Object result = caseLongLong(longLong);
				if (result == null) result = casePrimitiveType(longLong);
				if (result == null) result = caseIdlType(longLong);
				if (result == null) result = caseFileRegion(longLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.LONG_DOUBLE: {
				LongDouble longDouble = (LongDouble)theEObject;
				Object result = caseLongDouble(longDouble);
				if (result == null) result = casePrimitiveType(longDouble);
				if (result == null) result = caseIdlType(longDouble);
				if (result == null) result = caseFileRegion(longDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.USHORT: {
				UShort uShort = (UShort)theEObject;
				Object result = caseUShort(uShort);
				if (result == null) result = casePrimitiveType(uShort);
				if (result == null) result = caseIdlType(uShort);
				if (result == null) result = caseFileRegion(uShort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ULONG: {
				ULong uLong = (ULong)theEObject;
				Object result = caseULong(uLong);
				if (result == null) result = casePrimitiveType(uLong);
				if (result == null) result = caseIdlType(uLong);
				if (result == null) result = caseFileRegion(uLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ULONG_LONG: {
				ULongLong uLongLong = (ULongLong)theEObject;
				Object result = caseULongLong(uLongLong);
				if (result == null) result = casePrimitiveType(uLongLong);
				if (result == null) result = caseIdlType(uLongLong);
				if (result == null) result = caseFileRegion(uLongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.ANY: {
				Any any = (Any)theEObject;
				Object result = caseAny(any);
				if (result == null) result = casePrimitiveType(any);
				if (result == null) result = caseIdlType(any);
				if (result == null) result = caseFileRegion(any);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.UNION_FORWARD_DCL: {
				UnionForwardDcl unionForwardDcl = (UnionForwardDcl)theEObject;
				Object result = caseUnionForwardDcl(unionForwardDcl);
				if (result == null) result = caseIdlTypeDcl(unionForwardDcl);
				if (result == null) result = caseDefinition(unionForwardDcl);
				if (result == null) result = caseIdlType(unionForwardDcl);
				if (result == null) result = caseExport(unionForwardDcl);
				if (result == null) result = caseElement(unionForwardDcl);
				if (result == null) result = caseCommentable(unionForwardDcl);
				if (result == null) result = caseFileRegion(unionForwardDcl);
				if (result == null) result = caseTypedElement(unionForwardDcl);
				if (result == null) result = caseIdentifiable(unionForwardDcl);
				if (result == null) result = caseTyped(unionForwardDcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypesPackage.STRUCT_FORWARD_DCL: {
				StructForwardDcl structForwardDcl = (StructForwardDcl)theEObject;
				Object result = caseStructForwardDcl(structForwardDcl);
				if (result == null) result = caseIdlTypeDcl(structForwardDcl);
				if (result == null) result = caseDefinition(structForwardDcl);
				if (result == null) result = caseIdlType(structForwardDcl);
				if (result == null) result = caseExport(structForwardDcl);
				if (result == null) result = caseElement(structForwardDcl);
				if (result == null) result = caseCommentable(structForwardDcl);
				if (result == null) result = caseFileRegion(structForwardDcl);
				if (result == null) result = caseTypedElement(structForwardDcl);
				if (result == null) result = caseIdentifiable(structForwardDcl);
				if (result == null) result = caseTyped(structForwardDcl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeDef(TypeDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVoidType(VoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnionType(UnionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumType(EnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructType(StructType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTemplateType(TemplateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idl String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idl String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdlString(IdlString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WString</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WString</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWString(WString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Short</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseShort(net.sf.eclipsecorba.idl.types.Short object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLong(net.sf.eclipsecorba.idl.types.Long object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOctet(Octet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFloat(net.sf.eclipsecorba.idl.types.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDouble(net.sf.eclipsecorba.idl.types.Double object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Idl Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idl Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdlChar(IdlChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WChar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WChar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWChar(WChar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBoolean(net.sf.eclipsecorba.idl.types.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLongLong(LongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLongDouble(LongDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UShort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UShort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUShort(UShort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ULong</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ULong</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseULong(ULong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ULong Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ULong Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseULongLong(ULongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAny(Any object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Forward Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Forward Dcl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnionForwardDcl(UnionForwardDcl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Forward Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Forward Dcl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructForwardDcl(StructForwardDcl object) {
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

} //TypesSwitch
