/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.eclipsecorba.idl.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = net.sf.eclipsecorba.idl.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Def</em>'.
	 * @generated
	 */
	TypeDef createTypeDef();

	/**
	 * Returns a new object of class '<em>Void Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Void Type</em>'.
	 * @generated
	 */
	VoidType createVoidType();

	/**
	 * Returns a new object of class '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Type</em>'.
	 * @generated
	 */
	UnionType createUnionType();

	/**
	 * Returns a new object of class '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Type</em>'.
	 * @generated
	 */
	EnumType createEnumType();

	/**
	 * Returns a new object of class '<em>Struct Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Type</em>'.
	 * @generated
	 */
	StructType createStructType();

	/**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
	SequenceType createSequenceType();

	/**
	 * Returns a new object of class '<em>Idl String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Idl String</em>'.
	 * @generated
	 */
	IdlString createIdlString();

	/**
	 * Returns a new object of class '<em>WString</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WString</em>'.
	 * @generated
	 */
	WString createWString();

	/**
	 * Returns a new object of class '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Type</em>'.
	 * @generated
	 */
	PrimitiveType createPrimitiveType();

	/**
	 * Returns a new object of class '<em>Short</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Short</em>'.
	 * @generated
	 */
	net.sf.eclipsecorba.idl.types.Short createShort();

	/**
	 * Returns a new object of class '<em>Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long</em>'.
	 * @generated
	 */
	net.sf.eclipsecorba.idl.types.Long createLong();

	/**
	 * Returns a new object of class '<em>Octet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Octet</em>'.
	 * @generated
	 */
	Octet createOctet();

	/**
	 * Returns a new object of class '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float</em>'.
	 * @generated
	 */
	net.sf.eclipsecorba.idl.types.Float createFloat();

	/**
	 * Returns a new object of class '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double</em>'.
	 * @generated
	 */
	net.sf.eclipsecorba.idl.types.Double createDouble();

	/**
	 * Returns a new object of class '<em>Idl Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Idl Char</em>'.
	 * @generated
	 */
	IdlChar createIdlChar();

	/**
	 * Returns a new object of class '<em>WChar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WChar</em>'.
	 * @generated
	 */
	WChar createWChar();

	/**
	 * Returns a new object of class '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean</em>'.
	 * @generated
	 */
	net.sf.eclipsecorba.idl.types.Boolean createBoolean();

	/**
	 * Returns a new object of class '<em>Long Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Long</em>'.
	 * @generated
	 */
	LongLong createLongLong();

	/**
	 * Returns a new object of class '<em>Long Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Double</em>'.
	 * @generated
	 */
	LongDouble createLongDouble();

	/**
	 * Returns a new object of class '<em>UShort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UShort</em>'.
	 * @generated
	 */
	UShort createUShort();

	/**
	 * Returns a new object of class '<em>ULong</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ULong</em>'.
	 * @generated
	 */
	ULong createULong();

	/**
	 * Returns a new object of class '<em>ULong Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ULong Long</em>'.
	 * @generated
	 */
	ULongLong createULongLong();

	/**
	 * Returns a new object of class '<em>Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any</em>'.
	 * @generated
	 */
	Any createAny();

	/**
	 * Returns a new object of class '<em>Union Forward Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Forward Dcl</em>'.
	 * @generated
	 */
	UnionForwardDcl createUnionForwardDcl();

	/**
	 * Returns a new object of class '<em>Struct Forward Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struct Forward Dcl</em>'.
	 * @generated
	 */
	StructForwardDcl createStructForwardDcl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
