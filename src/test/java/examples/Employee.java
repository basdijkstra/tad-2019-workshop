package examples;

import lombok.Data;

@Data
public class Employee extends Person {

    private String profession = "tester";

    public Employee() {
        super();
    }

    @Override
    public String printInfo(){

        return String.format("%s is %d years old and is a %s",
            this.getName(), this.getAge(), this.getProfession());
    }
}
