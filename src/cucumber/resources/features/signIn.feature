Feature: Sign In

  Scenario: Error Message when entering incorrect email
    Given I am on the automation practice page
    When I click on Sign In option
    Then I am at Sign In Page
    When I enter email as 'adcd'
    And I click on Create Account Button
    Then I see an error message as 'Invalid email address.'
