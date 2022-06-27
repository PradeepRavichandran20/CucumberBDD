@timesheets
Feature: This feature is get the pending timesheet
Scenario: This is to verify pending timesheet
  Given the user is on the home page
  When the user clicks on the time option from the menu
  And the user selects the name as "John Smith"
  And clicks on the view button
  Then user should see the message as "<message>"
 
