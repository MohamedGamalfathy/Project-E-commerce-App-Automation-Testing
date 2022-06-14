@regression
Feature: user could log in to his\her account
  Background: user go to login page
    Given user go to login page

  Scenario: User could login with valid data
    When user enter "mohamedgamal39@gmail.com" and "012345678999"
    And user click on login button
    Then user could login successfully


