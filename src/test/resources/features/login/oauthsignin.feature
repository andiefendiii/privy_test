Feature: Signin

  I want to test api siginin
  So that i success signin

  Scenario: Api signin success
    Given I am test api signin
    When I am enter phone number and password
    When I Click execution button
    Then Api signin success