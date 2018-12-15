import DCSRApp.DCSRInterface;
import DCSRApp.DCSRInterfaceHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class ServerCOMP {

	public static void main(String args[]) {
		try {
			// create and initialize the ORB //// get reference to rootpoa &amp; activate
			// the POAManager
			ORB orb = ORB.init(args, null);
			//-ORBInitialPort 1050 -ORBInitialHost localhost
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

			// create servant and register it with the ORB
			ImplCOMP COMPObj = new ImplCOMP();
			COMPObj.setORB(orb);

			// get object reference from the servant
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(COMPObj);
			DCSRInterface href = DCSRInterfaceHelper.narrow(ref);

			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			NameComponent path[] = ncRef.to_name("comp");
			ncRef.rebind(path, href);

			System.out.println("COMP Server is ready and waiting ...");

			// wait for invocations from clients
			for (; ; ) {
				orb.run();
			}
		} catch (Exception e) {
			System.err.println("ERROR: " + e);
			e.printStackTrace(System.out);
		}

		System.out.println("Server Exiting ...");

	}



		//*********************UDP****************************//


	public static String sendMessage(int serverPort, String msg) {
		String result= null;
		DatagramSocket aSocket = null;
		try {
			aSocket = new DatagramSocket();
			byte[] message = msg.getBytes();
			InetAddress aHost = InetAddress.getByName("localhost");
			DatagramPacket request = new DatagramPacket(message, msg.length(), aHost, serverPort);
			aSocket.send(request);

			/*System.out.println("Request message sent from COMP SERVER to server with port number " + serverPort + " is: "
					+ new String(request.getData()));*/

			byte[] buffer = new byte[1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);

			aSocket.receive(reply);
			if(reply.getData() == null)
			{
				System.out.println("no courses found");
				result = " ";
			}

			else
			{
				System.out.println("Reply received from the server with port number " + serverPort + " is: "
					+ new String(reply.getData()).trim());
				result = new String(reply.getData()).trim();
			}
		} catch (SocketException e) {
			System.out.println("Socket: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO: " + e.getMessage());
		} finally {
			if (aSocket != null)
				aSocket.close();
		}

		return result;
	}

	public static void receive() {
		DatagramSocket aSocket = null;
		try {
			aSocket = new DatagramSocket(1212);
			byte[] buffer = new byte[1000];
			System.out.println("Server 1212/COMP Started............");
			while (true) {
				DatagramPacket request = new DatagramPacket(buffer, buffer.length);
				aSocket.receive(request);
				DatagramPacket reply = new DatagramPacket(request.getData(), request.getLength(), request.getAddress(),
						request.getPort());
				aSocket.send(reply);
			}
		} catch (SocketException e) {
			System.out.println("Socket: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO: " + e.getMessage());
		} finally {
			if (aSocket != null)
				aSocket.close();
		}
	}



}