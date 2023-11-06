@B30G8-108
Feature: Search functionalities and dashboard icon

	
	@B30G8-107
	Scenario: Verify user can search file through magnifying glass icon
		Given the user logged in as "User"
		Given user is on the dashboard
		    When user clicks on search bar
		    Then user searches for files or contacts through magnifying glass icon in any module
		    When user clicks on file
		    And user opens sidebar
		    Then user sees details inside page of file	

	
	@B30G8-109
	Scenario: Verify user can navigate to dashboard from app icon
		Given the user logged in as "User"
		Given user is on any page other than dashboard
		    When user can see app icon in left corner
		    And user clicks on app icon
		    Then user navigates back to dashboard