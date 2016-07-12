package com.ibrahimkuley.service;

import com.ibrahimkuley.dao.PersonDao;
import com.ibrahimkuley.entity.Person;
import com.ibrahimkuley.rest.model.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by halil_000 on 6/30/2016.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    @Override
    public PersonDto create(PersonDto personDto) {
        return null;
    }

    @Override
    public PersonDto get(Integer id) {
        Person person = personDao.findOne(id);
//        PersonDto personDto = parseToDto(person);
        return null;
    }

    @Override
    public void delete(Integer id) {
        personDao.delete(Integer.valueOf(id));
    }

    @Override
    public PersonDto update(PersonDto personDto) {
//        Person person = personDao.save(parseToEntity(personDto));
//        PersonDto resultDto = parseToDto(person);
        return null;
    }

    @Override
    public List<PersonDto> getPersons() {
        return null;
    }


}
