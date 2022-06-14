package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	@Given("user launch the facebook application")
	public void user_launch_the_facebook_aplication() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
		
	@When("user login with valid username")
    public void user_login_with_valid_username() {
	   Object driver;
	driver.findelement(by.)	
	}
	@When("user login with valid password")
	public void user_login_with_valid_password() {
		
	}
	@Then("user click login button")
	public void user_click_login_button() {
		
	}
	
	
	
	
}
