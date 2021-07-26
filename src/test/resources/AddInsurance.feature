Feature: add insurance
  @add_insurance001
  Scenario: the user adds new insurance
    Given the registered client
    When the insurance page is opened
    Then the client fills the application form