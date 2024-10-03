Feature: Perform edit operation on Child details of firstcry application

  @SuccessfulChildAdd
  Scenario Outline: Verify the user is able add child details with valid credential
    Given The user is in the firstcry home page1
    When The user clicks on login1
    And The user enter the mobile num
    Then click on continue1
    And click on submit link1
    Then click on My Account1
    And click on My Profile1
    And click on child details1
    And enter the childs name as <childName>
    And enter date of birth1
    And select a gender
    And enter the child <weight> and child <height>
    When click on save button
    Then child details successfully saved

    Examples: 
      | childName | weight | height |
      | Mili      |      5 |     60 |

  @ChildAddWithNullValue
  Scenario: Verify the user is not able add child details with invalid credential
    Given The user is in the firstcry home page2
    When The user clicks on login2
    And The user enter the mobile num2
    Then click on continue2
    And click on submit link2
    Then click on My Account2
    And click on My Profile2
    And click on child details2
    And click on add another child
    And do not enter the childs2
    And do not enter date of birth2
    And do not select a gender2
    And do not enter the child weight and child height
    When click on save button2
    Then child details can not saved
