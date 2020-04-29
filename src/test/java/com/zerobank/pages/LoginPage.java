package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(id = "user_login")
    private WebElement username;

    @FindBy(id = "user_password")
    private WebElement password;

    @FindBy(id = "signin_button")
    private WebElement login;

    @FindBy(xpath = "//div[contains(text(),'Login and/or password are wrong')]")
    private WebElement warning_message;



    public void login() {
        login.click();
        BrowserUtilities.wait(2);
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
    }

    public void loggedIn() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(URL);
        login.click();
        BrowserUtilities.wait(2);
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
    }

    public void login2(String username2, String password2) {
        login.click();
        BrowserUtilities.wait(2);
        username.sendKeys(username2);
        password.sendKeys(password2, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(10);
    }

    public WebElement getWarning_message() {
        return warning_message;
    }



}
