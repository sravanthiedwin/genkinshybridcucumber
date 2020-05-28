@orangeHRM
Feature: orangeHrm website
Background: User is logged in 
Given launch the browser and enter the url 
When login page is opened
Then user enters the login credentials

@tc_01_admin
Scenario: Validate admin functionality

Then admin should be selected
Then type name
Then select userrole
Then enter Employeename
Then click on the search button
And close the browser

@tc_02_leave
Scenario: validate Leave funtionality
Then click on Leave  
Then leave status is shown
Then type name of the employee
Then sub unit is selected 
And search button is clicked

@tc_03_Recruitment
Scenario: Validate Recuritment functionality
When recuritment link is clicked
When select jobtitle
When select hiringmanager
When enter candidate name
When type keywords
When pick  from date of application
When pick  to date of applictaion  
When select method of application
Then click on search 



 
