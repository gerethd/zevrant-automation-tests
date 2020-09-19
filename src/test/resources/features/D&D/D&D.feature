Feature: I want to be able to store campaign sessions and play them back later

  Scenario: I create a campaign without an email address associated with my account
    Given I have logged into the application
    And I navigate to the user settings menu
    And I set my email address to be empty
    And I submit my settings changes
    When I navigate to the D&D application
    And I create a test campaign
    Then I should be able to navigate to the new campaign
    And then I delete the created campaign
