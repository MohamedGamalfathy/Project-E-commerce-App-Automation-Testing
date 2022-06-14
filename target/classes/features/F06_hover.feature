@regression
Feature: logged user could hover categories and select sub category
  Background: user login first
    Given user go to login page
    When user enter "mohamedgamal39@gmail.com" and "012345678999"
    And user click on login button
    Then user could login successfully


  Scenario: user could hover categories

    When user hover category and select subcategory
    Then user could hover successfully




