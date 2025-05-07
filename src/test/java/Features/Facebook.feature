@facebook

Feature: Verify the user can login successfully
 
 
 @Login  
Scenario Outline: User can successfully Login and Logout


   Given Launch the browser and open the Facebook page
   When I Enter the Email "<User Name>"
   When I Enter the Facebook Password "<Password>"
   And I click on Login  
   #Then Click on Account 
   #And I click on Logout
   #Then Click on Setting
   #And Remove the Account
   #Then Confirm Remove from the browser
   And Close the browser
Examples: 
|User Name | Password| 
|Stephen Raj|Stphn5742@F|
|Raja| rsjs22@|
@Add_Bio
Scenario: Add Bio to Profile
   Then Click on Profile
   And Add Bio
   Then Enter "Do it Yourself"
   And Save the Bio
   
   
  
   