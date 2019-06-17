package examples;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static io.restassured.RestAssured.given;

public class AddressLombokTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(options().port(9876));

    private AddressLombok address;

    @Before
    public void createAddress() {

        address = new AddressLombok("Test Street", 1, 12345, "Test City");
    }

    @Test
    public void testAddressSerialization() {

        // Act
        given().
            log().body().
        and().
            body(address).
        when().
            post("http://localhost:9876/address").
        then().
            assertThat().
            statusCode(200);
    }
}
