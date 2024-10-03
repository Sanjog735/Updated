Feature: Perform edit operation on My Address Book of firstcry application

  @SuccessfulAddressAdd
  Scenario Outline: Adding Address details Successfully with valid credentials
    Given The user is in the firstcry home page3
    When The user clicks on login3
    And The user enter the mobile num3
    Then click on continue3
    And click on submit link3
    Then click on My Account3
    And click on My Profile3
    Then click on my address book
    And user enter <name> in address field
    And user enter <houseNumber> in house number
    And user enter <streetAddress> in street address
    And user enter <landMark> in landmark
    And user enter <pincode> in pincode
    And user enter <mobileNumber> in mobile number
    And user enter <telRegion> in telephone region
    And user enter <telNumber> in telephone number
    When user click on save button
    Then users address  details successfully saved

    Examples: 
      | name   | houseNumber                        | streetAddress     | landMark                                  | pincode | mobileNumber | telRegion | telNumber  |
      | Raghav | PK458 ,Kharadi , Pune , Maharastra | Pune , Maharastra | kharadi, pune ,near ola electric showroom |  411014 |   8745874584 |        11 | 8569585896 |

  @AddressAddWithInvalid
  Scenario Outline: Address details not added when we pass invalid credentials
    Given The user is in the firstcry home page4
    When The user clicks on login4
    And The user enter the mobile num4
    Then click on continue4
    And click on submit link4
    Then click on My Account4
    And click on My Profile4
    Then click on my address book4
    And click on add new address
    And user enter <name> in address field4
    And user enter <houseNumber> in house number4
    And user enter <streetAddress> in street address4
    And user enter <landMark> in landmark4
    And user enter <pincode> in pincode4
    And user enter <mobileNumber> in mobile number4
    And user enter <telRegion> in telephone region4
    And user enter <telNumber> in telephone number4
    When user click on save button4
    Then users address  details not added

    Examples: 
      | name   | houseNumber | streetAddress | landMark | pincode | mobileNumber | telRegion | telNumber  |
      | zzzzzz |          25 | f4f5f4        | mmm      |  111111 |   8745874584 |        11 | 8569585896 |

  @AddressAddWithNull
  Scenario: Address details not added when we pass null credentials
    Given The user is in the firstcry home page5
    When The user clicks on login5
    And The user enter the mobile num5
    Then click on continue5
    And click on submit link5
    Then click on My Account5
    And click on My Profile5
    Then click on my address book5
    And click on add new address5
    And user do not  enter name in address field5
    And user do not  enter houseNumber in house number5
    And user do not  enter streetAddress in street address5
    And user do not enter landMark in landmark5
    And user do not enter pincode in pincode5
    And user do not enter mobileNumber in mobile number5
    And user do not  enter telRegion in telephone region5
    And user do not  enter telNumber in telephone number5
    When user click on save button5
    Then users address  details not added5
