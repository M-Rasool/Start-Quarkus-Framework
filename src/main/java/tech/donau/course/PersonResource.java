package tech.donau.course;

import tech.donau.course.data.Person;
import tech.donau.course.service.PersonService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("person")
public class PersonResource {

//    @Inject
//    PersonService personService;

    private static List<Person> persons = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersons() {
        return Response.ok(persons).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPerson(@Valid Person person) {
        // also you can create a class like personService and check Person there
//        personService.checkPerson(person);
        if (persons.size() > 5) {
            return Response.status(400).build();
        }
        persons.add(person);
        return Response.ok(person).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deletePerson(@PathParam("id") int id) {
        if (id >= persons.size()) {
            return Response.status(400).entity("Person Not Found").build();
        }
        return Response.ok(persons.remove(id)).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updatePerson(@PathParam("id") int id, Person person) {
        if (id >= persons.size()) {
            return Response.status(400).entity("Not Found Person").build();
        }
        persons.remove(id);
        persons.add(id, person);
        return Response.ok(person).build();
    }
}
