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
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.Member#getDeclarators <em>Declarators</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.IdlPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends TypedElement, Commentable {
	/**
	 * Returns the value of the '<em><b>Declarators</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.eclipsecorba.idl.Declarator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarators</em>' containment reference list.
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getMember_Declarators()
	 * @model type="net.sf.eclipsecorba.idl.Declarator" containment="true"
	 * @generated
	 */
	EList getDeclarators();

} // Member
