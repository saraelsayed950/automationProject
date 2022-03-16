@smoke
Feature: Register | users could use login functionality to open their accounts

  Scenario:user could register with his\her data
    Given user go to login page
    When user entered "firstname" "lastname" "email" "password"
    And user press on register button
    Then The registration page displayed successfully
