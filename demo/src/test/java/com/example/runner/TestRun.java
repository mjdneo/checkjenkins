package com.example.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
    features = "./features/hotelapp.feature", glue = "com.example.stepdefinitions"
)

public class TestRun {

}
