@checkout
Feature: Checkout

  @positive-test
  Scenario: Success checkout
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click on login button
    Then user is on homepage
    When user add two items to the cart
    And user click on cart button
    And user click on checkout button
    And user fills out the form with "Marcel", "Kurniawan", "11480"
    And user click on finish button
    Then user is on checkout success page
