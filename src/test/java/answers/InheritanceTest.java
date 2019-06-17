package answers;

import org.junit.*;

public class InheritanceTest {

    @Test
    public void testPrintAnnouncement() {

        // Arrange
        CarAward carAward = new CarAward();

        // Act and assert
        Assert.assertEquals(
            "The 2019 Maserati Ghibli won the 'Useless award' in 2019",
            carAward.printAnnouncement()
        );
    }
}
