Feature: Qa symund account Deck modules verification
  Agile story: As a user, I should be able to manage my works by creating a new board/list/card and modifying
  them under Deck Module.

  Scenario: User can create a ne board
    Given User is on symund homepage
    When User click Deck Module
    And User should clik Upcoming dropdown
    And User should click add board and write new board
    Then User should be able to see new board under All boards


