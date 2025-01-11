Feature: Jiomart Sigin Feature

    Scenario: check user signIn module

Given User opened the Jiomart application.

When the user clicks on sign in, they are redirected to the sign-in module.

And the user input the valid "9988776655" mobile number.

And the user clicks on the continue button.

Then the user should be prompted to enter the valid OTP.