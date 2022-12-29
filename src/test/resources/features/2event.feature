@AllTestCases
@EventModule
Feature: Event Module

  @EventTC01
  Scenario: TC01_User should view create event form if click the Create Event button on dashboard
    Given user goes to login page
    And user enters valid username and password
    And user clicks login button
    And user clicks create event button
    Then user verifies that create event form is visible
    And user closes the browser

  @EventTC02
  Scenario: TC02_User should view validation errors if click the Create Event button without fill the event form
     Given user goes to login page
     And user enters valid username and password
     And user clicks login button
     And user clicks create event button
     Given user clicks Create New Event button
     Then user assert that validation errors are visible
     And user closes the browser

  @EventTC03
   Scenario: TC03_User should be able to add new participant when click the Add Participant button
     Given user goes to login page
     And user enters valid username and password
     And user clicks login button
     And user clicks create event button
     And user clicks Add Participant button
     Then user verifies that new participant was added
     And user closes the browser

  @EventTC04
   Scenario: TC04_User should view error message if removes all participants
     Given user goes to login page
     And user enters valid username and password
     And user clicks login button
     And user clicks create event button
     And user clicks delete button of all participants
     Then user verifies that an error message has occurred
     And user closes the browser

  @EventTC05
   Scenario: TC05_User should be able to create new event if fills all required fields and redirect to dashboard page with create successful message
     Given user goes to login page
     And user enters valid username and password
     And user clicks login button
     And user clicks create event button
     Given user fills all required fields and clicks Create New Event button
     Then user verifies that redirected to dashboard page
     And user verifies that create successful message is visible
     And user closes the browser

  @EventTC06
   Scenario: TC06_User should be able to edit event. When user click the edit button all event fields must be filled according to editing event
     Given user goes to login page
     And user enters valid username and password
     And user clicks login button
     And user clicks create event button
     Given user fills all required fields and clicks Create New Event button
     And user clicks edit button
     Then user verifies that all fields are correctly populated compared to the previous one
     And user closes the browser

  @EventTC07
   Scenario: TC07_User should be able to update event if required fields filled and redirect to dashboard page with update successful message
     Given user goes to login page
     And user enters valid username and password
     And user clicks login button
     And user clicks create event button
     Given user fills all required fields and clicks Create New Event button
     And user clicks edit button
     Then user updates event name and click Update Event button
     And user verifies that redirected to dashboard page
     And user verifies that update successful message is visible
     And user closes the browser