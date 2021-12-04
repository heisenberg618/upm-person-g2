package ma.upm.persong2.controller;

import ma.upm.persong2.controller.dto.PersonDto;
import ma.upm.persong2.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @author : Elattar Saad
 * @version 1.0
 * @since 4/12/2021
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @GetMapping("/sayHello1")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/sayHello2")
    public String sayHello2(){
        return "Hello2";
    }

    @GetMapping("/{name}")
    public String sayHello3(@PathVariable("name") String name2){
        return "Hello "+name2;
    }

    @GetMapping("/name/{name}/age/{age}")
    public String sayHelloWithName(@PathVariable("name") String name2, @PathVariable String age){
        return "Hello "+name2+" Age "+age;
    }

    @GetMapping("/")
    public String sayHelloWithNamePrams(@PathParam("name") String name2, @PathParam("age") String age){
        return "Hello "+name2+" Age "+age;
    }

    @PostMapping("/")
    public ResponseEntity<PersonDto> retrievePerson(@RequestBody Person person){
        PersonDto personDto = new PersonDto();
        personDto.setId(1L);
        personDto.setName(person.getName() + "UPM");
        personDto.setAge(person.getAge()+" Ans");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personDto);
    }

}
