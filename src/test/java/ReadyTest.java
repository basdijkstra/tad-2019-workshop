import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.*;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static io.restassured.RestAssured.given;

public class ReadyTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(options().port(9876));

    @Test
    public void areYouReadyForTheWorkshopTest() {

        // Act
        given().
        when().
            get("http://localhost:9876/areyouready").
        then().
            assertThat().
            statusCode(200);
    }
}
