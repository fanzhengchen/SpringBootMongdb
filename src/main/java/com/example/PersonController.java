package com.example;

import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanzhengchen on 2/7/16.
 */
@RequestMapping("/person")
@RestController
public class PersonController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Person gao(){
        Person person = new Person();
        person.setFirstName("w");
        person.setLastName("q");
        return person;
    }

}
