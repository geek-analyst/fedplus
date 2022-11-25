Feature: Verify the order tracking system

#***** This is a Comment Line *******

@test8 @regression
Scenario Outline: As a user I want to track the order with a tracking ID

Given User navigates to the application
When User clicks on Track icon
And user enter the tracking id "<Tracking_ID>"
And user clicks on Track button
Then user gets invalid tracking information on screen

 Examples:
    |Tracking_ID  |
    |4444         |



