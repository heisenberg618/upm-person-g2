package ma.upm.persong2.service.impl;

import ma.upm.persong2.model.Person;
import ma.upm.persong2.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * @author : Elattar Saad
 * @version 1.0
 * @since 11/12/2021
 */
@Service
public class PersonServiceImpl2 implements PersonService {
    @Override
    public Person save(Person person) {
        person.setAge(person.getAge() + 24);
        person.setName(person.getName() + " UCA");
        return person;
    }
}
