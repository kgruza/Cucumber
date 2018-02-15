Feature: Person feature

  Scenario: It should be possible to add new person as a consultant
    Given Simba website is open
    When User logs as a CONSULTANT
    And "MainPage": User clicks "personSection"
    And "PersonPage": User clicks "addPerson"
    And User fills the required form fields
    And "GeneralPage": User clicks "submitButton"
    Then New person should be added

  Scenario: It should be possible to edit person
    Given Simba website is open
    When User logs as a CONSULTANT
    And "MainPage": User clicks "personSection"
    And "PersonPage": User clicks "editButton"
    And User edits a last name field
    And "GeneralPage": User clicks "submitButton"
    Then Edited Datas should be saved
  @Test
  Scenario: It should be possible to add a payer for person
    Given Simba website is open
    When User logs as a CONSULTANT
    And "MainPage": User clicks "personSection"
    And "PersonPage": User clicks "personDetailsButton"
    And "PersonPage": User clicks "payersButton"
    And "PersonPage": User clicks "addPersonPayerButton"
    And "PersonPage": User clicks "addPayerConfirmationButton"
