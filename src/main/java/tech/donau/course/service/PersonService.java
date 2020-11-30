package tech.donau.course.service;

import tech.donau.course.data.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;

@ApplicationScoped
public class PersonService {

    public Person checkPerson(@Valid Person person) {
        return person;
    }
}
