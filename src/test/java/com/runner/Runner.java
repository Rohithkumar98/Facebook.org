package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "scr/test/java/com/featurefile", 
		glue = "com/stepdefinition"
		
		)


public class Runner {

}
