@B30G8-132
Feature: File Module Functionalities
Agile story: As a user, I should be able to add a file to favorites, rename any file
and give some comments on any file.

	Background:
		#@B30G8-131
		 Given user go to the login page
		 When user enters "Employee8" and a "Employee123"
		 Then user click Log in button
		 And user landing on the Home page
		

	
	@B30G8-128
	Scenario: User can add any file to favorites from its own three dots menu.
		When user click on file module and user click all file
		And User click on three dots from its own click add favroites 
		Then user should see newly added file in favorites	

	
	@B30G8-129
	Scenario: User can rename any file from its own three dots menu.
		When user click on file module and click on all file
		And user click three dots on its own and click rename
		Then user "galaxy" the file	

	
	@B30G8-130
	Scenario: User can put some comments on any file from the file details menu opened right side.
		When user click on file module and click on all file
		And user click on three dots on its own and click details 
		Then user click on comments and write "Nice pic" and press enter