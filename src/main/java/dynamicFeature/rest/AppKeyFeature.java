package dynamicFeature.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

@Provider
public class AppKeyFeature implements DynamicFeature {


   

    private static final List APP_CLASS_LIST = Arrays.asList(UserResource.class);

    public void configure(ResourceInfo resourceInfo, FeatureContext context) {
    	context.register(AppRequestFilter.class).property("async-supported", true);
        if (APP_CLASS_LIST.contains(resourceInfo.getResourceClass())) {
            
        }
    }
}
