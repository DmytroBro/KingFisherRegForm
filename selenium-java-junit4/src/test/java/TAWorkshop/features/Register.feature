@TestTag
Feature: Register

  Scenario Outline:
    Given user is on the demo sign in page
    When user enters <emailAddress> and creates account
    And user enters personal information
    Then register should be successful

    Examples:
      |emailAddress          |
      |dmytrobrovar@gmail.com|