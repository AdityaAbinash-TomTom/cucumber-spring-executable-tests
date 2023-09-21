Feature: Spring Integration

  Scenario: As a developer, I want to run an executable test jar
    Given the test jar is built
    When the test jar is executed
    Then the test jar prints "Hello World"
