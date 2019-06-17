package exercises;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static io.restassured.RestAssured.given;

public class EncapsulationLombokTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(options().port(9876));

    private CarLombok car;

    @Before
    public void createCar() {

        car = new CarLombok("Maserati", "Ghibli", 2019);
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
