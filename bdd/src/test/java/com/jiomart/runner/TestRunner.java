package com.jiomart.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "./features/jiomart.feature", glue = "com.jiomart.stepdefinitions")

public class TestRunner {

}
