package com.jiomart.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
    @CucumberOptions(features = "./features/sigin.feature", glue = "com.jiomart.stepdefinitions" ,
tags = {{"@p2, @p1"}}
 )
public class TestRun {

}
