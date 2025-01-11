package com.jiomart.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
//     features = "./features/jiomart.feature", glue = "com.jiomart.stepdefinitions",
// tags = "@sanity", plugin = {"html:cucumberreports/cucumber.html"}
    features = "./features/jiomartnavbar.feature", glue = "com.jiomart.stepdefinitions", dryRun = false, monochrome = true
)

public class TestRunner {

}
