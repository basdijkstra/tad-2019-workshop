package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.*;

public class AccountsOverviewPage {

    private WebDriver _driver;
    private SeleniumHelpers seleniumHelpers = new SeleniumHelpers();

    private By textfieldPageHeader = By.tagName("h1");

    public AccountsOverviewPage(WebDriver driver) {

        _driver = driver;
    }

    public String getPageTitle() {

        return seleniumHelpers.getElementText(_driver, textfieldPageHeader);
    }
}
