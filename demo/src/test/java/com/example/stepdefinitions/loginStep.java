package com.example.stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStep {

    WebDriver driver;


    @Given("Open the browser and navigate to hotel app")
    public void open_the_browser_and_navigate_to_hotel_app() {
        
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
            driver.get("https://www.jiomart.com");
            driver.manage().window().maximize();
            Thread.sleep(3000);
        } catch (Exception e) {
           
        }
    }

    @When("user enters the valid username")
    public void user_enters_the_valid_username() {
            
    }

    @And("user enters the valid password")
    public void user_enters_the_valid_password() {

    }

    @And("Clicks on login button")
    public void clicks_on_login_button() {

    }

    @Then("Verify the redirected page is valid")
    public void verify_the_redirected_page_is_valid() {
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }

}
