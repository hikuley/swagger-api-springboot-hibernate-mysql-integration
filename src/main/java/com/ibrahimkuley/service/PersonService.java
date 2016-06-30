package com.ibrahimkuley.service;

import com.ibrahimkuley.rest.model.PersonDto;

import java.util.List;

/**
 * Created by halil_000 on 6/30/2016.
 */
public interface PersonService {

    PersonDto create(PersonDto personDto);

    PersonDto get(Integer id);

    void delete(String id);

    PersonDto update(PersonDto personDto);

    List<PersonDto> getPersons();

}
