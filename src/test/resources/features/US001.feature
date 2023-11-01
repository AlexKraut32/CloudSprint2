Feature: Dashboard Functionality
  Agile Story: User should be able to modify Dashboard page

  #@B30G8-92
  Background: User can successfully logged in to the Home page
    Given user go to the login page
    When user enters "User1" and a "Userpass123"
    Then user click Log in button
    And user landing on the Home page

  @B30G8-102
  Scenario Outline: After Login user can see all modules and Username.
    Then user check if all "<Modules>" presented on the page
    And user check if Username is showing on the Home page
    Examples: Modules that we are looking for:
      | Modules   |
      | dashboard |
      | files     |
      | photos    |
      | activity  |
      | spreed    |
      | mail      |
      | contacts  |
      | circles   |
      | calendar  |
      | notes     |
      | deck      |
      | tasks     |

  @B30G8-113
  Scenario: User can click on Customize button and select any of the Widgets.
    Then user click on Customize button
    And select Widgets - "calendar" and "notes" and check if selected Widgets presented on the Home page


  @B30G8-114
  Scenario: User can click on Set Status button and select any of the Status options.
    Then user click on Set Status button
    And select any of the Status - "dnd" and check if selected Status option is showing on the page

#Available statuses - away, dnd, online, invisible
