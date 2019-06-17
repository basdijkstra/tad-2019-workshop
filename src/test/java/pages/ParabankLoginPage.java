package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.*;

public class ParabankLoginPage {

    private WebDriver _driver;
    private SeleniumHelpers seleniumHelpers = new SeleniumHelpers();

    private By textfieldUsername = By.name("username");
    private By textfieldPassword = By.name("password");
    private By buttonLogin = By.xpath("//input[@value='Log In']");

    public ParabankLoginPage(WebDriver driver) {

        _driver = driver;
        _driver.navigate().to("http://parabank.parasoft.com");
    }

    private ParabankLoginPage setUsername(String username) {

        seleniumHelpers.sendKeys(_driver, textfieldUsername, username);
        return this;
    }

    private ParabankLoginPage setPassword(String password) {

        seleniumHelpers.sendKeys(_driver, textfieldPassword, password);
        return this;
    }

    private void clickLoginButton() {

        seleniumHelpers.click(_driver, buttonLogin);
    }

    public void loginUsingCredentials(String username, String password) {

        setUsername(username).setPassword(password).clickLoginButton();
    }
}
