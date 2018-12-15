/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.Typed#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.IdlPackage#getTyped()
 * @model abstract="true"
 * @generated
 */
public interface Typed extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(IdlType)
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getTyped_Type()
	 * @model
	 * @generated
	 */
	IdlType getType();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.Typed#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(IdlType value);

} // Typed
