package tech.donau.course.data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Person {

    @NotBlank(message = "Name can't be blank")
    private String name;

    @Min(value = 1L, message = "Minimum id number is 1")
    private Integer id;

    @NotBlank(message = "Family can't be blank")
    private String family;

    public Person() {}

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
