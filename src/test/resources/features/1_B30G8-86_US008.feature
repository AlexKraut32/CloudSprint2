
Feature: Default

	Background:
		Given user go to the login page
		When user enters "User44" and a "Userpass123"
		Then user click Log in button
		And user landing on the Home pageB

	

	Scenario: User can create a new group under Contacts Module
		Scenario: User can create a new group under Contacts Module
				Given User is on Contacts page
				      When User press plus button
				      And User sees Create a new group window
				      Then User types group name in the text area and press enter
				      | Cinema |
				      | Music  |
				      | Theatre|
				      Then User should create new contact and add to the groups	

	

	Scenario: User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
		Scenario: User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
				Given User is on Contacts page
					  When User clicks All contacts module
				      And User clicks Groups dropdown menu
				      Then User can see all the available groups name
				      | Cinema |
				      | Music  |
				      | Theatre|	

	

	Scenario: User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.
		Scenario: User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.
				Given User is on Contacts page
					  When User clicks All contacts module
			          And User clicks Add property dropdown menu
				      Then User choose Anniversary from the list
				      Then User can see Anniversary block