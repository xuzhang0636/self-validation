package com.xuzhang.selfvalidation.controller;

import com.xuzhang.selfvalidation.Model.Person;
import com.xuzhang.selfvalidation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Robert 2020/2/5
 */
@RestController
public class ValidationController {
    @Autowired
    PersonService personService;

    @PostMapping("/persons")
    public String savePerson(@Valid @RequestBody Person person) {
        personService.savePerson(person);
        return "success";
    }
}
