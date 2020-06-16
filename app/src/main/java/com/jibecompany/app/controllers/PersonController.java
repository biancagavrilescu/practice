package com.jibecompany.app.controllers;


import com.jibecompany.app.models.Person;
import com.jibecompany.app.repositories.PersonRepository;
import com.jibecompany.app.services.PersonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/person")
public class PersonController {

    private PersonService personService;

    //    @Autowired
//    private PersonRepository personRepository;
    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

//    @GetMapping
//    public List<Person> list(){
//        return personRepository.findAll();
//    }


    @GetMapping
    @RequestMapping("{id}")
    public Person get(@PathVariable String id) {
        return personService.getById(id);
    }

    @PostMapping
    // @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody final Person person) {
        return personService.saveOrUpdate(person);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String nume) {
        personService.delete(nume);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Person update(@PathVariable String id, @RequestBody Person person) {
        Person existingPerson = personService.getById(id);
        BeanUtils.copyProperties(person, existingPerson, "id");
        return personService.saveOrUpdate(existingPerson);
    }


}
