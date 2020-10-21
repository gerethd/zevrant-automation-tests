Feature: User Management

@Login
Scenario: I login into the application
  Given I navigate to the application
  And I click the login button
  When I type the username and password in
  And I click submit on the login form
  Then I should be able to see my username where the login button was
