@All @Last
Feature: Google search

  Scenario: Search for data in google
    When i opened google browser
    And searched for "Today weather"
    And capture the screenshot od today weather
