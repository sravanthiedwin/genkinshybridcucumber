package com.testrunner;
/*surefire plugin is used during the test phase of the build lifecycle to execute the unit tests of the application.It generates reports in two file formats 
1.plain text format .txt file
2.xml format
it is used to run the tests through maven.*/

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)-this is only for junit and it should be commented when executing with testng
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\edwin\\eclipse-workspace1\\cucumberhybridframework\\src\\test\\resources\\Features\\Testcase.feature",
		glue= {"com.stepdefintion"},
		
				 plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report","json:src/test/resources/Reports/cucumber-html-report/jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreports/Extentreport.html"}
//tags= {"@tc_01_admin","@tc_03_Recruitment"}
		
		)
//public class testrunner extends AbstractTestNGCucumberTests{-for testNG
//and also import testng  and cucumber testng in pom.xml
public class testrunner {
	 @AfterClass
     public static void extendReport()
   {
       Reporter.loadXMLConfig("src\\test\\resources\\configurationproperties\\extent-config.xml");
       Reporter.setSystemInfo("user", System.getProperty("user.name"));
       Reporter.setSystemInfo("os", "Windows");

}}
