package dynamicFeature.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.container.TimeoutHandler;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
public class UserResource {

    

  
  
    @GET
    @Path("getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List getAll() throws Exception {
      List<String> strings = new ArrayList<String>();
      strings.add("test");
        return strings;
    }
//i tried to find async during dynamic bindig colud not find something usefull
//I REALLY TRIED TO FIND
    /*
    @GET
	@Path("/alluser")
	public void getUserListNotExecuteHandleTimeout(@Suspended final AsyncResponse ar) throws InterruptedException {
		System.out.println("Async Rsponse method end");
		ar.setTimeoutHandler(new TimeoutHandler() {

			public void handleTimeout(AsyncResponse asyncResponse) {
				System.out.println("Async Rsponse method start");
				Map<Integer, String> map = new HashMap<Integer,String>();
				map.put(1, "string1");
				map.put(2, "string2");
				//UserList userList = new UserList(map.values().stream().collect(Collectors.toList()));
			//	System.out.println("Printing Aysnc Method task: " + userList.toString());
				asyncResponse.resume(
						Response.status(Response.Status.SERVICE_UNAVAILABLE).entity("From Async Response: " + map.toString()).build());
				System.out.println("Async Rsponse method end");
			}
		});
		ar.setTimeout(10000, TimeUnit.MILLISECONDS);

		new Thread(new Runnable() {

			public void run() {
				System.out.println("Thread Started");
				ar.resume(Response.status(Response.Status.OK).entity("From Thread: " + getUserList().toString()).build());
				System.out.println("Thread finished Started");
			}

			private Map getUserList() {
				Map<Integer, String> map = new HashMap<Integer,String>();
				map.put(1, "string1");
				map.put(2, "string2");
				return map;
			}
		}).start();
		System.out.println("Async Rsponse method end");
	}
	*/
}
