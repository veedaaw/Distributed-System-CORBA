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
 * A representation of the model object '<em><b>Union Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.types.UnionType#getForwardDcl <em>Forward Dcl</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getUnionType()
 * @model
 * @generated
 */
public interface UnionType extends IdlTypeDcl {
	/**
	 * Returns the value of the '<em><b>Forward Dcl</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.eclipsecorba.idl.types.UnionForwardDcl#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Dcl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Dcl</em>' reference.
	 * @see #setForwardDcl(UnionForwardDcl)
	 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getUnionType_ForwardDcl()
	 * @see net.sf.eclipsecorba.idl.types.UnionForwardDcl#getImplementation
	 * @model opposite="implementation"
	 * @generated
	 */
	UnionForwardDcl getForwardDcl();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.types.UnionType#getForwardDcl <em>Forward Dcl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Dcl</em>' reference.
	 * @see #getForwardDcl()
	 * @generated
	 */
	void setForwardDcl(UnionForwardDcl value);

} // UnionType
