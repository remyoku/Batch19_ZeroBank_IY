Feature: Navigating to specific accounts in Accounts Activity

  Background:
    Given User is on the home page
    When User tap on signIn button
    When User enters login credentials


  Scenario Outline: Navigate Expected Link
    When User goes to "Online Banking" menu
    And User goes to "Account Summary" subMenu
    When User clicks on "<Title>" title
    Then User validates that page title is "Zero - Account Activity"
    Then User validate that default dropdown menu is "<Title>"
    Examples:
      | Title       |
      | Savings     |
      | Brokerage   |
      | Checking    |
      | Credit Card |
      | Loan        |