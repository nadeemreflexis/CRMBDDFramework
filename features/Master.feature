Feature: Login feature
Scenario: Free CRM Login Logo Test

Given User is already on login page
When User enters "nadeemz" and "Test@123"
Then User click on login button
Then Verify user is on Home page
Then Close the browser