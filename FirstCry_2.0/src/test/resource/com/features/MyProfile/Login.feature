Feature: Perform Login Operation in Firstcry Website

@Login
  Scenario: Verify the user is able to login by entering valid credentials
    Given The user is in the firstcry home page
    When The user clicks on login
    And The user enters the mobile number
    Then click on continue
    And The user provides otp
    And click on submit btn for login
    Then The user must able to login