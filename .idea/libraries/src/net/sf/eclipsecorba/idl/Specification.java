/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.Specification#getIncludes <em>Includes</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.Specification#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.eclipsecorba.idl.Specification#getMacros <em>Macros</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.IdlPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends DefinitionContainer {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link net.sf.eclipsecorba.idl.Specification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getSpecification_Includes()
	 * @model type="net.sf.eclipsecorba.idl.Specification"
	 * @generated
	 */
	EList getIncludes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.Specification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Macros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macros</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macros</em>' attribute.
	 * @see #setMacros(Map)
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getSpecification_Macros()
	 * @model transient="true"
	 * @generated
	 */
	Map getMacros();

	/**
	 * Sets the value of the '{@link net.sf.eclipsecorba.idl.Specification#getMacros <em>Macros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macros</em>' attribute.
	 * @see #getMacros()
	 * @generated
	 */
	void setMacros(Map value);

} // Specification
