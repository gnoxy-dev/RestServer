package com.gnoxy.restserver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gnoxy
 */
public class RestHelloWorldTest {
    
     String expectedResult = "Hello World";
      
    
    public RestHelloWorldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hello method, of class RestHelloWorld.
     */
    @Test
    public void testHello() {
        System.out.println("unit test: hello");
        RestHelloWorld instance = new RestHelloWorld();
        String result = instance.hello();
        assertEquals(expectedResult, result.substring(0, 11));
       }
    
    
    
}
