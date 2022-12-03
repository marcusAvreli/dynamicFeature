package dynamicFeature.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class CoreApplication extends ResourceConfig {
	
    /** Maximum timeout seconds. */
    private static final long TIMEOUT_SECONDS = 50;

    /**
     * Start Application.
     */
    public CoreApplication() {
    	   registerResources();

           // Now you can expect validation errors to be sent to the
           // client.
       //    property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
    }
   
    public void registerResources() {
     
    
    	register(UserResource.class);
    	register(AppKeyFeature.class);
    }
 

}