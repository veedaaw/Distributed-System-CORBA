/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.eclipsecorba.idl.IdlPackage
 * @generated
 */
public interface IdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlFactory eINSTANCE = net.sf.eclipsecorba.idl.impl.IdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>Declarator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declarator</em>'.
	 * @generated
	 */
	Declarator createDeclarator();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Const Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Const Dcl</em>'.
	 * @generated
	 */
	IdlConstDcl createIdlConstDcl();

	/**
	 * Returns a new object of class '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception</em>'.
	 * @generated
	 */
	IdlException createIdlException();

	/**
	 * Returns a new object of class '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member</em>'.
	 * @generated
	 */
	Member createMember();

	/**
	 * Returns a new object of class '<em>Forward Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forward Dcl</em>'.
	 * @generated
	 */
	ForwardDcl createForwardDcl();

	/**
	 * Returns a new object of class '<em>Interface Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Dcl</em>'.
	 * @generated
	 */
	IdlInterfaceDcl createIdlInterfaceDcl();

	/**
	 * Returns a new object of class '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commentable</em>'.
	 * @generated
	 */
	Commentable createCommentable();

	/**
	 * Returns a new object of class '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Type</em>'.
	 * @generated
	 */
	ValueType createValueType();

	/**
	 * Returns a new object of class '<em>Export Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export Container</em>'.
	 * @generated
	 */
	ExportContainer createExportContainer();

	/**
	 * Returns a new object of class '<em>Value Forward Dcl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Forward Dcl</em>'.
	 * @generated
	 */
	ValueForwardDcl createValueForwardDcl();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdlPackage getIdlPackage();

} //IdlFactory
