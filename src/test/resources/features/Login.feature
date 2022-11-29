Feature: Login functionality

  Background: 
    Given User navigates to the application
    When user click on Signup link
    And selects the option login

  @test1 @regression
  Scenario Outline: As a user I want to login to the application
    Given user navigates to login page
    When user enters the username "<UID>"
    And user enters the password "<password>"
    And user clicks on LogIn button
    Then user logs in the account successfully

    Examples: 
      | UID           | password |
      | test@test.abc | Test@123 |
      
      
      @test10 @regression 
  Scenario: As a user I want to navigate to forgot password screen
  
    Given user navigates to login page
    When user clicks the forgot password button
    Then user navigates to forgot password screen


   @test11 @regression 
  Scenario: As a user I want to navigate to password reset screen
  
    Given user navigates to login page
    When user clicks the forgot password button
    And user clicks on Reset button
    Then user navigates to password reset screen
        
    
   @test12 
  
  Scenario Outline: As a user I want to proceed for password reset
    
    Given user navigates to login page
    When user clicks the forgot password button
    And user clicks on Reset button
    And user enters the userID "<UserName>"
    And user clicks on submit button in
    Then user gets the message How do you want to reset your password
       
      Examples: 
      | UserName        |
      | learntotest@abc.com     |
      
   @failed 
  Scenario Outline: As a user I want to login to the application
    Given user navigates to login page
    When user enters the username "<UID>"
    And user enters the password "<password>"
    And user clicks on LogIn button
    Then user logs in the account

    Examples: 
      | UID           | password |
      | test@test.abc | Test@123 |


## Automated log out requests are blocked by the server.
  @logout
     Scenario Outline: Title of your scenario outline
    Given user navigates to login page
    When user enters the username "<UID>"
    And user enters the password "<password>"
    And user clicks on LogIn button
    #  And user clicks on Logout button
    # Then user logs out successfully
    Examples: 
      | UID           | password |
      | test@test.abc | Test@123 |
