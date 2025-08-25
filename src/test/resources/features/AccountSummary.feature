Feature: Account Summary Tests

  Background:
    Given User is on the home page
    When User tap on signIn button
    When User enters login credentials


  Scenario: Account Summary Test
    When User goes to "Online Banking" menu
    And User goes to "Account Summary" subMenu
    Then User validates that page title is "Zero - Account Summary"
    Then User validates that following titles are displayed
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    Then User validates that following column names are displayed
      | Account     |
      | Credit Card |
      | Balance     |
