package com.ibrahimkuley.service;

import com.ibrahimkuley.rest.model.Person;

import java.util.List;

/**
 * Created by halil_000 on 6/30/2016.
 */

public interface PersonService {

    Person create(Person person);

    Person get(String id);

    void delete(String id);

    Person update(Person person);

    List<Person> getPersons();

}
