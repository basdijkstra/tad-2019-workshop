package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class InheritanceSeleniumTest {

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

        new ParabankLoginPage(browser).
            loginUsingCredentials("john", "demo");

        Assert.assertEquals(
            "Accounts Overview",
            new AccountsOverviewPage(browser).getPageTitle()
        );
    }

    @Test
    public void testSeleniumIncorrectLoginWithInheritance() {

        new ParabankLoginPage(browser).
            loginUsingCredentials("john", "incorrect");

        Assert.assertEquals(
            "Error!",
            new LoginErrorPage(browser).getPageTitle()
        );
    }

    @After
    public void closeBrowser() {

        browser.quit();
    }

}
