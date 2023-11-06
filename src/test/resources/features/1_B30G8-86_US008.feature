
Feature: Contact Group Functionality under Contacts Module
    Agile story: As a user, I should be able to create a new group and add any contact into a group under Contacts module

    Background:

      Given user go to the login page
      When user enters "User44" and a "Userpass123"
      Then user click Log in button
      And user landing on the Home page


    Scenario: User can create a new group under Contacts Module
      Given User is on Contacts page
      When User press plus button
      And User sees Create a new group window
      Then User types group name in the text area and press enter
      | Cinema |
      | Music  |
      | Theatre|

    Scenario: User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
      Given User clicks All contacts module
      When User clicks Create contacts button
      And User clicks Groups dropdown menu
      Then User can see all the available groups name
      | Cinema |
      | Music  |
      | Theatre|

    Scenario: User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.
      Given User clicks Add property dropdown menu
      When User choose Anniversary from the list
      Then User can see Anniversary block