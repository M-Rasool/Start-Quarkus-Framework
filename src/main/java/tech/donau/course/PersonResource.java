package tech.donau.course;

import tech.donau.course.data.Person;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("person")
public class PersonResource {

    private static List<Person> persons = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons() {
        return persons;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Person addPerson(Person person) {
        persons.add(person);
        return person;
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person deletePerson(@PathParam("id") int id) {
        return persons.remove(id);
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person updatePerson(@PathParam("id") int id, Person person) {
        persons.remove(id);
        persons.add(id, person);
        return person;
    }
}
