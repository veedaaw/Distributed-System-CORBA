/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.impl;

import net.sf.eclipsecorba.idl.Commentable;
import net.sf.eclipsecorba.idl.Declarator;
import net.sf.eclipsecorba.idl.Definition;
import net.sf.eclipsecorba.idl.DefinitionContainer;
import net.sf.eclipsecorba.idl.Element;
import net.sf.eclipsecorba.idl.Export;
import net.sf.eclipsecorba.idl.ExportContainer;
import net.sf.eclipsecorba.idl.FileRegion;
import net.sf.eclipsecorba.idl.ForwardDcl;
import net.sf.eclipsecorba.idl.Identifiable;
import net.sf.eclipsecorba.idl.IdlConstDcl;
import net.sf.eclipsecorba.idl.IdlException;
import net.sf.eclipsecorba.idl.IdlFactory;
import net.sf.eclipsecorba.idl.IdlInterfaceDcl;
import net.sf.eclipsecorba.idl.IdlPackage;
import net.sf.eclipsecorba.idl.IdlType;
import net.sf.eclipsecorba.idl.IdlTypeDcl;
import net.sf.eclipsecorba.idl.Member;
import net.sf.eclipsecorba.idl.MemberContainer;
import net.sf.eclipsecorba.idl.Module;
import net.sf.eclipsecorba.idl.Specification;
import net.sf.eclipsecorba.idl.Typed;
import net.sf.eclipsecorba.idl.TypedElement;
import net.sf.eclipsecorba.idl.ValueForwardDcl;
import net.sf.eclipsecorba.idl.ValueType;

import net.sf.eclipsecorba.idl.operations.OperationsPackage;

import net.sf.eclipsecorba.idl.operations.impl.OperationsPackageImpl;

import net.sf.eclipsecorba.idl.types.TypesPackage;

