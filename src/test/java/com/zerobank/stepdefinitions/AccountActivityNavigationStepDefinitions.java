package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityNavigationPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class AccountActivityNavigationStepDefinitions {
    LoginPage loginPage = new LoginPage();
    AccountActivityNavigationPage accountActivityNavigationPage = new AccountActivityNavigationPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        loginPage.loggedIn();
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        accountActivityNavigationPage.clickOnSavings();
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String actual = Driver.getDriver().getTitle();
        String expected = "Zero - Account Activity";
        Assert.assertEquals(actual, expected);
    }


    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        accountActivityNavigationPage.clickOnBrokerage();
    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        accountActivityNavigationPage.selectedOption("Savings");
    }

    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        accountActivityNavigationPage.selectedOption("Brokerage");
    }

    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        accountActivityNavigationPage.selectedOption("Checking");
    }


    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        accountActivityNavigationPage.clickOnChecking();
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        accountActivityNavigationPage.clickOnCreditCard();
    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        accountActivityNavigationPage.selectedOption("Credit Card");
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
       accountActivityNavigationPage.clickOnLoan();
    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        accountActivityNavigationPage.selectedOption("Loan");
    }




}
