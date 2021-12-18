package ma.upm.persong2.controller;

import ma.upm.persong2.controller.dto.PersonDto;
import ma.upm.persong2.model.Person;
import ma.upm.persong2.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author : Elattar Saad
 * @version 1.0
 * @since 4/12/2021
 */
@RestController
@RequestMapping("person")
public class PersonController {

    final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    //    @PostMapping("/")
//    public Person save(@RequestBody Person person) {
//        return personService.save(person);
//    }

    @PostMapping("/")
    public PersonDto save(@Valid @RequestBody PersonDto personDto) {
        return personDto;
    }

}
