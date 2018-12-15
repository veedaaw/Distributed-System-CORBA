/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.MemberContainer#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.IdlPackage#getMemberContainer()
 * @model abstract="true"
 * @generated
 */
public interface MemberContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.eclipsecorba.idl.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getMemberContainer_Members()
	 * @model type="net.sf.eclipsecorba.idl.Member" containment="true"
	 * @generated
	 */
	EList getMembers();

} // MemberContainer
