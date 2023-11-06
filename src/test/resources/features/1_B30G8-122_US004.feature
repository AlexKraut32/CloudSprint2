@B30G8-99
Feature: Deck Module Functionalities
	Agile story: As a user, I should be able to manage my works by creating a new board/list/card and
	modifying them under Deck Module.



	Background:
		#@B30G8-122
		   Given user go to the login page
		    When user enters "User1" and a "Userpass123"
		    Then user click Log in button
		    And user landing on the Home page
		

	
	@B30G8-95
	Scenario: Verify user can create a new board 
		When User click Deck Module
		    And User should click Upcoming dropdown
		    And User should click add board and write "School"
		    Then User verify "School" is displayed.	

	
	@B30G8-96
	Scenario: Verify user should be able to create a new list of card/task under any board
		When User click deck module button
		    And User click on any board and plus button
		    And User should write "List 1" in list name box
		    Then new list should displayed	

	
	@B30G8-97
	Scenario: Verify user can dd a new car/task on any list on the current board 
		When User click deck module button
		    And user click on Add card button
		    And  user write "New card" inside the Card name box
		    Then new card should display under board	

	
	@B30G8-98
	Scenario: Verify user can assign any card/task to himself by using three dots on the related card
		When User click deck module button
		   And user click on three dots
		    And user assign to himself
		    Then assign should display