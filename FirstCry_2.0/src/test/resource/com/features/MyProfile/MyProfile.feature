Feature: Perform edit operation on My Profile of firstcry application

  @MyAccount
  Scenario: Verify the user is able to click on My Account
    Given user open the FirstCry website
    When The user clicks on loginBtn
    And The user enters his mobile number
    And click on continue btn
    And click on submit btn
    When click On MyAccount link
    Then The user is able click on MyAccount

  @MyProfile
  Scenario: Verify the user is able to click on My Profile
    Given user Open the FirstCry website
    When user clicks on loginBtn
    And user enters his mobile number
    And user click on continue btn
    And user click on submit btn
    And user click On MyAccount link
    When user click on MyProfile
    Then The user is able click on MyProfile

  @SuccessfulMyProfileUpdate
  Scenario Outline: Verify the user is able to edit the profile
    Given user Open the FirstCry website link
    When user clicks on loginbtn
    And user enters his mobile Number
    And user click on continue Btn
    And user click on submit Btn
    And user click On myAccount link
    And user click on myProfile
    And user click on edit icon of My Profile
    And user enters the name <name>
    And user clicks on radio button
    And user clicks on I am expecting another child checkbox
    And user selects a due date
    When user clicks on save button
    Then Users profile should be updated

    Examples: 
      | name |
      | Amar |

  @EditMyProfileWithNull
  Scenario: Edit My Profile with Null Value
    Given i Open the FirstCry website link
    When i clicks on loginbtn
    And i enters mobile Number
    And i click on continue Btn
    And i click on submit Btn
    And i click On myAccount link
    And i click on myProfile
    And i click on edit icon of My Profile
    And i do not enters the name
    And i do not clicks on radio button
    And i do not clicks on checkbox
    And i do not selects a due date
    When i clicks on save button
    Then the profile  should not be updated
