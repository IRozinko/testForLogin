Feature: sign up functionality for registered users

  @login @login_001
  Scenario: user logs in to the account successfully
    Given the registered client
    When client opens the login page
    And client logs in to the account