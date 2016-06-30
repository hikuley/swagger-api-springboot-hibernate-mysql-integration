package com.ibrahimkuley.service;

import com.ibrahimkuley.dao.PersonDao;
import com.ibrahimkuley.entity.Person;
import com.ibrahimkuley.rest.model.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
        PersonDto personDto = parseToDto(person);
        return personDto;
    }

    @Override
    public void delete(String id) {
        personDao.delete(Integer.valueOf(id));
    }

    @Override
    public PersonDto update(PersonDto personDto) {
        Person person = personDao.save(parseToEntity(personDto));
        PersonDto resultDto = parseToDto(person);
        return resultDto;
    }

    @Override
    public List<PersonDto> getPersons() {
        return null;
    }


    public PersonDto parseToDto(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setId(BigDecimal.valueOf(person.getId()));
        personDto.setName(person.getName());
        personDto.setEmail(person.getEmail());
        personDto.setAge(BigDecimal.valueOf(person.getAge()));
        personDto.setCreatedAt(person.getCreatedAt());
        personDto.setUpdatedAt(person.getUpdatedAt());
        return personDto;
    }

    public Person parseToEntity(PersonDto personDto) {
        Person person = new Person();
        person.setId(Integer.valueOf(String.valueOf(personDto.getId())));
        person.setName(personDto.getName());
        person.setEmail(personDto.getEmail());
        person.setAge(person.getAge());
        person.setCreatedAt(personDto.getCreatedAt());
        person.setUpdatedAt(personDto.getUpdatedAt());
        return person;
    }

}
