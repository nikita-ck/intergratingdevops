@Regression
Feature: Text Assertion with regression tag

  Scenario: Verify the text on a web page
    Given I am on the "https://example.com" page
    Then I should see the text "Example Domain"