import net.sf.eclipsecorba.idl.types.impl.TypesPackageImpl;

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
public class IdlPackageImpl extends EPackageImpl implements IdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declaratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlConstDclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardDclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlInterfaceDclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idlTypeDclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueForwardDclEClass = null;

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
	 * @see net.sf.eclipsecorba.idl.IdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdlPackageImpl() {
		super(eNS_URI, IdlFactory.eINSTANCE);
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
	public static IdlPackage init() {
		if (isInited) return (IdlPackage)EPackage.Registry.INSTANCE.getEPackage(IdlPackage.eNS_URI);

		// Obtain or create and register package
		IdlPackageImpl theIdlPackage = (IdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof IdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new IdlPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OperationsPackageImpl theOperationsPackage = (OperationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI) instanceof OperationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI) : OperationsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theIdlPackage.createPackageContents();
		theOperationsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theIdlPackage.initializePackageContents();
		theOperationsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdlPackage.freeze();

		return theIdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileRegion() {
		return fileRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileRegion_Line() {
		return (EAttribute)fileRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileRegion_Pos() {
		return (EAttribute)fileRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileRegion_Length() {
		return (EAttribute)fileRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Name() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Includes() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Name() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Macros() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionContainer() {
		return definitionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionContainer_Definitions() {
		return (EReference)definitionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarator() {
		return declaratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTyped() {
		return typedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTyped_Type() {
		return (EReference)typedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Extends() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdlConstDcl() {
		return idlConstDclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdlException() {
		return idlExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Declarators() {
		return (EReference)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemberContainer() {
		return memberContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemberContainer_Members() {
		return (EReference)memberContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardDcl() {
		return forwardDclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForwardDcl_Implementation() {
		return (EReference)forwardDclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdlInterfaceDcl() {
		return idlInterfaceDclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdlInterfaceDcl_InheritedInterfaces() {
		return (EReference)idlInterfaceDclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdlInterfaceDcl_Abstract() {
		return (EAttribute)idlInterfaceDclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdlInterfaceDcl_Local() {
		return (EAttribute)idlInterfaceDclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdlInterfaceDcl_ForwardDcl() {
		return (EReference)idlInterfaceDclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExport() {
		return exportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdlType() {
		return idlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdlTypeDcl() {
		return idlTypeDclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentable() {
		return commentableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentable_Comment() {
		return (EAttribute)commentableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportContainer() {
		return exportContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExportContainer_Body() {
		return (EReference)exportContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueForwardDcl() {
		return valueForwardDclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlFactory getIdlFactory() {
		return (IdlFactory)getEFactoryInstance();
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
		fileRegionEClass = createEClass(FILE_REGION);
		createEAttribute(fileRegionEClass, FILE_REGION__LINE);
		createEAttribute(fileRegionEClass, FILE_REGION__POS);
		createEAttribute(fileRegionEClass, FILE_REGION__LENGTH);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__NAME);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__INCLUDES);
		createEAttribute(specificationEClass, SPECIFICATION__NAME);
		createEAttribute(specificationEClass, SPECIFICATION__MACROS);

		definitionEClass = createEClass(DEFINITION);

		definitionContainerEClass = createEClass(DEFINITION_CONTAINER);
		createEReference(definitionContainerEClass, DEFINITION_CONTAINER__DEFINITIONS);

		elementEClass = createEClass(ELEMENT);

		declaratorEClass = createEClass(DECLARATOR);

		typedElementEClass = createEClass(TYPED_ELEMENT);

		typedEClass = createEClass(TYPED);
		createEReference(typedEClass, TYPED__TYPE);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__EXTENDS);

		idlConstDclEClass = createEClass(IDL_CONST_DCL);

		idlExceptionEClass = createEClass(IDL_EXCEPTION);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__DECLARATORS);

		memberContainerEClass = createEClass(MEMBER_CONTAINER);
		createEReference(memberContainerEClass, MEMBER_CONTAINER__MEMBERS);

		forwardDclEClass = createEClass(FORWARD_DCL);
		createEReference(forwardDclEClass, FORWARD_DCL__IMPLEMENTATION);

		idlInterfaceDclEClass = createEClass(IDL_INTERFACE_DCL);
		createEReference(idlInterfaceDclEClass, IDL_INTERFACE_DCL__INHERITED_INTERFACES);
		createEAttribute(idlInterfaceDclEClass, IDL_INTERFACE_DCL__ABSTRACT);
		createEAttribute(idlInterfaceDclEClass, IDL_INTERFACE_DCL__LOCAL);
		createEReference(idlInterfaceDclEClass, IDL_INTERFACE_DCL__FORWARD_DCL);

		exportEClass = createEClass(EXPORT);

		idlTypeEClass = createEClass(IDL_TYPE);

		idlTypeDclEClass = createEClass(IDL_TYPE_DCL);

		commentableEClass = createEClass(COMMENTABLE);
		createEAttribute(commentableEClass, COMMENTABLE__COMMENT);

		valueTypeEClass = createEClass(VALUE_TYPE);

		exportContainerEClass = createEClass(EXPORT_CONTAINER);
		createEReference(exportContainerEClass, EXPORT_CONTAINER__BODY);

		valueForwardDclEClass = createEClass(VALUE_FORWARD_DCL);
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
		OperationsPackage theOperationsPackage = (OperationsPackage)EPackage.Registry.INSTANCE.getEPackage(OperationsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theOperationsPackage);
		getESubpackages().add(theTypesPackage);

		// Add supertypes to classes
		specificationEClass.getESuperTypes().add(this.getDefinitionContainer());
		definitionEClass.getESuperTypes().add(this.getElement());
		definitionEClass.getESuperTypes().add(this.getCommentable());
		definitionContainerEClass.getESuperTypes().add(this.getFileRegion());
		elementEClass.getESuperTypes().add(this.getIdentifiable());
		elementEClass.getESuperTypes().add(this.getFileRegion());
		declaratorEClass.getESuperTypes().add(this.getElement());
		typedElementEClass.getESuperTypes().add(this.getElement());
		typedElementEClass.getESuperTypes().add(this.getTyped());
		moduleEClass.getESuperTypes().add(this.getDefinition());
		moduleEClass.getESuperTypes().add(this.getDefinitionContainer());
		idlConstDclEClass.getESuperTypes().add(this.getTypedElement());
		idlConstDclEClass.getESuperTypes().add(this.getDefinition());
		idlConstDclEClass.getESuperTypes().add(this.getExport());
		idlExceptionEClass.getESuperTypes().add(this.getDefinition());
		idlExceptionEClass.getESuperTypes().add(this.getExport());
		idlExceptionEClass.getESuperTypes().add(this.getMemberContainer());
		memberEClass.getESuperTypes().add(this.getTypedElement());
		memberEClass.getESuperTypes().add(this.getCommentable());
		forwardDclEClass.getESuperTypes().add(this.getIdlTypeDcl());
		idlInterfaceDclEClass.getESuperTypes().add(this.getIdlTypeDcl());
		idlInterfaceDclEClass.getESuperTypes().add(this.getDefinitionContainer());
		idlInterfaceDclEClass.getESuperTypes().add(this.getExportContainer());
		exportEClass.getESuperTypes().add(this.getTypedElement());
		idlTypeEClass.getESuperTypes().add(this.getFileRegion());
		idlTypeDclEClass.getESuperTypes().add(this.getDefinition());
		idlTypeDclEClass.getESuperTypes().add(this.getIdlType());
		idlTypeDclEClass.getESuperTypes().add(this.getExport());
		valueTypeEClass.getESuperTypes().add(this.getMemberContainer());
		valueTypeEClass.getESuperTypes().add(this.getIdlInterfaceDcl());
		valueForwardDclEClass.getESuperTypes().add(this.getForwardDcl());

		// Initialize classes and features; add operations and parameters
		initEClass(fileRegionEClass, FileRegion.class, "FileRegion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileRegion_Line(), ecorePackage.getEInt(), "line", null, 0, 1, FileRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileRegion_Pos(), ecorePackage.getEInt(), "pos", null, 0, 1, FileRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileRegion_Length(), ecorePackage.getEInt(), "length", null, 0, 1, FileRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Includes(), this.getSpecification(), null, "includes", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Macros(), ecorePackage.getEMap(), "macros", null, 0, 1, Specification.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definitionContainerEClass, DefinitionContainer.class, "DefinitionContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionContainer_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, DefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declaratorEClass, Declarator.class, "Declarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedEClass, Typed.class, "Typed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTyped_Type(), this.getIdlType(), null, "type", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Extends(), this.getModule(), null, "extends", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idlConstDclEClass, IdlConstDcl.class, "IdlConstDcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idlExceptionEClass, IdlException.class, "IdlException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMember_Declarators(), this.getDeclarator(), null, "declarators", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberContainerEClass, MemberContainer.class, "MemberContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemberContainer_Members(), this.getMember(), null, "members", null, 0, -1, MemberContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forwardDclEClass, ForwardDcl.class, "ForwardDcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForwardDcl_Implementation(), this.getIdlInterfaceDcl(), null, "implementation", null, 0, 1, ForwardDcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idlInterfaceDclEClass, IdlInterfaceDcl.class, "IdlInterfaceDcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdlInterfaceDcl_InheritedInterfaces(), this.getIdlInterfaceDcl(), null, "inheritedInterfaces", null, 0, -1, IdlInterfaceDcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdlInterfaceDcl_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, IdlInterfaceDcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdlInterfaceDcl_Local(), ecorePackage.getEBoolean(), "local", null, 0, 1, IdlInterfaceDcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdlInterfaceDcl_ForwardDcl(), this.getForwardDcl(), null, "forwardDcl", null, 0, 1, IdlInterfaceDcl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportEClass, Export.class, "Export", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idlTypeEClass, IdlType.class, "IdlType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idlTypeDclEClass, IdlTypeDcl.class, "IdlTypeDcl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentableEClass, Commentable.class, "Commentable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentable_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Commentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exportContainerEClass, ExportContainer.class, "ExportContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExportContainer_Body(), this.getExport(), null, "body", null, 0, -1, ExportContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueForwardDclEClass, ValueForwardDcl.class, "ValueForwardDcl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IdlPackageImpl
