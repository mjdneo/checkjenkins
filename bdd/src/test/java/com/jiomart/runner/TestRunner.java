package com.jiomart.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "./features/jiomart.feature", glue = "com.jiomart.stepdefinitions", tags = "@sanity or @advsearch", plugin = {"html:cucumberreports/cucumber.html"}
    // features = "./features/jiomartnavbar.feature", glue = "com.jiomart.stepdefinitions", dryRun = true, monochrome = false
)

public class TestRunner {

}
