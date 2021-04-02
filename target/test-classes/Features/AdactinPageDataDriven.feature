Feature: verifing the adactin webpage 

Background: 
	Given User is on adactin login page 
	When user should enter username and password by using datadriven 
	And user should enter login button 
	
	@reg
Scenario: Tc_01 Verifing the adactin login page with valid credantials 
	Then user should verify sucess message. 
	@reg
Scenario: TC_02 verifying the search hotel page with valid credentails 
	And  user is on the search hotel page 
	When user should enter valid credentials 
	And user should click on search button 
	Then  user should verify succes message. 
	@reg
Scenario: Tc_03 verfiying the hotel selection page in adactin page 
	And  user is on the search hotel page 
	When user should enter valid credentials by using datadriven 
	And user should click on search button 
	And user should click on radio button or hotel select button 
	And user should click on continue button 
	Then user verify the succes message and navigate to next page. 
	@reg
Scenario: TC_04 verifing the all feild with valid credentials enter in Book a hotel page 
	And  user is on the search hotel page 
	When user should enter valid credentials 
	And user should click on search button 
	And user should click on radio button or hotel select button 
	And user should click on continue button 
	And user should be enter firstname,Lastname,billing address,Creditcard number,Creditcard type,Expirydate,Cvv number by using Datadriven
	Then user should verify the sucess message.