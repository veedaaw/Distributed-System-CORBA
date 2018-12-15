/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.operations;

import net.sf.eclipsecorba.idl.Commentable;
import net.sf.eclipsecorba.idl.Export;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.Operation#isOneway <em>Oneway</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.Operation#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.operations.Operation#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.operations.OperationsPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Export, Commentable {
	/**
	 * Returns the value of the '<em><b>Oneway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oneway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oneway</em>' attribute.
	 * @see #setOneway(boolean)
	 * @see net.sf.eclipsecorba.idl.operations.OperationsPackage#getOperation_Oneway()
	 * @model
	 * @generated
	 */
	boolean isOneway();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.operations.Operation#isOneway <em>Oneway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oneway</em>' attribute.
	 * @see #isOneway()
	 * @generated
	 */
	void setOneway(boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.eclipsecorba.idl.operations.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see net.sf.eclipsecorba.idl.operations.OperationsPackage#getOperation_Parameters()
	 * @model type="net.sf.eclipsecorba.idl.operations.Parameter" containment="true"
	 * @generated
	 */
	EList getParameters();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' reference list.
	 * The list contents are of type {@link net.sf.eclipsecorba.idl.IdlException}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' reference list.
	 * @see net.sf.eclipsecorba.idl.operations.OperationsPackage#getOperation_Exceptions()
	 * @model type="net.sf.eclipsecorba.idl.IdlException"
	 * @generated
	 */
	EList getExceptions();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute list.
	 * @see net.sf.eclipsecorba.idl.operations.OperationsPackage#getOperation_Context()
	 * @model
	 * @generated
	 */
	EList getContext();

} // Operation
