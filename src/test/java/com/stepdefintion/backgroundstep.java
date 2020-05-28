package com.stepdefintion;

import java.io.IOException;

import com.baseclass.Library;
import com.pages.orangehrmlogin;
import com.seleniumutils.seleniumutils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class backgroundstep extends Library {
	seleniumutils utils;
	@Given("^launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws IOException  {
		launchApplication();
	    
	}

	@When("^login page is opened$")
	public void login_page_is_opened() throws IOException  {
		 utils=new seleniumutils(driver);
		utils.getTitle();
		//utils.screenshot("src\\test\\resources\\Screenshots\\login.png");
		logger.info("the login page is opened");
	   
	}

	@Then("^user enters the login credentials$")
	public void user_enters_the_login_credentials(){

			orangehrmlogin lo= new orangehrmlogin(driver);
			lo.typeUsernamePwd("Admin", "admin123");
		    
		}

	   
	}


