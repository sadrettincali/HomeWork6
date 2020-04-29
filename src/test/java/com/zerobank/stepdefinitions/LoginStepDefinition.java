package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user in the login page")
    public void user_in_the_login_page() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(URL);
    }

    @When("user log in as a valid user")
    public void user_log_in_as_a_valid_user() {
        loginPage.login();
    }

    @Then("user should verify page title as a Zero - Account Summary")
    public void user_should_verify_page_title_as_a_Zero_Account_Summary() {
        String expectedTitle="Zero - Account Summary";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }


    @When("user log in with wrong credential")
    public void user_log_in_with_wrong_credential() {
       loginPage.login2("xxx","yyy");
    }

    @Then("user should verify warning message")
    public void user_should_verify_warning_message() {
        String expected= "Login and/or password are wrong.";
        String actual= loginPage.getWarning_message().getText().trim();
        System.out.println("actual = " + actual);
        Assert.assertEquals(expected,actual);
    }



}
