package DCSRApp;

/**
* DCSRApp/DCSRInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Modules.idl
* Sunday, November 4, 2018 at 9:57:55 PM Eastern Standard Time
*/

public final class DCSRInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public DCSRApp.DCSRInterface value = null;

  public DCSRInterfaceHolder ()
  {
  }

  public DCSRInterfaceHolder (DCSRApp.DCSRInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DCSRApp.DCSRInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DCSRApp.DCSRInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DCSRApp.DCSRInterfaceHelper.type ();
  }

}