$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Master123.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is \"\u003cTitle\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify user is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "Title",
        "username",
        "password"
      ],
      "line": 12,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "CRMPRO - CRM software for customer relationship management, sales, and support.",
        "nadeemz",
        "Test@123"
      ],
      "line": 13,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "CRMPRO - CRM software for customer relationship management, sales, and support.",
        "groupautomation",
        "Test@1234"
      ],
      "line": 14,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is \"CRMPRO - CRM software for customer relationship management, sales, and support.\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters \"nadeemz\" and \"Test@123\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify user is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CRMStepDefinition2.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 140594753700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CRMPRO - CRM software for customer relationship management, sales, and support.",
      "offset": 24
    }
  ],
  "location": "CRMStepDefinition2.title_of_login_page_is(String)"
});
formatter.result({
  "duration": 651032400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nadeemz",
      "offset": 13
    },
    {
      "val": "Test@123",
      "offset": 27
    }
  ],
  "location": "CRMStepDefinition2.user_enters_and(String,String)"
});
formatter.result({
  "duration": 1649394200,
  "status": "passed"
});
formatter.match({
  "location": "CRMStepDefinition2.user_click_on_login_button()"
});
formatter.result({
  "duration": 39728195700,
  "status": "passed"
});
formatter.match({
  "location": "CRMStepDefinition2.verify_user_is_on_Home_Page()"
});
