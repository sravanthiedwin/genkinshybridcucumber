package com.stepdefintion;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.Library;
import com.pages.orangehrmAdmin;
import com.pages.orangehrmlogin;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class orangehrmadminstep extends Library {
	//WebDriver driver;
	orangehrmAdmin a;
	
	@Then("^admin should be selected$")
	public void admin_should_be_selected() throws InterruptedException  {
		 a= new orangehrmAdmin(driver);
		a.adminselect();	  
	}

	
	@Then("^type name$")
	public void type_name()  {
	
		
		a.typeusername("edwin");
	
	}

	@Then("^select userrole$")
	public void select_userrole()  {
	
			
		a.selectuserrole("Admin");
	    
	}

	

	@Then("^enter Employeename$")
	public void enter_Employeename()  {
		
		
		a.typeemployeename("sandhya");
		
	   
	}

	@Then("^click on the search button$")
	public void click_on_the_search_button()  {
		
		
		a.clicksearchbutton();
	    
	}
	
	
	@And("^close the browser$")
	public void close_the_browser1()  {
	  a.teardown();  
	}



}
