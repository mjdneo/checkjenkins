Feature: Jiomart Sigin Feature

 @p1
    Scenario: check Multiple Search values
            Given User open the application
            When User click on the advance search icon, the search bar opens
            And User input two search values "Bread" and "Butter" inside search bar
            And User clicks on searchAll button
            Then the search results page should display two search result products. 

    @p2
    Scenario: check user signIn module
        Given User opened the Jiomart web application.
        When the user clicks on sign in, they are redirected to the sign-in module.
        And the user input the valid "9988776655" mobile number.
        And the user clicks on the continue button.
        Then the user should be prompted to enter the valid OTP.

   



    
