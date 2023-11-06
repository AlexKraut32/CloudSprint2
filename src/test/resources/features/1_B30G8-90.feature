@B30G8-121
Feature: Default

	Background:
		#@B30G8-123
		Given user go to the login page
		    When user enters "User1" and a "Userpass123"
		    Then user click Log in button
		    And user landing on the Home page
		

	
	@B30G8-112
	Scenario: User can see at least following titles inside “Personal Info” under Profile Settings page: Full name/Email/Phone Number
		When User navigate to the "Settings"
		    Then User should see the "Personal Info" section
		    And the "Personal Info" section should contain the following titles:
		      | Full name      |
		      | Email          |
		      | Phone number   |	

	
	@B30G8-119
	Scenario: Name of the user in the Settings field should be the same with Full Name input box
		Given User on the settings page
		    When user see the "Full Name" input box  
		    And user see the "Settings Name" in the settings field
		    Then the "Full Name" input box  should be the same as the "Settings Name"	

	
	@B30G8-120
	Scenario: User cannot pass any characters except numbers into the "Phone Number" input box
		Given User on the page with the phone number input box
		  When User enter a non-numeric character into the phone number input box
		  Then the non-numeric character is not entered into the input box
		  When User enter a numeric character into the phone number input box
		  Then the numeric character is entered into the input box