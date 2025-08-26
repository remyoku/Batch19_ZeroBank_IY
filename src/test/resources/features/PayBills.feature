Feature: Pay Bills Test

  Background:
    Given User is on the home page
    When User tap on signIn button
    When User enters login credentials

  @positivePayBills
  Scenario: Positive Pay Bills Tests
    When User goes to "Online Banking" menu
    Then User goes to "Pay Bills" subMenu
    And User enters amount "100" and date "2025-08-26"
    Then User should be able to see the successful message

  @negativeAmount
  Scenario: Blank Amount Test
    When User goes to "Online Banking" menu
    Then User goes to "Pay Bills" subMenu
    And User enters amount "100" and date ""
    Then User validates that input box error message is displayed

  @negativeDate
  Scenario: Blank Date Test
    When User goes to "Online Banking" menu
    Then User goes to "Pay Bills" subMenu
    And User enters amount "" and date "2025-08-26"
    Then User validates that input box error message is displayed

  @negativeTestAmountAndDate
  Scenario: Blank Amount and Date Test
    When User goes to "Online Banking" menu
    Then User goes to "Pay Bills" subMenu
    And User enters amount "" and date ""
    Then User validates that input box error message is displayed

  @paybillsCompleteNegativeTests
  Scenario Outline:Blank Input Test
    When User goes to "Online Banking" menu
    Then User goes to "Pay Bills" subMenu
    And User enters amount "<amount>" and date "<date>"
    Then User validates that input box error message is displayed

    Examples:
      | amount | date       |
      |        | 2025-08-26 |
      | 100    |            |
      |        |            |

  @payBillsInvalidEmpty
  Scenario:Invalid Data Entry To Date Box
    When User goes to "Online Banking" menu
    Then User goes to "Pay Bills" subMenu
    And User enters amount "100" and date "tarih"
    Then User validates that date box is empty
