@regression
Feature: logged users could open followUs links
  Background: user login first
    Given user go to login page
    When user enter "mohamedgamal39@gmail.com" and "012345678999"
    And user click on login button
    Then user could login successfully


  Scenario: user could open facebook link
    When user click on facebook icon
    Then "https://www.facebook.com/nopCommerce" is opened in new tab

  Scenario: user could open twitter link
    When user click on twitter icon
    Then "https://twitter.com/nopCommerce" is opened in new tab

  Scenario: user could open rss link
    When user click on rss icon
    Then "https://www.rss.com/user/nopCommerce" is opened in new rss tab

  Scenario: user could open youtube link
    When user click on youtube icon
    Then "https://www.youtube.com/user/nopCommerce" is opened in new tab
