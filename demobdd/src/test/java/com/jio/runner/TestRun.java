package com.jio.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "./features/login.feature" , glue = "com.jio.stepdefinitions",
     plugin = {"pretty", "html:cucumber.html"},  tags = "@first or @second", dryRun = false
)


public class TestRun {

}
