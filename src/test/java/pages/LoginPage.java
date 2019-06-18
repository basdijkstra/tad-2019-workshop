package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.*;

public class LoginPage extends BasePage {

    private WebDriver _driver;
    private SeleniumHelpers seleniumHelpers = new SeleniumHelpers();

    private By textfieldUsername = By.name("username");
    private By textfieldPassword = By.name("password");
    private By buttonLogin = By.xpath("//input[@value='Log In']");
    private By textfieldPageHeader = By.tagName("h2");

    public LoginPage(WebDriver driver) {

        super(driver);
        _driver = driver;
        _driver.navigate().to("http://parabank.parasoft.com");
    }

    private LoginPage setUsername(String username) {

        seleniumHelpers.sendKeys(_driver, textfieldUsername, username);
        return this;
    }

    private LoginPage setPassword(String password) {

        seleniumHelpers.sendKeys(_driver, textfieldPassword, password);
        return this;
    }

    private void clickLoginButton() {

        seleniumHelpers.click(_driver, buttonLogin);
    }

    public void loginUsingCredentials(String username, String password) {

        setUsername(username).setPassword(password).clickLoginButton();
    }

    @Override
    public String getPageTitle() {

        return seleniumHelpers.getElementText(_driver, textfieldPageHeader);
    }
}
