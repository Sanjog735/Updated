Feature: Update Contact Details

  @UpdateMobileNumberSuccessfully
  Scenario Outline: Update the Number with Valid Number
    Given person is on Firstcry website homepage
    And person click on login
    And person enter registered number
    And person click on continue
    And click on submit for login
    And person click On myAccount
    And person click on myProfile
    And person click on contact details
    And person click on edit icon on contact details
    And update the new <mobileNumber>
    When click on verify button
    And click on submit
    Then contact number updated successfully

    Examples: 
      | mobileNumber |
      |   9547077715 |

  @UpdateMobileNumberWithNullValue
  Scenario: Update the Number with null number
    Given person is on Firstcry website homepage2
    And person click on login2
    And person enter registered number2
    And person click on continue2
    And click on submit for login2
    And person click On myAccount2
    And person click on myProfile2
    And person click on contact details2
    And person click on edit icon on contact details2
    And remove the number and do not provide number 
    When click on submit2
    Then contact number not updated 
