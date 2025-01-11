package com.jio.stepdefinitions;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepTwo {


    @Given("User clicked on button in <{string}> Homepage <{string}>")
public void user_clicked_on_button_in_homepage(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
    Map<String, String> datamap = dataTable.asMap(String.class, String.class);
    for (Map.Entry<String, String> iterable_element : datamap.entrySet()) {
        
        System.out.println("Key: " + iterable_element.getKey() + "Value: " + iterable_element.getValue());
    }
 }
@Given("Entered the num in phonefield")
public void entered_the_num_in_phonefield() {
    
}


@Given("User opened the browser and launched jiomart application")
public void user_opened_the_browser_and_launched_jiomart_application() {

                System.out.println("Iam first");
   
}
@When("User clicks on {string} button")
public void user_clicks_on_button(String string) {
   
}
@When("User enters the valid mobile number in the mobile number field")
public void user_enters_the_valid_mobile_number_in_the_mobile_number_field() {
  
}
@Then("User will be prompted to enter the valid otp")
public void user_will_be_prompted_to_enter_the_valid_otp() {
   
}
@Then("User will be prompted to enter the valid otpda")
public void user_will_be_prompted_to_enter_the_valid_otpda() {

}

}
