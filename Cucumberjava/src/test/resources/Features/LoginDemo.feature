Feature: Test Login Functionlaity 

Scenario Outline: Check login is successful with valid credentials 

	Given browser is opened 
	And user is on login page 
	When user enters <username> and <password> 
	And user clicks on login 
	Then user is navigated to the home page 
	
	Examples: 
		|username|password|
		|Mukesh|12345|
		|John|12345|
		
		
