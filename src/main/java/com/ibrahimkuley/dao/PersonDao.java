package com.ibrahimkuley.dao;

import com.ibrahimkuley.entity.Person;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by hikuley on 30.06.2016.
 */

@Transactional
public interface PersonDao extends CrudRepository<Person, Integer> {
}
