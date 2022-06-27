@GetCEOName
Feature: This feature is get the CEO name from OrangeHRM Application
Scenario: This is to verify CEO name 
  Given the user is logged in successfully in home page
  When the user clicks on the directory option from the menu bar
  And the user selects the job title as "Chief Executive Officer" from drop down
  And clicks the search button
  Then user should see the CEO name as "John Smith"
 
