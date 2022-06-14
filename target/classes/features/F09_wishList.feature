@regression
Feature: logged user could add products to wishlist
  Background: user login first
    Given user go to login page
    When user enter "mohamedgamal39@gmail.com" and "012345678999"
    And user click on login button
    Then user could login successfully


  Scenario: success massage is visible after adding product to wishlist
    When user add product to wishlist
    Then wishlist notification success is visible

  Scenario: number of wishlist item in home page is increased
    When user add product to wishlist
    When user click on wishlist link
    Then number of wishlist items increased