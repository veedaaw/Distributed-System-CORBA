/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types.impl;

import net.sf.eclipsecorba.idl.IdlPackage;

import net.sf.eclipsecorba.idl.impl.IdlPackageImpl;

import net.sf.eclipsecorba.idl.operations.OperationsPackage;

import net.sf.eclipsecorba.idl.operations.impl.OperationsPackageImpl;

import net.sf.eclipsecorba.idl.types.Any;
import net.sf.eclipsecorba.idl.types.EnumType;
import net.sf.eclipsecorba.idl.types.IdlChar;
import net.sf.eclipsecorba.idl.types.IdlString;
import net.sf.eclipsecorba.idl.types.LongDouble;
import net.sf.eclipsecorba.idl.types.LongLong;
import net.sf.eclipsecorba.idl.types.Octet;
import net.sf.eclipsecorba.idl.types.PrimitiveType;
import net.sf.eclipsecorba.idl.types.SequenceType;
import net.sf.eclipsecorba.idl.types.StructForwardDcl;
import net.sf.eclipsecorba.idl.types.StructType;
import net.sf.eclipsecorba.idl.types.TemplateType;
import net.sf.eclipsecorba.idl.types.TypeDef;
import net.sf.eclipsecorba.idl.types.TypesFactory;
import net.sf.eclipsecorba.idl.types.TypesPackage;
import net.sf.eclipsecorba.idl.types.ULong;
import net.sf.eclipsecorba.idl.types.ULongLong;
import net.sf.eclipsecorba.idl.types.UShort;
import net.sf.eclipsecorba.idl.types.UnionForwardDcl;
import net.sf.eclipsecorba.idl.types.UnionType;
import net.sf.eclipsecorba.idl.types.VoidType;
import net.sf.eclipsecorba.idl.types.WChar;
import net.sf.eclipsecorba.idl.types.WString;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wCharEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uShortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uLongLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionForwardDclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structForwardDclEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.eclipsecorba.idl.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		IdlPackageImpl theIdlPackage = (IdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IdlPackage.eNS_URI) instanceof IdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IdlPackage.eNS_URI) : IdlPackage.eINSTANCE);
		OperationsPackageImpl theOperationsPackage = (OperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI) instanceof OperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI) : OperationsPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theIdlPackage.createPackageContents();
		theOperationsPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theIdlPackage.initializePackageContents();
		theOperationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDef() {
		return typeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidType() {
		return voidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionType() {
		return unionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionType_ForwardDcl() {
		return (EReference)unionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumType() {
		return enumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumType_Enumerators() {
		return (EAttribute)enumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructType() {
		return structTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType_ForwardDeclaration() {
		return (EReference)structTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructType_ForwardDcl() {
		return (EReference)structTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateType() {
		return templateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateType_Size() {
		return (EAttribute)templateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdlString() {
		return idlStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWString() {
		return wStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShort() {
		return shortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong() {
		return longEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOctet() {
		return octetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat() {
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble() {
		return doubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdlChar() {
		return idlCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWChar() {
		return wCharEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongLong() {
		return longLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongDouble() {
		return longDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUShort() {
		return uShortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getULong() {
		return uLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getULongLong() {
		return uLongLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAny() {
		return anyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionForwardDcl() {
		return unionForwardDclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionForwardDcl_Implementation() {
		return (EReference)unionForwardDclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructForwardDcl() {
		return structForwardDclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructForwardDcl_Implementation() {
		return (EReference)structForwardDclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		typeDefEClass = createEClass(TYPE_DEF);

		voidTypeEClass = createEClass(VOID_TYPE);

		unionTypeEClass = createEClass(UNION_TYPE);
		createEReference(unionTypeEClass, UNION_TYPE__FORWARD_DCL);

		enumTypeEClass = createEClass(ENUM_TYPE);
		createEAttribute(enumTypeEClass, ENUM_TYPE__ENUMERATORS);

		structTypeEClass = createEClass(STRUCT_TYPE);
		createEReference(structTypeEClass, STRUCT_TYPE__FORWARD_DECLARATION);
		createEReference(structTypeEClass, STRUCT_TYPE__FORWARD_DCL);

		templateTypeEClass = createEClass(TEMPLATE_TYPE);
		createEAttribute(templateTypeEClass, TEMPLATE_TYPE__SIZE);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);

		idlStringEClass = createEClass(IDL_STRING);

		wStringEClass = createEClass(WSTRING);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		shortEClass = createEClass(SHORT);

		longEClass = createEClass(LONG);

		octetEClass = createEClass(OCTET);

		floatEClass = createEClass(FLOAT);

		doubleEClass = createEClass(DOUBLE);

		idlCharEClass = createEClass(IDL_CHAR);

		wCharEClass = createEClass(WCHAR);

		booleanEClass = createEClass(BOOLEAN);

		longLongEClass = createEClass(LONG_LONG);

		longDoubleEClass = createEClass(LONG_DOUBLE);

		uShortEClass = createEClass(USHORT);

		uLongEClass = createEClass(ULONG);

		uLongLongEClass = createEClass(ULONG_LONG);

		anyEClass = createEClass(ANY);

		unionForwardDclEClass = createEClass(UNION_FORWARD_DCL);
		createEReference(unionForwardDclEClass, UNION_FORWARD_DCL__IMPLEMENTATION);

		structForwardDclEClass = createEClass(STRUCT_FORWARD_DCL);
		createEReference(structForwardDclEClass, STRUCT_FORWARD_DCL__IMPLEMENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdlPackage theIdlPackage = (IdlPackage)EPackage.Registry.INSTANCE.getEPackage(IdlPackage.eNS_URI);

		// Add supertypes to classes
		typeDefEClass.getESuperTypes().add(theIdlPackage.getTypedElement());
		typeDefEClass.getESuperTypes().add(theIdlPackage.getIdlTypeDcl());
		voidTypeEClass.getESuperTypes().add(theIdlPackage.getIdlType());
		unionTypeEClass.getESuperTypes().add(theIdlPackage.getIdlTypeDcl());
		enumTypeEClass.getESuperTypes().add(theIdlPackage.getIdlTypeDcl());
		structTypeEClass.getESuperTypes().add(theIdlPackage.getIdlTypeDcl());
		structTypeEClass.getESuperTypes().add(theIdlPackage.getMemberContainer());
		templateTypeEClass.getESuperTypes().add(theIdlPackage.getIdlType());
		sequenceTypeEClass.getESuperTypes().add(this.getTemplateType());
		sequenceTypeEClass.getESuperTypes().add(theIdlPackage.getTyped());
		idlStringEClass.getESuperTypes().add(this.getTemplateType());
		wStringEClass.getESuperTypes().add(this.getTemplateType());
		primitiveTypeEClass.getESuperTypes().add(theIdlPackage.getIdlType());
		shortEClass.getESuperTypes().add(this.getPrimitiveType());
		longEClass.getESuperTypes().add(this.getPrimitiveType());
		octetEClass.getESuperTypes().add(this.getPrimitiveType());
		floatEClass.getESuperTypes().add(this.getPrimitiveType());
		doubleEClass.getESuperTypes().add(this.getPrimitiveType());
		idlCharEClass.getESuperTypes().add(this.getPrimitiveType());
		wCharEClass.getESuperTypes().add(this.getPrimitiveType());
		booleanEClass.getESuperTypes().add(this.getPrimitiveType());
		longLongEClass.getESuperTypes().add(this.getPrimitiveType());
		longDoubleEClass.getESuperTypes().add(this.getPrimitiveType());
		uShortEClass.getESuperTypes().add(this.getPrimitiveType());
		uLongEClass.getESuperTypes().add(this.getPrimitiveType());
		uLongLongEClass.getESuperTypes().add(this.getPrimitiveType());
		anyEClass.getESuperTypes().add(this.getPrimitiveType());
		unionForwardDclEClass.getESuperTypes().add(theIdlPackage.getIdlTypeDcl());
		structForwardDclEClass.getESuperTypes().add(theIdlPackage.getIdlTypeDcl());

		// Initialize classes and features; add operations and parameters
		initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unionTypeEClass, UnionType.class, "UnionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionType_ForwardDcl(), this.getUnionForwardDcl(), this.getUnionForwardDcl_Implementation(), "forwardDcl", null, 0, 1, UnionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumType_Enumerators(), ecorePackage.getEString(), "enumerators", null, 0, -1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structTypeEClass, StructType.class, "StructType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructType_ForwardDeclaration(), theIdlPackage.getForwardDcl(), null, "forwardDeclaration", null, 0, 1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructType_ForwardDcl(), this.getStructForwardDcl(), this.getStructForwardDcl_Implementation(), "forwardDcl", null, 0, 1, StructType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateTypeEClass, TemplateType.class, "TemplateType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateType_Size(), ecorePackage.getEInt(), "size", null, 0, 1, TemplateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idlStringEClass, IdlString.class, "IdlString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wStringEClass, WString.class, "WString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shortEClass, net.sf.eclipsecorba.idl.types.Short.class, "Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longEClass, net.sf.eclipsecorba.idl.types.Long.class, "Long", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(octetEClass, Octet.class, "Octet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatEClass, net.sf.eclipsecorba.idl.types.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doubleEClass, net.sf.eclipsecorba.idl.types.Double.class, "Double", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idlCharEClass, IdlChar.class, "IdlChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wCharEClass, WChar.class, "WChar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanEClass, net.sf.eclipsecorba.idl.types.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longLongEClass, LongLong.class, "LongLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longDoubleEClass, LongDouble.class, "LongDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uShortEClass, UShort.class, "UShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uLongEClass, ULong.class, "ULong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uLongLongEClass, ULongLong.class, "ULongLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyEClass, Any.class, "Any", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unionForwardDclEClass, UnionForwardDcl.class, "UnionForwardDcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionForwardDcl_Implementation(), this.getUnionType(), this.getUnionType_ForwardDcl(), "implementation", null, 0, 1, UnionForwardDcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structForwardDclEClass, StructForwardDcl.class, "StructForwardDcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructForwardDcl_Implementation(), this.getStructType(), this.getStructType_ForwardDcl(), "implementation", null, 0, 1, StructForwardDcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TypesPackageImpl
