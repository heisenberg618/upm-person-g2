package ma.upm.persong2.model;

import org.springframework.stereotype.Component;

/**
 * @author : Elattar Saad
 * @version 1.0
 * @since 4/12/2021
 */
public class Person {

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
