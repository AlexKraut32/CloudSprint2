@B30G8-80
Feature: Dashboard Functionality
  Agile Story: User should be able to modify Dashboard page

  Scenario: After Login user can see all modules and Username.
    Given user go to the login page
    When user enters "User1" and a "Userpass123"
    Then user click Log in button
    And user landing on the Home page


  Scenario: User can click on Customize button and select any of the Widgets.

  Scenario: User can click on Set Status button and select any of the Status options.
