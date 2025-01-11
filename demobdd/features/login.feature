Feature: Jiomart Login


    @first
    Scenario: login with valid mobile number

    Given User opened the browser and launched jiomart application

    When User clicks on "Sigin" button

    And User enters the valid mobile number in the mobile number field

    Then User will be prompted to enter the valid otp
    Then User will be prompted to enter the valid otpda

    @second
    Scenario: Homepage search check

    Given User clicked on button in <"Name"> Homepage <"Password">
    |Name|Password|
    |Check1|Check2|
    |Check3|Check4|
    |Check5|Check6|
    And Entered the num in phonefield