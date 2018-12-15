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
 * A representation of the model object '<em><b>Definition Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.eclipsecorba.idl.DefinitionContainer#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.eclipsecorba.idl.IdlPackage#getDefinitionContainer()
 * @model abstract="true"
 * @generated
 */
public interface DefinitionContainer extends FileRegion {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.eclipsecorba.idl.Definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see net.sf.eclipsecorba.idl.IdlPackage#getDefinitionContainer_Definitions()
	 * @model type="net.sf.eclipsecorba.idl.Definition" containment="true"
	 * @generated
	 */
	EList getDefinitions();

} // DefinitionContainer
