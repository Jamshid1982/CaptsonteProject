Feature: Retail signIn feature

  @smokeTest @Regresion @FunctionalTestCases
  Scenario: Veify user can sign in into Retail Application
    Given User is on retail website
    When User clicks on Sign in option
    And User enter email 'jamshidkhashi82@gmail.com' and password 'Khashi1982$'
    And User clicks on login button
    Then User should be logged in into Account
    And User clicks on Logout option

	@dryRun @smokeTest
  Scenario: Verify user can create an account into Retail Website
    Given User is on Retail website
    When User clicks on Sign in option
    And User clicks on Create New Account button
    And User fill the signUp information with below data
      | name    | email                     | password    | confirmPassword |
      | jamshid | jamshidkhashi82@gmail.com | Khashi1982$ | Khashi1982$     |
    And User clicks on SignUp button
    Then User should be logged into account page
