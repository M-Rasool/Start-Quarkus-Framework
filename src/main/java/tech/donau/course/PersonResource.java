package tech.donau.course;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("person")
public class PersonResource {

    private List<String> persons = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPersons() {
        return persons.toString();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String addPerson(@PathParam("name") String name) {
        persons.add(name);
        return name;
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{id}")
    public String deletePerson(@PathParam("id") int id) {
        return persons.remove(id);
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{id}")
    public String updatePerson(@PathParam("id") int id, String name) {
        persons.remove(id);
        persons.add(id, name);
        return name;
    }
}
