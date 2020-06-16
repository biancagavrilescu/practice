package com.jibecompany.app.services;

import com.jibecompany.app.models.Person;

import java.util.List;

public interface PersonService {

    List<Person> listAll();

    Person getById(String id);

    Person saveOrUpdate(Person person);

    void delete(String id);

}
