package ma.upm.persong2.controller.dto;

/**
 * @author : Elattar Saad
 * @version 1.0
 * @since 4/12/2021
 */
public class PersonDto {

    private Long id;
    private String name;
    private String age;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
