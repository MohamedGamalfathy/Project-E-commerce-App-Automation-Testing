@regression
Feature: user could reset his\her password
  Background: user go to login page
    Given user open login page

    Scenario:user could reset his\her password successfully
      When user click on forget password
      And user write email "mohamedgamal39@gmail.com"
      And user click on recover button
      Then user get success massage
