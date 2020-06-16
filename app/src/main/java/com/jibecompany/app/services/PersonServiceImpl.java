package com.jibecompany.app.services;

import com.jibecompany.app.models.Person;
import com.jibecompany.app.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {


    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> listAll() {
        List<Person> persons = new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
    }

    @Override
    public Person getById(String id) {
        return personRepository.findById(id).orElse(null);
    }

    @Override
    public Person saveOrUpdate(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public void delete(String id) {
        personRepository.deleteById(id);
    }
}

