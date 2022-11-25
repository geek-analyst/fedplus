Feature: To verify open an account functionality

  Background: 
    Given User navigates to the application
    When user click on Signup link
    And selects the option open an account
    And click on the button open an account

  @test2 @regression
  Scenario: As a user I want to validate open account welcome page
    Then user verifies a welcome message for creating a new account
    

  @test3 @regression
  Scenario Outline: As a user I want to enter details for creating an account so that login screen appears
    When user enters first name "<FirstName>"
    And user enters last name "<LastName>"
    And user enters address "<Address>"
    And user enter the phone number "<Phone>"
    And user enter the email id "<EmailID>"
    And user clicks on the button Enter Login Details
    Then user is able to navigate to login page

    Examples: 
      | FirstName | LastName | Address | Phone    | EmailID        |
      | test      | sample   | hilver  | 67356832 | test12@abc.com |

  @test4 @regression
  Scenario Outline: As a user I want to create an account using an email ID
    When user enters first name "<FirstName>"
    And user enters last name "<LastName>"
    And user enters address "<Address>"
    And user enter the phone number "<Phone>"
    And user enter the email id "<EmailID>"
    And user clicks on the button Enter Login Details
    And user fills the password details
         | Test@123 | Test@123 |
    And user selects the checkbox I have read
    And user selects the checkbox I would like to receive
    And clicks on Create my User Id button
    Then an account gets created for the user
    Examples: 
      | FirstName | LastName | Address | Phone    | EmailID        |
      | test      | sample   | hilver  | 67356832 | test12@abc.com |

  @test5 @regression
  Scenario Outline: As a user I want to create a account using new UserID
    When user enters first name "<FirstName>"
    And user enters last name "<LastName>"
    And user enters address "<Address>"
    And user enter the phone number "<Phone>"
    And user enter the email id "<EmailID>"
    And user clicks on the button Enter Login Details
    And user select the option create my own user Id
    And user enters an new User Id
    And user fills the password details
       | Hello@123 | Hello@123 |
    And user selects the checkbox I have read
    And user selects the checkbox I would like to receive
    And clicks on Create my User Id button
    Then an account gets created for the user
    Examples: 
      | FirstName | LastName | Address | Phone    | EmailID        |
      | test      | sample   | hilver  | 67356832 | test12@abc.com |
