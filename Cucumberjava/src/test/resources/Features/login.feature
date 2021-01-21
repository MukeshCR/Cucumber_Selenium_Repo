#Author
#Date
#Description

@SmokeFeature
Feature: feature to test login functionality

@smoketest
Scenario: Check login is successful with valid credentials


Given user is on login page
When user enter valid username and password
And clicks on login button
Then user is navigated to the homepage