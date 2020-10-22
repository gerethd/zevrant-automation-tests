Feature: I register myself with the application

  Scenario: During creation i should be able to select a role and then switch pages
    Given I navigate to the application
    And I navigate to the registration page
    And I click on a role
    When I switch pages on role selection
    Then the role should remain selected