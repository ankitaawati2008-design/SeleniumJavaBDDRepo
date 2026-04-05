Feature: This is the feature file of login feature of OrangeHRM 


Scenario:Verify that user is able to login with invalid credentials
Given User is on the login page of OrangeHRM
When User enters invalid username and password
Then User should not be able to login and error message should be displayed