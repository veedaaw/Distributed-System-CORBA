/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.eclipsecorba.idl.IdlFactory
 * @model kind="package"
 * @generated
 */
public interface IdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "idl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///net/sf/eclipsecorba/idl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.sf.eclipsecorba.idl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdlPackage eINSTANCE = net.sf.eclipsecorba.idl.impl.IdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.FileRegionImpl <em>File Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.FileRegionImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getFileRegion()
	 * @generated
	 */
	int FILE_REGION = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REGION__LINE = 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REGION__POS = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REGION__LENGTH = 2;

	/**
	 * The number of structural features of the '<em>File Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REGION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.IdentifiableImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.DefinitionContainerImpl <em>Definition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.DefinitionContainerImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getDefinitionContainer()
	 * @generated
	 */
	int DEFINITION_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_CONTAINER__LINE = FILE_REGION__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_CONTAINER__POS = FILE_REGION__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_CONTAINER__LENGTH = FILE_REGION__LENGTH;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_CONTAINER__DEFINITIONS = FILE_REGION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_CONTAINER_FEATURE_COUNT = FILE_REGION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.SpecificationImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LINE = DEFINITION_CONTAINER__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__POS = DEFINITION_CONTAINER__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__LENGTH = DEFINITION_CONTAINER__LENGTH;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DEFINITIONS = DEFINITION_CONTAINER__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__INCLUDES = DEFINITION_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = DEFINITION_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Macros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__MACROS = DEFINITION_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = DEFINITION_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.ElementImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LINE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__POS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LENGTH = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.DefinitionImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LINE = ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__POS = ELEMENT__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__LENGTH = ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__COMMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.DeclaratorImpl <em>Declarator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.DeclaratorImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getDeclarator()
	 * @generated
	 */
	int DECLARATOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR__LINE = ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR__POS = ELEMENT__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR__LENGTH = ELEMENT__LENGTH;

	/**
	 * The number of structural features of the '<em>Declarator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.TypedElementImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__LINE = ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__POS = ELEMENT__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__LENGTH = ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.TypedImpl <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.TypedImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getTyped()
	 * @generated
	 */
	int TYPED = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.ModuleImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LINE = DEFINITION__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__POS = DEFINITION__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LENGTH = DEFINITION__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMMENT = DEFINITION__COMMENT;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DEFINITIONS = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXTENDS = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.IdlConstDclImpl <em>Const Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.IdlConstDclImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlConstDcl()
	 * @generated
	 */
	int IDL_CONST_DCL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CONST_DCL__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CONST_DCL__LINE = TYPED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CONST_DCL__POS = TYPED_ELEMENT__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CONST_DCL__LENGTH = TYPED_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CONST_DCL__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CONST_DCL__COMMENT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Const Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CONST_DCL_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.IdlExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.IdlExceptionImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlException()
	 * @generated
	 */
	int IDL_EXCEPTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_EXCEPTION__NAME = DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_EXCEPTION__LINE = DEFINITION__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_EXCEPTION__POS = DEFINITION__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_EXCEPTION__LENGTH = DEFINITION__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_EXCEPTION__COMMENT = DEFINITION__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_EXCEPTION__TYPE = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_EXCEPTION__MEMBERS = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_EXCEPTION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.MemberImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LINE = TYPED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__POS = TYPED_ELEMENT__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LENGTH = TYPED_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__COMMENT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Declarators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DECLARATORS = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.MemberContainerImpl <em>Member Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.MemberContainerImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getMemberContainer()
	 * @generated
	 */
	int MEMBER_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CONTAINER__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>Member Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.IdlTypeDclImpl <em>Type Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.IdlTypeDclImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlTypeDcl()
	 * @generated
	 */
	int IDL_TYPE_DCL = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_DCL__NAME = DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_DCL__LINE = DEFINITION__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_DCL__POS = DEFINITION__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_DCL__LENGTH = DEFINITION__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_DCL__COMMENT = DEFINITION__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_DCL__TYPE = DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_DCL_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.ForwardDclImpl <em>Forward Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.ForwardDclImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getForwardDcl()
	 * @generated
	 */
	int FORWARD_DCL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DCL__NAME = IDL_TYPE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DCL__LINE = IDL_TYPE_DCL__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DCL__POS = IDL_TYPE_DCL__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DCL__LENGTH = IDL_TYPE_DCL__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DCL__COMMENT = IDL_TYPE_DCL__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DCL__TYPE = IDL_TYPE_DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DCL__IMPLEMENTATION = IDL_TYPE_DCL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forward Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DCL_FEATURE_COUNT = IDL_TYPE_DCL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.IdlInterfaceDclImpl <em>Interface Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.IdlInterfaceDclImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlInterfaceDcl()
	 * @generated
	 */
	int IDL_INTERFACE_DCL = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__NAME = IDL_TYPE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__LINE = IDL_TYPE_DCL__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__POS = IDL_TYPE_DCL__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__LENGTH = IDL_TYPE_DCL__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__COMMENT = IDL_TYPE_DCL__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__TYPE = IDL_TYPE_DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__DEFINITIONS = IDL_TYPE_DCL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__BODY = IDL_TYPE_DCL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inherited Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__INHERITED_INTERFACES = IDL_TYPE_DCL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__ABSTRACT = IDL_TYPE_DCL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__LOCAL = IDL_TYPE_DCL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Forward Dcl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL__FORWARD_DCL = IDL_TYPE_DCL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Interface Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_INTERFACE_DCL_FEATURE_COUNT = IDL_TYPE_DCL_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.ExportImpl <em>Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.ExportImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getExport()
	 * @generated
	 */
	int EXPORT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__LINE = TYPED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__POS = TYPED_ELEMENT__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__LENGTH = TYPED_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.IdlTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.IdlTypeImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlType()
	 * @generated
	 */
	int IDL_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__LINE = FILE_REGION__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__POS = FILE_REGION__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE__LENGTH = FILE_REGION__LENGTH;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_TYPE_FEATURE_COUNT = FILE_REGION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.CommentableImpl <em>Commentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.CommentableImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getCommentable()
	 * @generated
	 */
	int COMMENTABLE = 19;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Commentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.ValueTypeImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__MEMBERS = MEMBER_CONTAINER__MEMBERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__NAME = MEMBER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__LINE = MEMBER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__POS = MEMBER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__LENGTH = MEMBER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__COMMENT = MEMBER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__TYPE = MEMBER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__DEFINITIONS = MEMBER_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__BODY = MEMBER_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inherited Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__INHERITED_INTERFACES = MEMBER_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ABSTRACT = MEMBER_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__LOCAL = MEMBER_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Forward Dcl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__FORWARD_DCL = MEMBER_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = MEMBER_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.ExportContainerImpl <em>Export Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.ExportContainerImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getExportContainer()
	 * @generated
	 */
	int EXPORT_CONTAINER = 21;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CONTAINER__BODY = 0;

	/**
	 * The number of structural features of the '<em>Export Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.impl.ValueForwardDclImpl <em>Value Forward Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.impl.ValueForwardDclImpl
	 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getValueForwardDcl()
	 * @generated
	 */
	int VALUE_FORWARD_DCL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FORWARD_DCL__NAME = FORWARD_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FORWARD_DCL__LINE = FORWARD_DCL__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FORWARD_DCL__POS = FORWARD_DCL__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FORWARD_DCL__LENGTH = FORWARD_DCL__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FORWARD_DCL__COMMENT = FORWARD_DCL__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FORWARD_DCL__TYPE = FORWARD_DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FORWARD_DCL__IMPLEMENTATION = FORWARD_DCL__IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Value Forward Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FORWARD_DCL_FEATURE_COUNT = FORWARD_DCL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.FileRegion <em>File Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Region</em>'.
	 * @see net.sf.eclipsecorba.idl.FileRegion
	 * @generated
	 */
	EClass getFileRegion();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.FileRegion#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see net.sf.eclipsecorba.idl.FileRegion#getLine()
	 * @see #getFileRegion()
	 * @generated
	 */
	EAttribute getFileRegion_Line();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.FileRegion#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see net.sf.eclipsecorba.idl.FileRegion#getPos()
	 * @see #getFileRegion()
	 * @generated
	 */
	EAttribute getFileRegion_Pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.FileRegion#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.eclipsecorba.idl.FileRegion#getLength()
	 * @see #getFileRegion()
	 * @generated
	 */
	EAttribute getFileRegion_Length();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see net.sf.eclipsecorba.idl.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.Identifiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.eclipsecorba.idl.Identifiable#getName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see net.sf.eclipsecorba.idl.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.eclipsecorba.idl.Specification#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see net.sf.eclipsecorba.idl.Specification#getIncludes()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Includes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.Specification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.eclipsecorba.idl.Specification#getName()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.Specification#getMacros <em>Macros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macros</em>'.
	 * @see net.sf.eclipsecorba.idl.Specification#getMacros()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Macros();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see net.sf.eclipsecorba.idl.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.DefinitionContainer <em>Definition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Container</em>'.
	 * @see net.sf.eclipsecorba.idl.DefinitionContainer
	 * @generated
	 */
	EClass getDefinitionContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.eclipsecorba.idl.DefinitionContainer#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see net.sf.eclipsecorba.idl.DefinitionContainer#getDefinitions()
	 * @see #getDefinitionContainer()
	 * @generated
	 */
	EReference getDefinitionContainer_Definitions();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.sf.eclipsecorba.idl.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Declarator <em>Declarator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarator</em>'.
	 * @see net.sf.eclipsecorba.idl.Declarator
	 * @generated
	 */
	EClass getDeclarator();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see net.sf.eclipsecorba.idl.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see net.sf.eclipsecorba.idl.Typed
	 * @generated
	 */
	EClass getTyped();

	/**
	 * Returns the meta object for the reference '{@link net.sf.eclipsecorba.idl.Typed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see net.sf.eclipsecorba.idl.Typed#getType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see net.sf.eclipsecorba.idl.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference '{@link net.sf.eclipsecorba.idl.Module#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see net.sf.eclipsecorba.idl.Module#getExtends()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Extends();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.IdlConstDcl <em>Const Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Const Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlConstDcl
	 * @generated
	 */
	EClass getIdlConstDcl();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.IdlException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlException
	 * @generated
	 */
	EClass getIdlException();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see net.sf.eclipsecorba.idl.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.eclipsecorba.idl.Member#getDeclarators <em>Declarators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarators</em>'.
	 * @see net.sf.eclipsecorba.idl.Member#getDeclarators()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Declarators();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.MemberContainer <em>Member Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Container</em>'.
	 * @see net.sf.eclipsecorba.idl.MemberContainer
	 * @generated
	 */
	EClass getMemberContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.eclipsecorba.idl.MemberContainer#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see net.sf.eclipsecorba.idl.MemberContainer#getMembers()
	 * @see #getMemberContainer()
	 * @generated
	 */
	EReference getMemberContainer_Members();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.ForwardDcl <em>Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.ForwardDcl
	 * @generated
	 */
	EClass getForwardDcl();

	/**
	 * Returns the meta object for the reference '{@link net.sf.eclipsecorba.idl.ForwardDcl#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see net.sf.eclipsecorba.idl.ForwardDcl#getImplementation()
	 * @see #getForwardDcl()
	 * @generated
	 */
	EReference getForwardDcl_Implementation();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl <em>Interface Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlInterfaceDcl
	 * @generated
	 */
	EClass getIdlInterfaceDcl();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#getInheritedInterfaces <em>Inherited Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherited Interfaces</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlInterfaceDcl#getInheritedInterfaces()
	 * @see #getIdlInterfaceDcl()
	 * @generated
	 */
	EReference getIdlInterfaceDcl_InheritedInterfaces();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlInterfaceDcl#isAbstract()
	 * @see #getIdlInterfaceDcl()
	 * @generated
	 */
	EAttribute getIdlInterfaceDcl_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#isLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlInterfaceDcl#isLocal()
	 * @see #getIdlInterfaceDcl()
	 * @generated
	 */
	EAttribute getIdlInterfaceDcl_Local();

	/**
	 * Returns the meta object for the reference '{@link net.sf.eclipsecorba.idl.IdlInterfaceDcl#getForwardDcl <em>Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forward Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlInterfaceDcl#getForwardDcl()
	 * @see #getIdlInterfaceDcl()
	 * @generated
	 */
	EReference getIdlInterfaceDcl_ForwardDcl();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export</em>'.
	 * @see net.sf.eclipsecorba.idl.Export
	 * @generated
	 */
	EClass getExport();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.IdlType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlType
	 * @generated
	 */
	EClass getIdlType();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.IdlTypeDcl <em>Type Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.IdlTypeDcl
	 * @generated
	 */
	EClass getIdlTypeDcl();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.Commentable <em>Commentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentable</em>'.
	 * @see net.sf.eclipsecorba.idl.Commentable
	 * @generated
	 */
	EClass getCommentable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.Commentable#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see net.sf.eclipsecorba.idl.Commentable#getComment()
	 * @see #getCommentable()
	 * @generated
	 */
	EAttribute getCommentable_Comment();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see net.sf.eclipsecorba.idl.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.ExportContainer <em>Export Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Container</em>'.
	 * @see net.sf.eclipsecorba.idl.ExportContainer
	 * @generated
	 */
	EClass getExportContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.eclipsecorba.idl.ExportContainer#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see net.sf.eclipsecorba.idl.ExportContainer#getBody()
	 * @see #getExportContainer()
	 * @generated
	 */
	EReference getExportContainer_Body();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.ValueForwardDcl <em>Value Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Forward Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.ValueForwardDcl
	 * @generated
	 */
	EClass getValueForwardDcl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdlFactory getIdlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.FileRegionImpl <em>File Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.FileRegionImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getFileRegion()
		 * @generated
		 */
		EClass FILE_REGION = eINSTANCE.getFileRegion();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REGION__LINE = eINSTANCE.getFileRegion_Line();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REGION__POS = eINSTANCE.getFileRegion_Pos();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_REGION__LENGTH = eINSTANCE.getFileRegion_Length();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.IdentifiableImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NAME = eINSTANCE.getIdentifiable_Name();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.SpecificationImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__INCLUDES = eINSTANCE.getSpecification_Includes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Macros</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__MACROS = eINSTANCE.getSpecification_Macros();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.DefinitionImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.DefinitionContainerImpl <em>Definition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.DefinitionContainerImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getDefinitionContainer()
		 * @generated
		 */
		EClass DEFINITION_CONTAINER = eINSTANCE.getDefinitionContainer();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_CONTAINER__DEFINITIONS = eINSTANCE.getDefinitionContainer_Definitions();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.ElementImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.DeclaratorImpl <em>Declarator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.DeclaratorImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getDeclarator()
		 * @generated
		 */
		EClass DECLARATOR = eINSTANCE.getDeclarator();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.TypedElementImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.TypedImpl <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.TypedImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getTyped()
		 * @generated
		 */
		EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__TYPE = eINSTANCE.getTyped_Type();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.ModuleImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__EXTENDS = eINSTANCE.getModule_Extends();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.IdlConstDclImpl <em>Const Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.IdlConstDclImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlConstDcl()
		 * @generated
		 */
		EClass IDL_CONST_DCL = eINSTANCE.getIdlConstDcl();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.IdlExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.IdlExceptionImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlException()
		 * @generated
		 */
		EClass IDL_EXCEPTION = eINSTANCE.getIdlException();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.MemberImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Declarators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__DECLARATORS = eINSTANCE.getMember_Declarators();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.MemberContainerImpl <em>Member Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.MemberContainerImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getMemberContainer()
		 * @generated
		 */
		EClass MEMBER_CONTAINER = eINSTANCE.getMemberContainer();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_CONTAINER__MEMBERS = eINSTANCE.getMemberContainer_Members();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.ForwardDclImpl <em>Forward Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.ForwardDclImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getForwardDcl()
		 * @generated
		 */
		EClass FORWARD_DCL = eINSTANCE.getForwardDcl();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORWARD_DCL__IMPLEMENTATION = eINSTANCE.getForwardDcl_Implementation();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.IdlInterfaceDclImpl <em>Interface Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.IdlInterfaceDclImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlInterfaceDcl()
		 * @generated
		 */
		EClass IDL_INTERFACE_DCL = eINSTANCE.getIdlInterfaceDcl();

		/**
		 * The meta object literal for the '<em><b>Inherited Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_INTERFACE_DCL__INHERITED_INTERFACES = eINSTANCE.getIdlInterfaceDcl_InheritedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_INTERFACE_DCL__ABSTRACT = eINSTANCE.getIdlInterfaceDcl_Abstract();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDL_INTERFACE_DCL__LOCAL = eINSTANCE.getIdlInterfaceDcl_Local();

		/**
		 * The meta object literal for the '<em><b>Forward Dcl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDL_INTERFACE_DCL__FORWARD_DCL = eINSTANCE.getIdlInterfaceDcl_ForwardDcl();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.ExportImpl <em>Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.ExportImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getExport()
		 * @generated
		 */
		EClass EXPORT = eINSTANCE.getExport();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.IdlTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.IdlTypeImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlType()
		 * @generated
		 */
		EClass IDL_TYPE = eINSTANCE.getIdlType();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.IdlTypeDclImpl <em>Type Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.IdlTypeDclImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getIdlTypeDcl()
		 * @generated
		 */
		EClass IDL_TYPE_DCL = eINSTANCE.getIdlTypeDcl();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.CommentableImpl <em>Commentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.CommentableImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getCommentable()
		 * @generated
		 */
		EClass COMMENTABLE = eINSTANCE.getCommentable();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTABLE__COMMENT = eINSTANCE.getCommentable_Comment();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.ValueTypeImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.ExportContainerImpl <em>Export Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.ExportContainerImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getExportContainer()
		 * @generated
		 */
		EClass EXPORT_CONTAINER = eINSTANCE.getExportContainer();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_CONTAINER__BODY = eINSTANCE.getExportContainer_Body();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.impl.ValueForwardDclImpl <em>Value Forward Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.impl.ValueForwardDclImpl
		 * @see net.sf.eclipsecorba.idl.impl.IdlPackageImpl#getValueForwardDcl()
		 * @generated
		 */
		EClass VALUE_FORWARD_DCL = eINSTANCE.getValueForwardDcl();

	}

} //IdlPackage
