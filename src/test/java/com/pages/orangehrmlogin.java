package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangehrmlogin {
	WebDriver driver;
	@FindBy(id="txtUsername")
	WebElement userN;
	@FindBy(id="txtPassword")
	WebElement pass;
	@FindBy(id="btnLogin")
	WebElement login;
	@FindBy(linkText="Forgot your password?")
	WebElement forgotpassword;
	@FindBy(id="divLogo")
	WebElement logo;
	public orangehrmlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsernamePwd(String username,String password) {
		userN.sendKeys(username);
		pass.sendKeys(password);
		login.click();
		
	}
	public void verifylinkforgotpwddisplayed()  {
		Boolean forgot=forgotpassword.isDisplayed();
		System.out.println("The forgot password link is present on the page:"+forgot);
		forgotpassword.click();
		}
	public void logo() {
		
		Boolean logoimage=logo.isDisplayed();
		System.out.println("The orangehrm logo is dispalyed"+logoimage);
		
	}
	
	
}
