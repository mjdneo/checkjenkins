package com.jio.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "./features/login.feature" , glue = "com.jio.stepdefinitions"
 //  features = "./features/test.feature" , glue = "com.jio.stepdefinitions"
)



public class TestRun {

}
