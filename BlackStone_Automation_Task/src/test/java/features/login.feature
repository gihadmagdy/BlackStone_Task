Feature: login feature
  Scenario: Validate login and logout successfully
    Given user navigate to login page
    And user enters username and password
    And user click signin button
    Then validate user navigated on homepage
    And user click on account image
    And user clicks on logout button
    Then validate navigated on sign-in
