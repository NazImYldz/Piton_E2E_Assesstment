@AllTestCases
@LoginModule
Feature: Login Module

  @LoginTC01
  Scenario: TC01_User should see login Form if not authenticated
    Given user goes to login page
    Then user assert that Login Form contains username, password and login button
    And user closes the browser

  @LoginTC02
  Scenario:  TC02_User should see validation errors if click the login button without fill the login form
    Given user goes to login page
    And user clicks login button
    Then user assert that validation errors
    And user closes the browser

  @LoginTC03
  Scenario: TC03_User should navigate to the dashboard and see welcome message if authenticate successfully
    Given user goes to login page
    And user enters valid username and password
    And user clicks login button
    Then user verifies welcome message
    And user closes the browser
