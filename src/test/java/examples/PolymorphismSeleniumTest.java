package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountsOverviewPage;
import pages.LoginErrorPage;
import pages.LoginPage;

public class PolymorphismSeleniumTest {

    private WebDriver browser;

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
    public void testSeleniumCorrectLoginWithInheritance() {

        new LoginPage(browser).
            loginUsingCredentials("john", "demo");

        Assert.assertEquals(
            "Accounts Overview",
            new AccountsOverviewPage(browser).getPageTitle()
        );
    }

    @Test
    public void testSeleniumPolymorphism() {

        Assert.assertEquals(
            "Customer Login",
            new LoginPage(browser).getPageTitle()
        );
    }

    @After
    public void closeBrowser() {

        browser.quit();
    }

}
