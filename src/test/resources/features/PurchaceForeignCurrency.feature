Feature: Purchase Foreign Currency

  Background:
    Given User is on the home page
    When User tap on signIn button
    When User enters login credentials
    When User goes to "Online Banking" menu
    And User goes to "Pay Bills" subMenu
    When User clicks on "Purchase Foreign Currency" title

  @currenciesCheck
  Scenario: Navigate Expected Link
    Then User validate following currencies should be available
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |

  @wip
  Scenario: Error message for not selecting currency
    When The user tries to calculate cost without selecting a currency
    Then The user should be able to see error message displayed