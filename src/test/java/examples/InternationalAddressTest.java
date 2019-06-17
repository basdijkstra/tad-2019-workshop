package examples;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static io.restassured.RestAssured.given;

public class InternationalAddressTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(options().port(9876));

    private InternationalAddress internationalAddress;

    @Before
    public void createAddress() {

        internationalAddress = new InternationalAddress();
    }

    @Test
    public void testInternationalAddressSerialization() {

        // Act
        given().
            log().body().
        and().
            body(internationalAddress).
        when().
            post("http://localhost:9876/internationaladdress").
        then().
            assertThat().
            statusCode(200);
    }

    @Test
    public void testPrintCityAndCountry() {

        // Act and assert
        Assert.assertEquals(
            "Test City, Test Country",
            internationalAddress.printCityAndCountryForAddress()
        );
    }
}
