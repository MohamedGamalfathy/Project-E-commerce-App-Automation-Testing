@regression
Feature: users could  make a registration on the website to create an account

Background: user go to register page
  Given user go to register page

  Scenario: User could register with valid data
    When user fill your personal details field
    And user fill company details
    And user fill your password field
    And user click on register button
    Then user could register successfully
