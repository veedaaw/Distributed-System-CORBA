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
 * A representation of the model object '<em><b>Struct Forward Dcl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.types.StructForwardDcl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getStructForwardDcl()
 * @model
 * @generated
 */
public interface StructForwardDcl extends IdlTypeDcl {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.eclipsecorba.idl.types.StructType#getForwardDcl <em>Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(StructType)
	 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getStructForwardDcl_Implementation()
	 * @see net.sf.eclipsecorba.idl.types.StructType#getForwardDcl
	 * @model opposite="forwardDcl"
	 * @generated
	 */
	StructType getImplementation();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.types.StructForwardDcl#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(StructType value);

} // StructForwardDcl
