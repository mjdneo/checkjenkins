package com.jiomart.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvanceSearchStepDefinition {

    @Given("User open the application")
    public void user_open_the_application() {
            System.out.println("Second feature scenario started");
    }

    @When("User click on the advance search icon, the search bar opens")
    public void user_click_on_the_advance_search_icon_the_search_bar_opens() {

    }

    @When("User input two search values {string} and {string} inside search bar")
    public void user_input_two_search_values_and_inside_search_bar(String string, String string2) {
        System.out.println(String);
        System.out.println(string2);
    }

    @When("User clicks on searchAll button")
    public void user_clicks_on_search_all_button() {

    }

    @Then("the search results page should display two search result products.")
    public void the_search_results_page_should_display_two_search_result_products() {
        System.out.println("Second feature scenario ended");
    }

}
