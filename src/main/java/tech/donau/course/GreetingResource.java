package tech.donau.course;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/hello")
public class GreetingResource {

    public static final String TOKEN = "dev";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello " + UUID.randomUUID().toString();
    }

    @GET
    @Path("/name/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("name") String name) {
        return "hello " + name;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getHello(@HeaderParam("token") String fname, @QueryParam("token") String lname) {
        String token = fname != null ? fname : lname;
        if (!token.equals(TOKEN)) {
            throw new RuntimeException("Unauthorized");
        }
        return "{\"key\":\"" + token + "\"}";
    }
}