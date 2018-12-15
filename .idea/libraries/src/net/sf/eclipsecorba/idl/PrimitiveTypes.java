package net.sf.eclipsecorba.idl;

import net.sf.eclipsecorba.idl.types.Boolean;
import net.sf.eclipsecorba.idl.types.Float;
import net.sf.eclipsecorba.idl.types.IdlChar;
import net.sf.eclipsecorba.idl.types.IdlString;
import net.sf.eclipsecorba.idl.types.Long;
import net.sf.eclipsecorba.idl.types.LongLong;
import net.sf.eclipsecorba.idl.types.Octet;
import net.sf.eclipsecorba.idl.types.Short;
import net.sf.eclipsecorba.idl.types.TypesFactory;
import net.sf.eclipsecorba.idl.types.ULong;
import net.sf.eclipsecorba.idl.types.ULongLong;
import net.sf.eclipsecorba.idl.types.UShort;
import net.sf.eclipsecorba.idl.types.WChar;
import net.sf.eclipsecorba.idl.types.WString;

public class PrimitiveTypes {

	public static final UShort ushort = TypesFactory.eINSTANCE.createUShort();
	public static final ULongLong ulonglong = TypesFactory.eINSTANCE.createULongLong();
	public static final ULong ulong = TypesFactory.eINSTANCE.createULong();
	public static final Octet octet = TypesFactory.eINSTANCE.createOctet();
	public static final LongLong longLong = TypesFactory.eINSTANCE.createLongLong();
	public static final Long _long = TypesFactory.eINSTANCE.createLong();
	public static final Float _float = TypesFactory.eINSTANCE.createFloat();
	public static final IdlChar _char = TypesFactory.eINSTANCE.createIdlChar();
	public static final Boolean _boolean = TypesFactory.eINSTANCE.createBoolean();
	public static final Short _short = TypesFactory.eINSTANCE.createShort();
	public static final WString wstring = TypesFactory.eINSTANCE.createWString();
	public static final WChar wchar = TypesFactory.eINSTANCE.createWChar();
	public static final IdlString string = TypesFactory.eINSTANCE.createIdlString();
}
