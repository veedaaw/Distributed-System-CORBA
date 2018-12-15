/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.operations;

import net.sf.eclipsecorba.idl.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.Parameter#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.operations.OperationsPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.eclipsecorba.idl.operations.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see net.sf.eclipsecorba.idl.operations.Direction
	 * @see #setDirection(Direction)
	 * @see net.sf.eclipsecorba.idl.operations.OperationsPackage#getParameter_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.operations.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see net.sf.eclipsecorba.idl.operations.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // Parameter
