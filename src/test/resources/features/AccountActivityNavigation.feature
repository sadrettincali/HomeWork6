Feature: Navigating to specific accounts in Accounts Activity

  Background:
    Given the user is logged in

  @Savings
  Scenario: Savings account redirect
    When the user clicks on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Savings selected

  @Brokerage
  Scenario: Brokerage account redirect
    When the user clicks on Brokerage link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Brokerage selected

    @Checking
  Scenario: Checking account redirect
    When the user clicks on Checking link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Checking selected

  @CreditCard
  Scenario: Credit Card account redirect
    When the user clicks on Credit card link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Credit Card selected

    @Loan
  Scenario: Loan account redirect
    When the user clicks on Loan link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Loan selected