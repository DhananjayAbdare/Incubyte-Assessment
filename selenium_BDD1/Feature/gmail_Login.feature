Feature: Login Action

Scenario: Test login, compose Functionality
	Given user is on login page
	When user enters an email_id
	And click on next button
	Then user should successfully navigate to password page
	When user enters an password
	And click on next button
	Then user should be successfully login into the gmail account
	When user click on compose button
	Then compose message box should be opened
	When user enters the recipient mail_id and subject to mail
	And user attch file and click on send button
	Then user should successfully send an email to the recipient
	
