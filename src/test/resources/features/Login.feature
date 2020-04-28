Feature: Login



  Scenario: Login to application
    Given user in the login page
    When user log in as a valid user
    Then user should verify page title as a Zero - Account Summary



