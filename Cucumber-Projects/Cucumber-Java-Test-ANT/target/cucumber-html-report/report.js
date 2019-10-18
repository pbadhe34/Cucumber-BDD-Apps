$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("belly.feature");
formatter.feature({
  "line": 1,
  "name": "Belly",
  "description": "",
  "id": "belly",
  "keyword": "Feature"
});
formatter.before({
  "duration": 335292,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "a few cukes",
  "description": "",
  "id": "belly;a-few-cukes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have 42 cukes in my belly",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I wait 1 hour",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "my belly should growl",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "42",
      "offset": 7
    }
  ],
  "location": "Stepdefs.I_have_cukes_in_my_belly(int)"
});
formatter.result({
  "duration": 163997930,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 7
    }
  ],
  "location": "Stepdefs.i_wait_hour(int)"
});
formatter.result({
  "duration": 226736,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefs.my_belly_should_growl()"
});
formatter.result({
  "duration": 86229,
  "status": "passed"
});
formatter.after({
  "duration": 74680,
  "status": "passed"
});
});