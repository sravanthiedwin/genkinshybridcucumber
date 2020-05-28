$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/edwin/eclipse-workspace1/cucumberhybridframework/src/test/resources/Features/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "orangeHrm website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "orangehrm-website;validate-the-login-functionality;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 12,
      "id": "orangehrm-website;validate-the-login-functionality;;2"
    },
    {
      "cells": [
        "admin",
        "Admin123"
      ],
      "line": 13,
      "id": "orangehrm-website;validate-the-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "orangehrmloginstep.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 6924033700,
  "status": "passed"
});
formatter.match({
  "location": "orangehrmloginstep.login_page_is_opened()"
});
formatter.result({
  "duration": 963132500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 11
    },
    {
      "val": "admin123",
      "offset": 23
    }
  ],
  "location": "orangehrmloginstep.enter_the_and(String,String)"
});
formatter.result({
  "duration": 1397836000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validate the login functionality",
  "description": "",
  "id": "orangehrm-website;validate-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_login"
    },
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"admin\" and \"Admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "orangehrmloginstep.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 5309464800,
  "status": "passed"
});
formatter.match({
  "location": "orangehrmloginstep.login_page_is_opened()"
});
formatter.result({
  "duration": 1058978900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 11
    },
    {
      "val": "Admin123",
      "offset": 23
    }
  ],
  "location": "orangehrmloginstep.enter_the_and(String,String)"
});
formatter.result({
  "duration": 1066139700,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Validate admin functionality",
  "description": "",
  "id": "orangehrm-website;validate-admin-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "launch orangehrm application",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "click on admin",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "enter username",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "select userrole",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "select status",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "enter Employeename",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});