Feature: To verify rate and transit time functionality

  @test6 @regression
  Scenario: As a user I want to validate rate and transit time screen
    Given User navigates to the application
    When user clicks on Rate and Transit Time icon
    Then verify the message appears on screen

  @test7
  Scenario Outline: As a user I want to calculate FedEx shipping rate
    Given User navigates to the application
    When user clicks on Rate and Transit Time icon
    And user selects from "<From>" location
    And user selects to "<To>" location

    Examples: 
      | From                                  | To                                            |
      | Utrecht, Utrecht, 3512JE, Netherlands | Hilversum, Noord-Holland, 1217KX, Netherlands |
