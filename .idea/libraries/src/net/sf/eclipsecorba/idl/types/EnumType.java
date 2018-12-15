/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types;

import net.sf.eclipsecorba.idl.IdlTypeDcl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.types.EnumType#getEnumerators <em>Enumerators</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends IdlTypeDcl {
	/**
	 * Returns the value of the '<em><b>Enumerators</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerators</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerators</em>' attribute list.
	 * @see net.sf.eclipsecorba.idl.types.TypesPackage#getEnumType_Enumerators()
	 * @model
	 * @generated
	 */
	EList getEnumerators();

} // EnumType
