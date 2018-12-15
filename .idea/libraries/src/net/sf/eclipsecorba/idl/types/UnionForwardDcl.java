/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types;

import net.sf.eclipsecorba.idl.IdlTypeDcl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Forward Dcl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.types.UnionForwardDcl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getUnionForwardDcl()
 * @model
 * @generated
 */
public interface UnionForwardDcl extends IdlTypeDcl {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.eclipsecorba.idl.types.UnionType#getForwardDcl <em>Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(UnionType)
	 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getUnionForwardDcl_Implementation()
	 * @see net.sf.eclipsecorba.idl.types.UnionType#getForwardDcl
	 * @model opposite="forwardDcl"
	 * @generated
	 */
	UnionType getImplementation();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.types.UnionForwardDcl#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(UnionType value);

} // UnionForwardDcl
