/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types;

import net.sf.eclipsecorba.idl.IdlPackage;

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
 * @see net.sf.eclipsecorba.idl.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///net/sf/eclipsecorba/idl.types.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.sf.eclipsecorba.idl.types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.TypeDefImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NAME = IdlPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__LINE = IdlPackage.TYPED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__POS = IdlPackage.TYPED_ELEMENT__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__LENGTH = IdlPackage.TYPED_ELEMENT__LENGTH;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__TYPE = IdlPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__COMMENT = IdlPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = IdlPackage.TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.VoidTypeImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__LINE = IdlPackage.IDL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__POS = IdlPackage.IDL_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE__LENGTH = IdlPackage.IDL_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = IdlPackage.IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.UnionTypeImpl <em>Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.UnionTypeImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__NAME = IdlPackage.IDL_TYPE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__LINE = IdlPackage.IDL_TYPE_DCL__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__POS = IdlPackage.IDL_TYPE_DCL__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__LENGTH = IdlPackage.IDL_TYPE_DCL__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__COMMENT = IdlPackage.IDL_TYPE_DCL__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__TYPE = IdlPackage.IDL_TYPE_DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Forward Dcl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__FORWARD_DCL = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.EnumTypeImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__NAME = IdlPackage.IDL_TYPE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LINE = IdlPackage.IDL_TYPE_DCL__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__POS = IdlPackage.IDL_TYPE_DCL__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__LENGTH = IdlPackage.IDL_TYPE_DCL__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__COMMENT = IdlPackage.IDL_TYPE_DCL__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__TYPE = IdlPackage.IDL_TYPE_DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Enumerators</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__ENUMERATORS = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.StructTypeImpl <em>Struct Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.StructTypeImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getStructType()
	 * @generated
	 */
	int STRUCT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__NAME = IdlPackage.IDL_TYPE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__LINE = IdlPackage.IDL_TYPE_DCL__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__POS = IdlPackage.IDL_TYPE_DCL__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__LENGTH = IdlPackage.IDL_TYPE_DCL__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__COMMENT = IdlPackage.IDL_TYPE_DCL__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__TYPE = IdlPackage.IDL_TYPE_DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__MEMBERS = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forward Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__FORWARD_DECLARATION = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forward Dcl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE__FORWARD_DCL = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Struct Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_TYPE_FEATURE_COUNT = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.TemplateTypeImpl <em>Template Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.TemplateTypeImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getTemplateType()
	 * @generated
	 */
	int TEMPLATE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__LINE = IdlPackage.IDL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__POS = IdlPackage.IDL_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__LENGTH = IdlPackage.IDL_TYPE__LENGTH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE__SIZE = IdlPackage.IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_TYPE_FEATURE_COUNT = IdlPackage.IDL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.SequenceTypeImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__LINE = TEMPLATE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__POS = TEMPLATE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__LENGTH = TEMPLATE_TYPE__LENGTH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SIZE = TEMPLATE_TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TYPE = TEMPLATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = TEMPLATE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.IdlStringImpl <em>Idl String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.IdlStringImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getIdlString()
	 * @generated
	 */
	int IDL_STRING = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRING__LINE = TEMPLATE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRING__POS = TEMPLATE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRING__LENGTH = TEMPLATE_TYPE__LENGTH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRING__SIZE = TEMPLATE_TYPE__SIZE;

	/**
	 * The number of structural features of the '<em>Idl String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_STRING_FEATURE_COUNT = TEMPLATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.WStringImpl <em>WString</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.WStringImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getWString()
	 * @generated
	 */
	int WSTRING = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING__LINE = TEMPLATE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING__POS = TEMPLATE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING__LENGTH = TEMPLATE_TYPE__LENGTH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING__SIZE = TEMPLATE_TYPE__SIZE;

	/**
	 * The number of structural features of the '<em>WString</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_FEATURE_COUNT = TEMPLATE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.PrimitiveTypeImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__LINE = IdlPackage.IDL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__POS = IdlPackage.IDL_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__LENGTH = IdlPackage.IDL_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = IdlPackage.IDL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.ShortImpl <em>Short</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.ShortImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getShort()
	 * @generated
	 */
	int SHORT = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Short</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.LongImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.OctetImpl <em>Octet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.OctetImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getOctet()
	 * @generated
	 */
	int OCTET = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Octet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.FloatImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 13;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.DoubleImpl <em>Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.DoubleImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.IdlCharImpl <em>Idl Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.IdlCharImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getIdlChar()
	 * @generated
	 */
	int IDL_CHAR = 15;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHAR__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHAR__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHAR__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Idl Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDL_CHAR_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.WCharImpl <em>WChar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.WCharImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getWChar()
	 * @generated
	 */
	int WCHAR = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCHAR__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCHAR__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCHAR__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>WChar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCHAR_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.BooleanImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 17;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.LongLongImpl <em>Long Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.LongLongImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getLongLong()
	 * @generated
	 */
	int LONG_LONG = 18;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.LongDoubleImpl <em>Long Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.LongDoubleImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getLongDouble()
	 * @generated
	 */
	int LONG_DOUBLE = 19;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Long Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_DOUBLE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.UShortImpl <em>UShort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.UShortImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getUShort()
	 * @generated
	 */
	int USHORT = 20;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>UShort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USHORT_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.ULongImpl <em>ULong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.ULongImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getULong()
	 * @generated
	 */
	int ULONG = 21;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>ULong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.ULongLongImpl <em>ULong Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.ULongLongImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getULongLong()
	 * @generated
	 */
	int ULONG_LONG = 22;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>ULong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULONG_LONG_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.AnyImpl <em>Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.AnyImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getAny()
	 * @generated
	 */
	int ANY = 23;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__LINE = PRIMITIVE_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__POS = PRIMITIVE_TYPE__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY__LENGTH = PRIMITIVE_TYPE__LENGTH;

	/**
	 * The number of structural features of the '<em>Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.UnionForwardDclImpl <em>Union Forward Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.UnionForwardDclImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getUnionForwardDcl()
	 * @generated
	 */
	int UNION_FORWARD_DCL = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FORWARD_DCL__NAME = IdlPackage.IDL_TYPE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FORWARD_DCL__LINE = IdlPackage.IDL_TYPE_DCL__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FORWARD_DCL__POS = IdlPackage.IDL_TYPE_DCL__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FORWARD_DCL__LENGTH = IdlPackage.IDL_TYPE_DCL__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FORWARD_DCL__COMMENT = IdlPackage.IDL_TYPE_DCL__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FORWARD_DCL__TYPE = IdlPackage.IDL_TYPE_DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FORWARD_DCL__IMPLEMENTATION = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union Forward Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FORWARD_DCL_FEATURE_COUNT = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.eclipsecorba.idl.types.impl.StructForwardDclImpl <em>Struct Forward Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.eclipsecorba.idl.types.impl.StructForwardDclImpl
	 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getStructForwardDcl()
	 * @generated
	 */
	int STRUCT_FORWARD_DCL = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FORWARD_DCL__NAME = IdlPackage.IDL_TYPE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FORWARD_DCL__LINE = IdlPackage.IDL_TYPE_DCL__LINE;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FORWARD_DCL__POS = IdlPackage.IDL_TYPE_DCL__POS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FORWARD_DCL__LENGTH = IdlPackage.IDL_TYPE_DCL__LENGTH;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FORWARD_DCL__COMMENT = IdlPackage.IDL_TYPE_DCL__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FORWARD_DCL__TYPE = IdlPackage.IDL_TYPE_DCL__TYPE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FORWARD_DCL__IMPLEMENTATION = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Forward Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FORWARD_DCL_FEATURE_COUNT = IdlPackage.IDL_TYPE_DCL_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see net.sf.eclipsecorba.idl.types.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see net.sf.eclipsecorba.idl.types.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see net.sf.eclipsecorba.idl.types.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for the reference '{@link net.sf.eclipsecorba.idl.types.UnionType#getForwardDcl <em>Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forward Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.types.UnionType#getForwardDcl()
	 * @see #getUnionType()
	 * @generated
	 */
	EReference getUnionType_ForwardDcl();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see net.sf.eclipsecorba.idl.types.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.eclipsecorba.idl.types.EnumType#getEnumerators <em>Enumerators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enumerators</em>'.
	 * @see net.sf.eclipsecorba.idl.types.EnumType#getEnumerators()
	 * @see #getEnumType()
	 * @generated
	 */
	EAttribute getEnumType_Enumerators();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.StructType <em>Struct Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Type</em>'.
	 * @see net.sf.eclipsecorba.idl.types.StructType
	 * @generated
	 */
	EClass getStructType();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.eclipsecorba.idl.types.StructType#getForwardDeclaration <em>Forward Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Forward Declaration</em>'.
	 * @see net.sf.eclipsecorba.idl.types.StructType#getForwardDeclaration()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_ForwardDeclaration();

	/**
	 * Returns the meta object for the reference '{@link net.sf.eclipsecorba.idl.types.StructType#getForwardDcl <em>Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forward Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.types.StructType#getForwardDcl()
	 * @see #getStructType()
	 * @generated
	 */
	EReference getStructType_ForwardDcl();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.TemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Type</em>'.
	 * @see net.sf.eclipsecorba.idl.types.TemplateType
	 * @generated
	 */
	EClass getTemplateType();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.eclipsecorba.idl.types.TemplateType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.eclipsecorba.idl.types.TemplateType#getSize()
	 * @see #getTemplateType()
	 * @generated
	 */
	EAttribute getTemplateType_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see net.sf.eclipsecorba.idl.types.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.IdlString <em>Idl String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idl String</em>'.
	 * @see net.sf.eclipsecorba.idl.types.IdlString
	 * @generated
	 */
	EClass getIdlString();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.WString <em>WString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WString</em>'.
	 * @see net.sf.eclipsecorba.idl.types.WString
	 * @generated
	 */
	EClass getWString();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see net.sf.eclipsecorba.idl.types.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.Short <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short</em>'.
	 * @see net.sf.eclipsecorba.idl.types.Short
	 * @generated
	 */
	EClass getShort();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see net.sf.eclipsecorba.idl.types.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.Octet <em>Octet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octet</em>'.
	 * @see net.sf.eclipsecorba.idl.types.Octet
	 * @generated
	 */
	EClass getOctet();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see net.sf.eclipsecorba.idl.types.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double</em>'.
	 * @see net.sf.eclipsecorba.idl.types.Double
	 * @generated
	 */
	EClass getDouble();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.IdlChar <em>Idl Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Idl Char</em>'.
	 * @see net.sf.eclipsecorba.idl.types.IdlChar
	 * @generated
	 */
	EClass getIdlChar();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.WChar <em>WChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WChar</em>'.
	 * @see net.sf.eclipsecorba.idl.types.WChar
	 * @generated
	 */
	EClass getWChar();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see net.sf.eclipsecorba.idl.types.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.LongLong <em>Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Long</em>'.
	 * @see net.sf.eclipsecorba.idl.types.LongLong
	 * @generated
	 */
	EClass getLongLong();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.LongDouble <em>Long Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Double</em>'.
	 * @see net.sf.eclipsecorba.idl.types.LongDouble
	 * @generated
	 */
	EClass getLongDouble();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.UShort <em>UShort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UShort</em>'.
	 * @see net.sf.eclipsecorba.idl.types.UShort
	 * @generated
	 */
	EClass getUShort();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.ULong <em>ULong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULong</em>'.
	 * @see net.sf.eclipsecorba.idl.types.ULong
	 * @generated
	 */
	EClass getULong();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.ULongLong <em>ULong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ULong Long</em>'.
	 * @see net.sf.eclipsecorba.idl.types.ULongLong
	 * @generated
	 */
	EClass getULongLong();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.Any <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any</em>'.
	 * @see net.sf.eclipsecorba.idl.types.Any
	 * @generated
	 */
	EClass getAny();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.UnionForwardDcl <em>Union Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Forward Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.types.UnionForwardDcl
	 * @generated
	 */
	EClass getUnionForwardDcl();

	/**
	 * Returns the meta object for the reference '{@link net.sf.eclipsecorba.idl.types.UnionForwardDcl#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see net.sf.eclipsecorba.idl.types.UnionForwardDcl#getImplementation()
	 * @see #getUnionForwardDcl()
	 * @generated
	 */
	EReference getUnionForwardDcl_Implementation();

	/**
	 * Returns the meta object for class '{@link net.sf.eclipsecorba.idl.types.StructForwardDcl <em>Struct Forward Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Forward Dcl</em>'.
	 * @see net.sf.eclipsecorba.idl.types.StructForwardDcl
	 * @generated
	 */
	EClass getStructForwardDcl();

	/**
	 * Returns the meta object for the reference '{@link net.sf.eclipsecorba.idl.types.StructForwardDcl#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see net.sf.eclipsecorba.idl.types.StructForwardDcl#getImplementation()
	 * @see #getStructForwardDcl()
	 * @generated
	 */
	EReference getStructForwardDcl_Implementation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.TypeDefImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getTypeDef()
		 * @generated
		 */
		EClass TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.VoidTypeImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.UnionTypeImpl <em>Union Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.UnionTypeImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getUnionType()
		 * @generated
		 */
		EClass UNION_TYPE = eINSTANCE.getUnionType();

		/**
		 * The meta object literal for the '<em><b>Forward Dcl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_TYPE__FORWARD_DCL = eINSTANCE.getUnionType_ForwardDcl();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.EnumTypeImpl <em>Enum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.EnumTypeImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getEnumType()
		 * @generated
		 */
		EClass ENUM_TYPE = eINSTANCE.getEnumType();

		/**
		 * The meta object literal for the '<em><b>Enumerators</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_TYPE__ENUMERATORS = eINSTANCE.getEnumType_Enumerators();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.StructTypeImpl <em>Struct Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.StructTypeImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getStructType()
		 * @generated
		 */
		EClass STRUCT_TYPE = eINSTANCE.getStructType();

		/**
		 * The meta object literal for the '<em><b>Forward Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE__FORWARD_DECLARATION = eINSTANCE.getStructType_ForwardDeclaration();

		/**
		 * The meta object literal for the '<em><b>Forward Dcl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_TYPE__FORWARD_DCL = eINSTANCE.getStructType_ForwardDcl();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.TemplateTypeImpl <em>Template Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.TemplateTypeImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getTemplateType()
		 * @generated
		 */
		EClass TEMPLATE_TYPE = eINSTANCE.getTemplateType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_TYPE__SIZE = eINSTANCE.getTemplateType_Size();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.SequenceTypeImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.IdlStringImpl <em>Idl String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.IdlStringImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getIdlString()
		 * @generated
		 */
		EClass IDL_STRING = eINSTANCE.getIdlString();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.WStringImpl <em>WString</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.WStringImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getWString()
		 * @generated
		 */
		EClass WSTRING = eINSTANCE.getWString();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.PrimitiveTypeImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.ShortImpl <em>Short</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.ShortImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getShort()
		 * @generated
		 */
		EClass SHORT = eINSTANCE.getShort();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.LongImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.OctetImpl <em>Octet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.OctetImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getOctet()
		 * @generated
		 */
		EClass OCTET = eINSTANCE.getOctet();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.FloatImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.DoubleImpl <em>Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.DoubleImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getDouble()
		 * @generated
		 */
		EClass DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.IdlCharImpl <em>Idl Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.IdlCharImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getIdlChar()
		 * @generated
		 */
		EClass IDL_CHAR = eINSTANCE.getIdlChar();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.WCharImpl <em>WChar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.WCharImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getWChar()
		 * @generated
		 */
		EClass WCHAR = eINSTANCE.getWChar();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.BooleanImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.LongLongImpl <em>Long Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.LongLongImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getLongLong()
		 * @generated
		 */
		EClass LONG_LONG = eINSTANCE.getLongLong();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.LongDoubleImpl <em>Long Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.LongDoubleImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getLongDouble()
		 * @generated
		 */
		EClass LONG_DOUBLE = eINSTANCE.getLongDouble();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.UShortImpl <em>UShort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.UShortImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getUShort()
		 * @generated
		 */
		EClass USHORT = eINSTANCE.getUShort();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.ULongImpl <em>ULong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.ULongImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getULong()
		 * @generated
		 */
		EClass ULONG = eINSTANCE.getULong();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.ULongLongImpl <em>ULong Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.ULongLongImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getULongLong()
		 * @generated
		 */
		EClass ULONG_LONG = eINSTANCE.getULongLong();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.AnyImpl <em>Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.AnyImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getAny()
		 * @generated
		 */
		EClass ANY = eINSTANCE.getAny();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.UnionForwardDclImpl <em>Union Forward Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.UnionForwardDclImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getUnionForwardDcl()
		 * @generated
		 */
		EClass UNION_FORWARD_DCL = eINSTANCE.getUnionForwardDcl();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_FORWARD_DCL__IMPLEMENTATION = eINSTANCE.getUnionForwardDcl_Implementation();

		/**
		 * The meta object literal for the '{@link net.sf.eclipsecorba.idl.types.impl.StructForwardDclImpl <em>Struct Forward Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.eclipsecorba.idl.types.impl.StructForwardDclImpl
		 * @see net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl#getStructForwardDcl()
		 * @generated
		 */
		EClass STRUCT_FORWARD_DCL = eINSTANCE.getStructForwardDcl();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_FORWARD_DCL__IMPLEMENTATION = eINSTANCE.getStructForwardDcl_Implementation();

	}

} //TypesPackage
