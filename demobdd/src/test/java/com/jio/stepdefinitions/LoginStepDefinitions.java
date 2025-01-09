package com.jio.stepdefinitions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    WebDriver driver;

    // @Given("User opened the browser and launched jiomart application")
    // public void user_opened_the_browser_and_launched_jiomart_application() {

    //     try {
    //         driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
    //         driver.get("https://www.jiomart.com");
    //         Thread.sleep(4000);
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }

    // }

    // @When("User clicks on {string} button")
    // public void user_clicks_on_button(String string) {

    // }

    // @And("User enters the valid mobile number in the mobile number field")
    // public void user_enters_the_valid_mobile_number_in_the_mobile_number_field() {

    // }

    // @Then("User will be prompted to enter the valid otp")
    // public void user_will_be_prompted_to_enter_the_valid_otp() {
    //     System.out.println(driver.getCurrentUrl());
    //     driver.quit();
    // }


    @When("User clicks on {string} button")
public void user_clicks_on_button(String string) {
          try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
            driver.get("https://www.jiomart.com");
            Thread.sleep(4000);
        } catch (Exception e) {
            // TODO: handle exception
        }
}
@When("User enters the valid mobile number in the mobile number field")
public void user_enters_the_valid_mobile_number_in_the_mobile_number_field() {
    System.out.println("fssfs");
}
@Then("User will be prompted to enter the valid otp")
public void user_will_be_prompted_to_enter_the_valid_otp() {
    System.out.println("Done");
    driver.quit();
}

}
