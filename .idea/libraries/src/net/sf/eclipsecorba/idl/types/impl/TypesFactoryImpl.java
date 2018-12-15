/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.eclipsecorba.idl.types.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory("http:///net/sf/eclipsecorba/idl.types.ecore"); 
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypesPackage.TYPE_DEF: return createTypeDef();
			case TypesPackage.VOID_TYPE: return createVoidType();
			case TypesPackage.UNION_TYPE: return createUnionType();
			case TypesPackage.ENUM_TYPE: return createEnumType();
			case TypesPackage.STRUCT_TYPE: return createStructType();
			case TypesPackage.SEQUENCE_TYPE: return createSequenceType();
			case TypesPackage.IDL_STRING: return createIdlString();
			case TypesPackage.WSTRING: return createWString();
			case TypesPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case TypesPackage.SHORT: return createShort();
			case TypesPackage.LONG: return createLong();
			case TypesPackage.OCTET: return createOctet();
			case TypesPackage.FLOAT: return createFloat();
			case TypesPackage.DOUBLE: return createDouble();
			case TypesPackage.IDL_CHAR: return createIdlChar();
			case TypesPackage.WCHAR: return createWChar();
			case TypesPackage.BOOLEAN: return createBoolean();
			case TypesPackage.LONG_LONG: return createLongLong();
			case TypesPackage.LONG_DOUBLE: return createLongDouble();
			case TypesPackage.USHORT: return createUShort();
			case TypesPackage.ULONG: return createULong();
			case TypesPackage.ULONG_LONG: return createULongLong();
			case TypesPackage.ANY: return createAny();
			case TypesPackage.UNION_FORWARD_DCL: return createUnionForwardDcl();
			case TypesPackage.STRUCT_FORWARD_DCL: return createStructForwardDcl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef createTypeDef() {
		TypeDefImpl typeDef = new TypeDefImpl();
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoidType createVoidType() {
		VoidTypeImpl voidType = new VoidTypeImpl();
		return voidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionType createUnionType() {
		UnionTypeImpl unionType = new UnionTypeImpl();
		return unionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructType createStructType() {
		StructTypeImpl structType = new StructTypeImpl();
		return structType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlString createIdlString() {
		IdlStringImpl idlString = new IdlStringImpl();
		return idlString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WString createWString() {
		WStringImpl wString = new WStringImpl();
		return wString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.eclipsecorba.idl.types.Short createShort() {
		ShortImpl short_ = new ShortImpl();
		return short_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.eclipsecorba.idl.types.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Octet createOctet() {
		OctetImpl octet = new OctetImpl();
		return octet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.eclipsecorba.idl.types.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.eclipsecorba.idl.types.Double createDouble() {
		DoubleImpl double_ = new DoubleImpl();
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdlChar createIdlChar() {
		IdlCharImpl idlChar = new IdlCharImpl();
		return idlChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WChar createWChar() {
		WCharImpl wChar = new WCharImpl();
		return wChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.sf.eclipsecorba.idl.types.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongLong createLongLong() {
		LongLongImpl longLong = new LongLongImpl();
		return longLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongDouble createLongDouble() {
		LongDoubleImpl longDouble = new LongDoubleImpl();
		return longDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UShort createUShort() {
		UShortImpl uShort = new UShortImpl();
		return uShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ULong createULong() {
		ULongImpl uLong = new ULongImpl();
		return uLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ULongLong createULongLong() {
		ULongLongImpl uLongLong = new ULongLongImpl();
		return uLongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Any createAny() {
		AnyImpl any = new AnyImpl();
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionForwardDcl createUnionForwardDcl() {
		UnionForwardDclImpl unionForwardDcl = new UnionForwardDclImpl();
		return unionForwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructForwardDcl createStructForwardDcl() {
		StructForwardDclImpl structForwardDcl = new StructForwardDclImpl();
		return structForwardDcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
