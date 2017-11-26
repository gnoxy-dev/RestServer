package com.gnoxy.restserver;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * This class is used to tell to the server that there are REST services.
 * 
 * @author gnoxy
 */
@ApplicationPath("rest") // the 'rest' address is mapped to the REST services
public class RestConfig extends Application{ // a javax.ws.rs.core.Application must be extended
}
