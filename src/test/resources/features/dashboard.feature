@AllTestCases
@DashboardModule
Feature: Dashboard Module

  @DashboardTC01
  Scenario: TC01_User should view dashboard if authenticated
    Given user goes to login page
    And user enters valid username and password
    And user clicks login button
    Then user verifies that dashboard page has been loaded successfully
    And user closes the browser

  @DashboardTC02
  Scenario: TC02_User should redirect to login page if not authenticated
    Given user goes to login page
    And user enters invalid username and password
    And user clicks login button
    Then user verifies that redirected to login page
    And user closes the browser

  @DashboardTC03
  Scenario: TC03_User should view list of events if any event created otherwise user should view notification message states no registered event found
    Given user goes to login page
    And user enters valid username and password
    And user clicks login button
    Then user verifies that list of events is visible or notification message is visible
    And user closes the browser

  @DashboardTC04
  Scenario: TC04_User should be able navigate edit event when click the edit event button
    Given user goes to login page
    And user enters valid username and password
    And user clicks login button
    And user clicks create event button
    Given user fills all required fields and clicks Create New Event button
    And user clicks edit button
    Then user verifies that navigated to edit event
    And user closes the browser

  @DashboardTC05
  Scenario: TC05_User should be able to delete event when click the delete button
    Given user goes to login page
    And user enters valid username and password
    And user clicks login button
    And user clicks create event button
    And user fills all required fields and clicks Create New Event button
    Given user clicks delete button
    Then user verifies that notification message is visible
    And user closes the browser

  @DashboardTC06
  Scenario: TC06_User should be able to view event participants
    Given user goes to login page
    And user enters valid username and password
    And user clicks login button
    And user clicks create event button
    And user fills all required fields and clicks Create New Event button
    Given user clicks participant button
    Then user verifies that participants of event table is visible
    And user closes the browser
