package com.gnoxy.restserver;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author gnoxy
 */
@Provider  // @Provider tells the server that this is a REST class
@Path("services") // define the path for this class: [server]/rest/services
public class RestHelloWorld {
    
    @Path("helloWorld") // relative path used to call this method
    @GET // answers only to a http get request
    public String hello(){  // return a simple string (text/plain by default)
        InetAddress ip;
        String hostname = "Unknown";
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
        }
        catch (UnknownHostException e) {
            System.out.println("Caught exception:");
            e.printStackTrace();
        }
        return "Hello World from " + hostname; 
    }
    
    @Path("helloJSON")
    @GET
    @Produces("application/json")
    public List<String> helloJSONList(){
        List<String> jsonList = new ArrayList<String>();
        jsonList.add("Hello World");
        jsonList.add("Hello NAM");
        jsonList.add("Hello LATAM");
        jsonList.add("Hello EMEA");
        jsonList.add("Hello APAC");
        jsonList.add("Hello to the North and South Poles!");
        
        return jsonList;
                
    }
}
