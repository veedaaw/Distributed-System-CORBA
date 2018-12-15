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


public class ServerINSE {

    public static ImplINSE INSEObj;

    public static void main(String args[]) throws Exception

    {
        Runnable task1 = () -> {
            StartServer(args);
        };

        Runnable task2 = () -> {
            receive();
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
    public static void StartServer(String args[]){
        try {
            // create and initialize the ORB //// get reference to rootpoa &amp; activate
            // the POAManager
            ORB orb = ORB.init(args, null);
            //-ORBInitialPort 1050 -ORBInitialHost localhost
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            // create servant and register it with the ORB
            INSEObj = new ImplINSE();
            INSEObj.setORB(orb);

            // get object reference from the servant
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(INSEObj);
            DCSRInterface href = DCSRInterfaceHelper.narrow(ref);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            NameComponent path[] = ncRef.to_name("inse");
            ncRef.rebind(path, href);

            System.out.println("INSE Server is ready and waiting ...");

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
//*************************UDP****************************//
    public static void receive() {
        DatagramSocket aSocket = null;
        try {
            aSocket = new DatagramSocket(1414);
            byte[] buffer = new byte[1000];// to stored the received data from
            // the client.
            System.out.println("Server 1414 Started............");
            while (true) {// non-terminating loop as the server is always in
                // listening mode.
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                // Server waits for the request to
                // come------------------------------------------------------------------
                aSocket.receive(request);// request received

                byte[] byt = request.getData();
                char [] message = new char[byt.length];

                for(int i=0; i< byt.length; i++)
                {
                    message[i] = (char) byt[i];
                }
                String str = String.valueOf(message);
                System.out.println(str.trim());

                String data= " ";
                if(str.trim().toLowerCase().equals("fall"))
                {
                    if(INSEObj.CourseAvailability("fall").length>0)
                    {

                        for (int i = 0; i < INSEObj.CourseAvailability("fall").length; i++) {
                            data += (INSEObj.CourseAvailability("fall")[i])+ " ";
                        }
                    }

                }
                else if (str.trim().toLowerCase().equals("winter"))
                {
                    if(INSEObj.CourseAvailability("winter").length>0)
                    {
                        for (int i = 0; i < INSEObj.CourseAvailability("winter").length; i++) {
                            data += (INSEObj.CourseAvailability("winter")[i])+" ";
                        }
                    }


                }
                else if (str.trim().toLowerCase().equals("summer"))
                {
                    if(INSEObj.CourseAvailability("summer").length>0)
                    {
                        for (int i = 0; i < INSEObj.CourseAvailability("summer").length; i++) {
                            data +=  (INSEObj.CourseAvailability("summer")[i])+" ";
                        }
                    }

                }

                else
                {

                    data = "-0-";
                }

                DatagramPacket reply = new DatagramPacket(data.getBytes(), data.length(), request.getAddress(),
                        request.getPort());// reply packet ready
                aSocket.send(reply);// reply sent
            }
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (aSocket != null)
                aSocket.close();
        }


    }


}