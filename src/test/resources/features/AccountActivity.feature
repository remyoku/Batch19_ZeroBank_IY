@accountActivity
Feature: Account Activity Test

  Background:
    Given User is on the home page
    When User tap on signIn button
    When User enters login credentials

  @accountActivityComplete
  Scenario: Account Activity Test
    When User goes to "Online Banking" menu
    And User goes to "Account Activity" subMenu
    Then User validates that page title is "Zero - Account Activity"
    Then User validate that default dropdown menu is "Savings"
    Then User validate that account dropdown has this followings
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    Then User validates that transactions table has this following column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |

  @accountActivityPageTitle
  Scenario: Account Activity Page Title Test
    When User goes to "Online Banking" menu
    And User goes to "Account Activity" subMenu
    Then User validates that page title is "Zero - Account Activity"

  @accountActivityDefaultDropDown
  Scenario: Account Activity Default Dropdown Test
    When User goes to "Online Banking" menu
    And User goes to "Account Activity" subMenu
    Then User validates that page title is "Zero - Account Activity"
    Then User validate that default dropdown menu is "Savings"

  Scenario: Account Activity Dropdown Option Test
    When User goes to "Online Banking" menu
    And User goes to "Account Activity" subMenu
    Then User validates that page title is "Zero - Account Activity"
    Then User validate that account dropdown has this followings
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  @accActivityTransColumns
  Scenario: Account Activity Transaction Columns Test
    When User goes to "Online Banking" menu
    And User goes to "Account Activity" subMenu
    Then User validates that transactions table has this following column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
