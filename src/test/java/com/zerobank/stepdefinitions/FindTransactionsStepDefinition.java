package com.zerobank.stepdefinitions;

import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;

public class FindTransactionsStepDefinition {
    LoginPage loginPage = new LoginPage();
    FindTransactionsPage findTransactionsPage = new FindTransactionsPage();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        loginPage.loggedIn();
        findTransactionsPage.navigateTo("account-activity");
        findTransactionsPage.clickToFindTransaction();
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {

    }

    @When("clicks search")
    public void clicks_search() {
        findTransactionsPage.clicksOnFind();
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) {

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {

    }

    //######################################################################

    @When("the user enters description “ONLINE”")
    public void the_user_enters_description_ONLINE() {
        findTransactionsPage.setDescription("ONLINE");
        BrowserUtilities.wait(1);
    }

    @Then("results table should only show descriptions containing “ONLINE”")
    public void results_table_should_only_show_descriptions_containing_ONLINE() {
        findTransactionsPage.listOfDescriptions("ONLINE");
    }

    @When("the user enters description “OFFICE”")
    public void the_user_enters_description_OFFICE() {
        Driver.getDriver().navigate().refresh();
        BrowserUtilities.wait(2);
        findTransactionsPage.clickToFindTransaction();
        findTransactionsPage.setDescription("OFFICE");
        BrowserUtilities.wait(1);
    }

    @Then("results table should only show descriptions containing “OFFICE”")
    public void results_table_should_only_show_descriptions_containing_OFFICE() {
        findTransactionsPage.listOfDescriptions("OFFICE");
    }

    @Then("results table should not show descriptions containing “OFFICE”")
    public void results_table_should_not_show_descriptions_containing_OFFICE() {
        Driver.getDriver().navigate().refresh();
        BrowserUtilities.wait(2);
        findTransactionsPage.clickToFindTransaction();
        findTransactionsPage.listOfDescriptions("");
        findTransactionsPage.defaultList("OFFICE");
        BrowserUtilities.wait(1);
    }

    @When("the user enters description “online”")
    public void the_user_enters_description_online() {
        Driver.getDriver().navigate().refresh();
        BrowserUtilities.wait(2);
        findTransactionsPage.clickToFindTransaction();
        findTransactionsPage.setDescription("online");
        BrowserUtilities.wait(1);
    }

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit()
    {
        findTransactionsPage.checkDeposits();
    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {
        findTransactionsPage.checkWithdrawals();
    }

    @When("user selects type “Deposit”")
    public void user_selects_type_Deposit() {
        findTransactionsPage.selectDropdown("Deposit");
        BrowserUtilities.wait(1);
    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal()
    {
        findTransactionsPage.checkWithdrawalLists();
    }

    @When("user selects type “Withdrawal”")
    public void user_selects_type_Withdrawal()
    {
        findTransactionsPage.selectDropdown("Withdrawal");
    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit()
    {
        findTransactionsPage.checkDepositLists();
    }


}
