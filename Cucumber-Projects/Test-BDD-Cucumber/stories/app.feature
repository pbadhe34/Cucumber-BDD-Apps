Feature: GetSqureRoot
  I want to use this template for my feature file

  @tag1
  Scenario: TestSquareRoot
    Given User opens the application
    When User enter number to get squareroot
    Then The matching squareRoot value should be displayed
    

  @tag2
  Scenario Outline: TestWithParams
    Given User opens the application with "Hello" message
    When User enter number 100 to get squareroot
    Then The matching squareRoot value 10 should be displayed

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
