Feature: Calculator

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 3
    Then the result should be 8

  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 8 from 4
    Then the result should be 3
    