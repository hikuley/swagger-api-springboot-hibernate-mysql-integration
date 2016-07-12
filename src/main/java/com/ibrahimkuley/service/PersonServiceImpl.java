package com.ibrahimkuley.service;

import com.ibrahimkuley.dao.PersonDao;
import com.ibrahimkuley.entity.Person;
import com.ibrahimkuley.rest.model.PersonDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by halil_000 on 6/30/2016.
 */

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    ModelMapper modelMapper;

    public PersonServiceImpl() {
        modelMapper = new ModelMapper();
    }

    @Override
    public PersonDto create(PersonDto personDto) {
        Person person = modelMapper.map(personDto, Person.class);
        Person saved = personDao.save(person);
        PersonDto result = modelMapper.map(saved, PersonDto.class);
        return result;
    }

    @Override
    public PersonDto get(Integer id) {
        Person person = personDao.findOne(id);
        PersonDto result = modelMapper.map(person, PersonDto.class);
        return result;
    }

    @Override
    public void delete(Integer id) {
        personDao.delete(Integer.valueOf(id));
    }

    @Override
    public PersonDto update(PersonDto personDto) {
        Person person = modelMapper.map(personDto, Person.class);
        Person saved = personDao.save(person);
        System.out.println(23);
        PersonDto map = modelMapper.map(saved, PersonDto.class);
        return map;
    }

    @Override
    public List<PersonDto> getPersons() {
        List<PersonDto> personDtos = new ArrayList<PersonDto>();
        Iterable<Person> all = personDao.findAll();
        for (Person person : all) {
            PersonDto maped = modelMapper.map(person, PersonDto.class);
            personDtos.add(maped);
        }
        modelMapper.map(all, personDtos);
        return personDtos;
    }


}
