package examples;

import org.junit.Assert;
import org.junit.Test;

public class PolymorphismTest {

    @Test
    public void testPrintInfoPerson() {

        Person person = new Person();

        Assert.assertEquals(
            "John Doe is 35 years old",
            person.printInfo()
        );
    }

    @Test
    public void testPersonConstructor() {

        Person person = new Person("Jane Smith",24);

        Assert.assertEquals(
            "Jane Smith is 24 years old",
            person.printInfo()
        );
    }

    @Test
    public void testPrintInfoEmployee() {

        Employee employee = new Employee();

        Assert.assertEquals(
            "John Doe is 35 years old and is a tester",
            employee.printInfo()
        );
    }
}
