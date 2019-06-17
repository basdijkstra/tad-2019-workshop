package examples;

import helpers.SeleniumHelpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountsOverviewPage;
import pages.ParabankLoginPage;

public class EncapsulationSeleniumTest {

    private WebDriver browser;
    private SeleniumHelpers seleniumHelpers = new SeleniumHelpers();

    @BeforeClass
    public static void manageBrowserDriver() {

        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void initBrowser() {

        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }

    @Test
    public void testSeleniumWithoutEncapsulation() {

        browser.navigate().to("http://parabank.parasoft.com");

        seleniumHelpers.sendKeys(browser, By.name("username"), "john");
        seleniumHelpers.sendKeys(browser, By.name("password"), "demo");
        seleniumHelpers.click(browser, By.xpath("//input[@value='Log In']"));

        Assert.assertEquals(
            "Accounts Overview",
            seleniumHelpers.getElementText(browser, By.tagName("h1"))
        );
    }

    @Test
    public void testSeleniumWithEncapsulation() {

        new ParabankLoginPage(browser).
            loginUsingCredentials("john", "demo");

        Assert.assertEquals(
            "Accounts Overview",
            new AccountsOverviewPage(browser).getPageTitle()
        );
    }

    @After
    public void closeBrowser() {

        browser.quit();
    }

}
