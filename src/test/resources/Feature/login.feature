@login
Feature: Login

  @positive-test
  Scenario: Login with valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click on login button
    Then user is on homepage

  @negative-test
  Scenario: Login with invalid email and password
    Given user is on login page
    And user input username with "wrong_user"
    And user input password with "secret_sauce"
    When user click on login button
    Then user is able to see error message