@regression
Feature: Login Functionality

  Background:
    Given User is on the home page
    When User tap on signIn button

  @positiveLogin
  Scenario: Positive Login Test
    When User enters login credentials
    Then Validate that user is logged in

  @negativeLogin
  Scenario Outline: Negative Login Test
    When User enters "<username>" and "<password>"
    And User taps on login button
    Then User validates that error message is displayed
    Examples:
      | username | password |
      | username      | password      |
      | username      | wrongPassword |
      | wrongUsername | password      |
      |               | password      |
      | username      |               |
      |               |               |



