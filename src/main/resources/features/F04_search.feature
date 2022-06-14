@regression
Feature: logged users will be able to search for products with different parameters
  Background: user login first
    Given user go to login page
    When user enter "mohamedgamal39@gmail.com" and "012345678999"
    And user click on login button
    Then user could login successfully



  Scenario: user could search using product name
    When user write product name "Apple"
    And user click on search button
    Then the search has been completed successfully and get "Apple"

  Scenario: user could search using product sku
    When user write product sku "AP_MBP_13"
    And user click on search button
    And user select product
    Then the search has been completed successfully and get sku "AP_MBP_13"


