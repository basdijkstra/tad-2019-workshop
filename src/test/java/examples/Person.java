package examples;

import lombok.Data;

@Data
public class Person {

    private String name = "John Doe";
    private int age = 35;

    public Person() {
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String printInfo() {
        return String.format("%s is %d years old", this.getName(), this.getAge());
    }
}
