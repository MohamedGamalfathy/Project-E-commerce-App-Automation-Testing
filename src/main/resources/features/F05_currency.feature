@regression
Feature: logged user could switch between currencies
  Background: user login first
    Given user go to login page
    When user enter "mohamedgamal39@gmail.com" and "012345678999"
    And user click on login button
    Then user could login successfully


  Scenario: user could select currency
    When user select currency
    Then user change currency successfully


