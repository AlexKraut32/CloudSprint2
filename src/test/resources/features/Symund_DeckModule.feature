@B30G8-99
Feature: Default

	
	@B30G8-95
	Scenario: Verify user can create a new board 
		Scenario: User can create a new board
		     Given user is on the login page of the symund application
		    When User click Deck Module
		    And User should click Upcoming dropdown
		    And User should click add board and write "School"
		    Then User verify "School" is dispalyed.	

	
	@B30G8-96
	Scenario: Verify user should be able to create a new list of card/task under any board
		Scenario: User can create a new list for card/task under any board
		   Given user is on the login page of the symund application
		    When User click on any board and plus button
		    And User should write "List 1" in list name box
		    Then new list should displayed	

	
	@B30G8-97
	Scenario: Verify user can dd a new car/task on any list on the current board 
		Scenario:User can add a new card/task on any list on the current board
		    Given user is on the login page of the symund application
		    When user write "New card"
		    Then new card should display under board	

	
	@B30G8-98
	Scenario: Verify user can assign any card/task to himself by using three dots on the related card
		Scenario: User can assign any card/task to himself/herself by using the three dots on the related card
		    Given user is on the login page of the symund application
		    When user click on three dots
		    And user assign to himself
		    Then assign should display