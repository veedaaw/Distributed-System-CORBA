/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Dcl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#getInheritedInterfaces <em>Inherited Interfaces</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#isLocal <em>Local</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#getForwardDcl <em>Forward Dcl</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.IdlPackage#getIdlInterfaceDcl()
 * @model
 * @generated
 */
public interface IdlInterfaceDcl extends IdlTypeDcl, DefinitionContainer, ExportContainer {
	/**
	 * Returns the value of the '<em><b>Inherited Interfaces</b></em>' reference list.
	 * The list contents are of type {@link net.sf.eclipsecorba.idl.IdlInterfaceDcl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherited Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Interfaces</em>' reference list.
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getIdlInterfaceDcl_InheritedInterfaces()
	 * @model type="net.sf.eclipsecorba.idl.IdlInterfaceDcl"
	 * @generated
	 */
	EList getInheritedInterfaces();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getIdlInterfaceDcl_Abstract()
	 * @model
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(boolean)
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getIdlInterfaceDcl_Local()
	 * @model
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

	/**
	 * Returns the value of the '<em><b>Forward Dcl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Dcl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Dcl</em>' reference.
	 * @see #setForwardDcl(ForwardDcl)
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getIdlInterfaceDcl_ForwardDcl()
	 * @model
	 * @generated
	 */
	ForwardDcl getForwardDcl();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#getForwardDcl <em>Forward Dcl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Dcl</em>' reference.
	 * @see #getForwardDcl()
	 * @generated
	 */
	void setForwardDcl(ForwardDcl value);

} // IdlInterfaceDcl
