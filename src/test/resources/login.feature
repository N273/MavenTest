Feature: Log in Application.
  Scenario: Log in with valid credentials.
    Given I am on the log in page
    When  I entered valid credentials.
    Then  I should log in successfully.
