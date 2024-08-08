Feature: Flight Search

  Scenario: Verify user can search flight
    Given user opens application
    Then verify user is on home screen
    When user click on flight tab
    Then verify user is on flight search page
    When user enters "Chicago" into flying from
    And user enters "Florida" into flying to
    And select date from "12 Aug 2024" to "23 Aug 2024"
    And click on search button
    Then verify flight listing page is displayed
