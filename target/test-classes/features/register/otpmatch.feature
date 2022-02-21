Feature: OTP Match

  I want to test api otp match
  So that i success register

  Scenario: otp match
    Given I am otp match
    When I am input otp
    When I click Execution button
    Then Otp matching