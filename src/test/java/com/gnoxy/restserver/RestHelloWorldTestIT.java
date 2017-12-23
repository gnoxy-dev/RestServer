package com.gnoxy.restserver;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author gnoxy
 */
public class RestHelloWorldTestIT {
    
    String helloWorldURL = "http://localhost:8080/RestServer/rest/services/";
    String expectedResult = "Hello World";
    
    
    @Test
    public void testIntegrationHello(){
        // the client connect to the REST service
        Client client = ClientBuilder.newClient();
        
        String helloWorldString = client.target(helloWorldURL+"helloWorld") // connection to the pre-defined URL
                .request("text/plain")  // we request a "text/plain" answer
                .get(String.class); // we call the 'get' method and we transform the answer in a String
        assertEquals(expectedResult, helloWorldString.substring(0, 11));
        
    }
    
     @Test
    public void testIntegrationHelloJSON() throws Exception {
        // the client connect to the REST service
        Client client = ClientBuilder.newClient();
         System.out.println("integration test: HelloJSON test");
        
         List<String> helloWorldString = client.target(helloWorldURL+"helloJSON") // connection to the pre-defined URL
                 .request()
                 .get(ArrayList.class); // we call the 'get' method and we transform the answer in a String
        InputStream expected = getClass().getClassLoader().getResourceAsStream("helloJSON-results.txt");
        assertEquals(IOUtils.toString(expected).trim(), helloWorldString.toString());
        
    }
    
}
