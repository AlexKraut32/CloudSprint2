@B30G8-136
Feature: Default

	Background:

		Given user go to the login page
		When user enters "User44" and a "Userpass123"
		Then user click Log in button
		And user landing on the Home page
	
	@B30G8-133
	Scenario: User can create a new group under Contacts Module
		Given User is on Contacts page
		      When User press plus button
		      And User sees Create a new group window
		      Then User types group name in the text area and press enter
		      | Cinema |
		      | Music  |
		      | Theatre|	

	
	@B30G8-134
	Scenario: User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
		Given User clicks All contacts module
		      When User clicks Create contacts button
		      And User clicks Groups dropdown menu
		      Then User can see all the available groups name
		      | Cinema |
		      | Music  |
		      | Theatre|	

	
	@B30G8-135
	Scenario: User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.
		Given User clicks Add property dropdown menu
		      When User choose Anniversary from the list
		      Then User can see Anniversary block