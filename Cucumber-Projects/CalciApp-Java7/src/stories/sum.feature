Feature: SUM of two numbers

  Scenario: Get The sum of two numbers
    When user enters first number
    And user enters second number
    And user hits enter key
    Then the sum of two numbers should match
     