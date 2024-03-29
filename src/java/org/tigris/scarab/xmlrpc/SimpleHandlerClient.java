package org.tigris.scarab.xmlrpc;

import java.net.URL;
import java.util.Vector;

import org.apache.fulcrum.xmlrpc.DefaultXmlRpcClientComponent;
import org.apache.fulcrum.xmlrpc.XmlRpcClientComponent;

/**
 * This class is just an example of invoking the SimpleHandler class via
 * the XmlRpc service.
 * 
 * @author jorgeuriarte
 * @see org.tigris.scarab.util.SimpleHandler
 *
 */
public class SimpleHandlerClient
{

    public void testXmlRpc() throws Exception
    {
        XmlRpcClientComponent cli = new DefaultXmlRpcClientComponent();
        Vector v = new Vector();
        v.add("Pacman JVM");            // Module
        v.add("PAC1");                  // IssueID
        v.add("Administrator");         // User
        v.add("Prueba pruebilla");      // Comment
        v.add(new Integer(1));          // DISABLE email sending
        Vector vRdo = (Vector)cli.executeRpc(new URL("http://localhost:12345/simple"), "simple.addComment", v);
        System.out.println("The call was successful: " + (vRdo.size()==1));
        System.out.println("The comment was added: " + vRdo.get(0));
    }
    
    public static void main(String args[])
    {
        SimpleHandlerClient shc = new SimpleHandlerClient();
        try
        {
            shc.testXmlRpc();
        }
        catch (Exception e)
        {
            System.err.println("Error invoking service: " + e);
        }
    }
} 