/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types;

import net.sf.eclipsecorba.idl.ForwardDcl;
import net.sf.eclipsecorba.idl.IdlTypeDcl;
import net.sf.eclipsecorba.idl.MemberContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.types.StructType#getForwardDeclaration <em>Forward Declaration</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.types.StructType#getForwardDcl <em>Forward Dcl</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getStructType()
 * @model
 * @generated
 */
public interface StructType extends IdlTypeDcl, MemberContainer {
	/**
	 * Returns the value of the '<em><b>Forward Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Declaration</em>' containment reference.
	 * @see #setForwardDeclaration(ForwardDcl)
	 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getStructType_ForwardDeclaration()
	 * @model containment="true"
	 * @generated
	 */
	ForwardDcl getForwardDeclaration();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.types.StructType#getForwardDeclaration <em>Forward Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Declaration</em>' containment reference.
	 * @see #getForwardDeclaration()
	 * @generated
	 */
	void setForwardDeclaration(ForwardDcl value);

	/**
	 * Returns the value of the '<em><b>Forward Dcl</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link net.sf.eclipsecorba.idl.types.StructForwardDcl#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Dcl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Dcl</em>' reference.
	 * @see #setForwardDcl(StructForwardDcl)
	 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getStructType_ForwardDcl()
	 * @see net.sf.eclipsecorba.idl.types.StructForwardDcl#getImplementation
	 * @model opposite="implementation"
	 * @generated
	 */
	StructForwardDcl getForwardDcl();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.types.StructType#getForwardDcl <em>Forward Dcl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Dcl</em>' reference.
	 * @see #getForwardDcl()
	 * @generated
	 */
	void setForwardDcl(StructForwardDcl value);

} // StructType
