package com.stepdefintion;

import org.openqa.selenium.WebDriver;

import com.baseclass.Library;
import com.pages.orangeLeave;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class orangehrmLeavestep extends Library {
	//WebDriver driver;
	orangeLeave l=new orangeLeave(driver);
	@Then("^click on Leave$")
	public void click_on_Leave()  {
		l.clickleave();
	
	}

	
	@Then("^type name of the employee$")
	public void type_name_of_the_employee()  {
		l.typeemployeename("edwin");
	   
	}

	@Then("^sub unit is selected$")
	public void sub_unit_is_selected()  {
		l.selectsubunit("IT");
	   
	}

	@Then("^search button is clicked$")
	public void search_button_is_clicked()  {
		l.searchbutton();
	   
	}



}
