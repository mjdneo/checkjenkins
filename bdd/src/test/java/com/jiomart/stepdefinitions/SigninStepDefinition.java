package com.jiomart.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStepDefinition {

    @Given("User opened the Jiomart web application.")
    public void user_opened_the_jiomart_web_application() {
       System.out.println("Scenario1 Started");
    }


    @When("the user clicks on sign in, they are redirected to the sign-in module.")
    public void the_user_clicks_on_sign_in_they_are_redirected_to_the_sign_in_module() {
       
    }

    @When("the user input the valid {string} mobile number.")
    public void the_user_input_the_valid_mobile_number(String string) {
        System.out.println(string);
    }

    @When("the user clicks on the continue button.")
    public void the_user_clicks_on_the_continue_button() {

    }

    @Then("the user should be prompted to enter the valid OTP.")
    public void the_user_should_be_prompted_to_enter_the_valid_otp() {
        System.out.println("verified");
        System.out.println("Scenario1 Closed");
       
    }

}
