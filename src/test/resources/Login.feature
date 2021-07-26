Feature: sign up functionality for registered users

  @login @login_001
  Scenario: user logs in to the account successfully
    Given registered client
    When client opens the login page
    And client logs in to the account