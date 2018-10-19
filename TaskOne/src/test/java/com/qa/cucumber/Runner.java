package com.qa.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\Desktop\\Friday\\TaskOne\\src\\test\\java\\com\\qa\\cucumber\\FridayAssessment.feature", glue = {"com.qa.cucumber"})

public class Runner {
}
