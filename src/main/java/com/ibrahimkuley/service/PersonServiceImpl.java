package com.ibrahimkuley.service;

import com.ibrahimkuley.rest.model.Person;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by halil_000 on 6/30/2016.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person create(Person person) {
        return null;
    }

    @Override
    public Person get(String id) {
        Person person = new Person();
        person.setName("Halil");
        person.setAge(BigDecimal.valueOf(25));
        person.setEmail("ssoulless25@gmail.com");
        person.setId(BigDecimal.valueOf(2));
        person.setCreatedAt(new Date());
        person.setUpdatedAt(new Date());
        return person;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Person update(Person person) {
        return null;
    }

    @Override
    public List<Person> getPersons() {
        return null;
    }
}
