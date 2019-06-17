package answers;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import answers.Car;
import org.junit.*;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static io.restassured.RestAssured.given;

public class EncapsulationTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(options().port(9876));

    private Car car;

    @Before
    public void createCar() {

        car = new Car("Maserati", "Ghibli", 2019);
    }

    @Test
    public void testAddressSerialization() {

        // Act
        given().
            log().body().
        and().
            body(car).
        when().
            post("http://localhost:9876/car").
        then().
            assertThat().
            statusCode(200);
    }
}
