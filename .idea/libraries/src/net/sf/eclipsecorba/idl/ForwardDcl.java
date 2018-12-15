/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forward Dcl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.ForwardDcl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.IdlPackage#getForwardDcl()
 * @model
 * @generated
 */
public interface ForwardDcl extends IdlTypeDcl {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(IdlInterfaceDcl)
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getForwardDcl_Implementation()
	 * @model
	 * @generated
	 */
	IdlInterfaceDcl getImplementation();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.ForwardDcl#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(IdlInterfaceDcl value);

} // ForwardDcl
