#Author: Geek Analyst
## (Comments)
Feature: Verify User Registration Form

  Background: 
    Given User navigates to the application
    When user click on Signup link
    And select the option Create User ID

  @test9 @regression
  Scenario: As a user I want to fill the user registration form for existing user
    Given user is on registration login page
    When user enters the login information
      | sampleId | SamPass123 | SamPass123 |
    And user selects the secret question
    And user answers the secret question
    And user fills in Contact Information
      | firstSampleName | lastSampleName | 3404ZIP | Address test | UTRECHT | StateTest | test@testing.com | test@testing.com | 3526364372 |
    And user clicks on I Accept button
   #Then thank you for registering message gets displayed
