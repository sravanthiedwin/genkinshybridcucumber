package com.stepdefintion;

import org.openqa.selenium.WebDriver;

import com.baseclass.Library;
import com.pages.orangehrmrecruitment;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangehrmrecruitement extends Library {
	//WebDriver driver;
	orangehrmrecruitment r=new orangehrmrecruitment(driver);
	
	
	@When("^recuritment link is clicked$")
	public void recuritment_link_is_clicked()  {
		r.clickrecuritment();
	   
	}

	@When("^select jobtitle$")
	public void select_jobtitle()  {
		r.selectjob("CEO");
	  
	}

	
	@When("^select hiringmanager$")
	public void select_hiringmanager()  {
		r.selecthiringmanager("All");
	    
	}

	@When("^enter candidate name$")
	public void enter_candidate_name()  {
		r.typename("siri");
	    
	}

	@When("^type keywords$")
	public void type_keywords()  {
		r.typekeyword("happy");
	    
	}

	@When("^pick  from date of application$")
	public void pick_from_date_of_application()  {
		r.selectreturndate("2020-3-5");
	    
	}

	@When("^pick  to date of applictaion$")
	public void pick_to_date_of_applictaion()  {
		r.selecttodate("2020-6-05");
	   
	}

	@When("^select method of application$")
	public void select_method_of_application()  {
		r.selectmethodofapplication("Manual");
	   
	}

	@Then("^click on search$")
	public void click_on_search()  {
		r.clicksearch();
	    
	}



}
