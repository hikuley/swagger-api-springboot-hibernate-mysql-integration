package com.ibrahimkuley.service;

import com.ibrahimkuley.rest.model.Person;

import java.math.BigDecimal;

/**
 * Created by halil_000 on 6/30/2016.
 */
public interface PersonService {

    Person create(Person person);

    Person get(BigDecimal id);

    void delete(BigDecimal id);




}
