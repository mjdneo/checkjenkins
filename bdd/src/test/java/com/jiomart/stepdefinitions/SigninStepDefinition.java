package com.jiomart.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninStepDefinition {

    WebDriver driver;

    // @Given("Open the Browser")
    // public void open_the_browser() {
        
    // }

    @Given("User open the application")
    public void user_open_the_application() {
        System.out.println("Search Functionality Started");
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
            driver.manage().window().maximize();
            driver.get("https://www.jiomart.com");
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("User click on the advance search icon, the search bar opens")
    public void user_click_on_the_advance_search_icon_the_search_bar_opens() {
        driver.findElement(By.id("btn_search_list")).click();
        
    }

    @When("User input two search values {string} and {string} inside search bar")
public void user_input_two_search_values_and_inside_search_bar(String string, String string2) {
    driver.findElement(By.id("rel_search_val")).sendKeys(null);
}


    @When("User clicks on searchAll button")
    public void user_clicks_on_search_all_button() {
        driver.findElement(By.xpath("//button[@type='submit' and text()=' Search All ']")).click();
    }

    @Then("the search results page should display two search result products.")
    public void the_search_results_page_should_display_two_search_result_products() {
        System.out.println("Search Functionality Completed");
         driver.quit();

    }

    @Given("User opened the Jiomart web application.")
    public void user_opened_the_jiomart_web_application() {
        System.out.println("Sigin Functionality Started");
    }

    @When("the user clicks on sign in, they are redirected to the sign-in module.")
    public void the_user_clicks_on_sign_in_they_are_redirected_to_the_sign_in_module() {
        
    }

    @When("the user input the valid {string} mobile number.")
    public void the_user_input_the_valid_mobile_number(String string) {

    }

    @When("the user clicks on the continue button.")
    public void the_user_clicks_on_the_continue_button() {

    }

    @Then("the user should be prompted to enter the valid OTP.")
    public void the_user_should_be_prompted_to_enter_the_valid_otp() {
        System.out.println("Sigin Functionality Completed");
        driver.quit();
    }

}
