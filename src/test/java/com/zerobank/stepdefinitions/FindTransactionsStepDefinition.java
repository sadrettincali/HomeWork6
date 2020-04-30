package com.zerobank.stepdefinitions;

import com.zerobank.pages.FindTransactionsPage;
import com.zerobank.pages.LoginPage;
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

    @When("the user enters date range from “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void the_user_enters_date_range_from_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        //findTransactionsPage.enterDate(2012, 09, 01, 2012, 09, 06);
    }

    @When("clicks search")
    public void clicks_search() {
        findTransactionsPage.clicksOnFind();
    }

    @Then("results table should only show transactions dates between “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void results_table_should_only_show_transactions_dates_between_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }

    @Then("the results table should only not contain transactions dated “{int}-{int}-{int}”")
    public void the_results_table_should_only_not_contain_transactions_dated(Integer int1, Integer int2, Integer int3) {

    }
    //######################################################################

    @When("the user enters description “ONLINE”")
    public void the_user_enters_description_ONLINE() {
        findTransactionsPage.setDescription();
    }

    @Then("results table should only show descriptions containing “ONLINE”")
    public void results_table_should_only_show_descriptions_containing_ONLINE() {
        findTransactionsPage.listOfDescriptions();
    }

    @When("the user enters description “OFFICE”")
    public void the_user_enters_description_OFFICE() {

    }

    @Then("results table should only show descriptions containing “OFFICE”")
    public void results_table_should_only_show_descriptions_containing_OFFICE() {

    }

    @Then("results table should not show descriptions containing “OFFICE”")
    public void results_table_should_not_show_descriptions_containing_OFFICE() {

    }
}
