package examples;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.*;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static io.restassured.RestAssured.given;

public class AddressTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(options().port(9876));

    private Address address;

    @Before
    public void createAddress() {

        address = new Address("Test Street", 1, 12345, "Test City");
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

    @Test
    public void testAddressCreation() {

        // Act
        address.setCity("New City");

        // Assert
        Assert.assertEquals("New City", address.getCity());
    }
}
