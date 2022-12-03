package dynamicFeature.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.io.IOException;

public class AppRequestFilter implements ContainerRequestFilter {

    private final static Logger LOGGER = LoggerFactory.getLogger(AppRequestFilter.class);

    private final static String APP_KEY = "994f4fe4-APP-KEY-f3d5af27e1ee";

    @Context
    private HttpServletRequest httpServletRequest;

    public void filter(ContainerRequestContext requestContext) throws IOException {

        String appKeyValueFromHeader = requestContext.getHeaderString("APP-KEY");
      //  appKeyValueFromHeader=APP_KEY;
        LOGGER.info("APP Key:{}", appKeyValueFromHeader);
        if (!APP_KEY.equals(appKeyValueFromHeader) ) {
            requestContext.abortWith(Response.status(Status.UNAUTHORIZED)
                                           
                                             .build());

        }
    }
}