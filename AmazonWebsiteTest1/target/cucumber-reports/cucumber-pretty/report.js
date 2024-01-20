$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon login feature",
  "description": "",
  "id": "amazon-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Amazon login scenario",
  "description": "",
  "id": "amazon-login-feature;amazon-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on Amazon page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters email as \u003cemail\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "amazon-login-feature;amazon-login-scenario;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 9,
      "id": "amazon-login-feature;amazon-login-scenario;;1"
    },
    {
      "cells": [
        "sneha@gamil.com",
        "Sneha@123"
      ],
      "line": 10,
      "id": "amazon-login-feature;amazon-login-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Amazon login scenario",
  "description": "",
  "id": "amazon-login-feature;amazon-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is already on Amazon page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters email as sneha@gamil.com",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters password as Sneha@123",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Amazon_page()"
});
formatter.result({
  "duration": 786867200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sneha@gamil.com",
      "offset": 21
    }
  ],
  "location": "LoginStepDefinition.user_enters_email(String)"
});
formatter.result({
  "duration": 914264200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sneha@123",
      "offset": 24
    }
  ],
  "location": "LoginStepDefinition.user_enters_password(String)"
});
formatter.result({
  "duration": 87249200,
  "status": "passed"
});
});