package com.jiomart.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavbarStepDefinitionxtends {



    @Given("User opened the application")
    public void user_opened_the_application() {

        System.out.println("Scenario started");
      
    }

    @When("User Hover on electronics in homepage")
    public void user_hover_on_electronics_in_homepage() {

    }

    @When("User clicks on mobiles & Tablets")
    public void user_clicks_on_mobiles_tablets() {

    }

    @Then("User should be redirected to the results page")
    public void user_should_be_redirected_to_the_results_page() {
        System.out.println("Scenario closed");
 
    }

}
