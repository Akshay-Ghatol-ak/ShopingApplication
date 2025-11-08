Feature: E-Commerce Shopping Application
  Scenario Outline: Verify user enter valid and invalid credential for  E-Commerce Shopping application
    Given open the browser
    Then User Enters username "<EmailAddress>" and  Pass  "<Password>"
    When Log out the application
  Examples:
    | EmailAddress | Password |
    | Addmin232    | Addmin22 |



