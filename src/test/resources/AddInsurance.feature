Feature: add insurance
  @add_insurance001
  Scenario: the user adds new insurance
    Given the registered client
    And client opens the login page
    And client logs in to the account
    When the insurance page is opened
    Then the client fills the application form