Feature: OTP Request

  I want to test api otp request
  So that i success register

  Scenario: Otp sending
    Given I am test api otp request
    When I am enter phone number register
    When I click execution button
    Then Otp deliver