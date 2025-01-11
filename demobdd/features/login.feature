Feature: Jiomart Login



    Scenario: ogin with valid mobile number

    Given User opened the browser and launched jiomart application

    When User clicks on "Sigin" button

    And User enters the valid mobile number in the mobile number field

    Then User will be prompted to enter the valid otp
    Then User will be prompted to enter the valid otpda


    Scenario: Homepage search check

    Given User clicked on button in Homepage

    And Entered the num in phonefield