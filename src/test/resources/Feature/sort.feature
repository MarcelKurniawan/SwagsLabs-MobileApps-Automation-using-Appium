@sort
Feature: Sort

  @positive-test
  Scenario: Sorting items on the homepage from low to high price
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click on login button
    Then user is on homepage
    And user click on sort button
    Then first item price is smaller than the second item price