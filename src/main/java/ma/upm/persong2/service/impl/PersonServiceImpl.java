package ma.upm.persong2.service.impl;

import ma.upm.persong2.model.Person;
import ma.upm.persong2.repository.PersonRepository;
import ma.upm.persong2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Elattar Saad
 * @version 1.0
 * @since 11/12/2021
 */
@Service
public class PersonServiceImpl implements PersonService {

    final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }
}
