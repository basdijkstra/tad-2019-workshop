package exercises;

import org.junit.Assert;
import org.junit.Test;

public class InheritanceTest {

    @Test
    public void testPrintInfoBook() {

        // Arrange
        Book book = new Book();

        // Act and assert
        Assert.assertEquals(
            "'Lord of the Rings' is written by J.R.R. Tolkien",
            book.printInfo()
        );
    }

    @Test
    public void testDescribeMeBiography() {

        // Arrange
        Biography biography = new Biography();

        // Act and assert
        Assert.assertEquals(
            "'Lord of the Rings' chronicles the life of Frodo Baggins",
            biography.describeMe()
        );

    }
}
