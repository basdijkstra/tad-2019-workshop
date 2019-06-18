package exercises;

import org.junit.Assert;
import org.junit.Test;

public class PolymorphismTest {

    @Test
    public void testOverloading() {

        // Arrange
        Album album = new Album();
        //Album album = new Album("Alanis Morissette", "Jagged Little Pill", 1994);

        // Act and assert
        Assert.assertEquals(
            "The Alanis Morissette album titled 'Jagged Little Pill' was released in 1994",
            album.printInfo()
        );
    }

    @Test
    public void testOverriding() {

        // Arrange
        LimitedEdition limitedEdition = new LimitedEdition();
        limitedEdition.setTitle("Jagged Little Pill");

        // Act and assert
        Assert.assertEquals(
            "'Jagged Little Pill' was released as a limited edition on multi-colored marble vinyl",
            limitedEdition.printInfo()
        );
    }
}
