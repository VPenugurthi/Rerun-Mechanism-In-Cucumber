$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Sample.feature");
formatter.feature({
  "name": "Calculator",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Subtract two numbers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "CalculatorSteps.i_have_a_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I subtract 8 from 4",
  "keyword": "When "
});
formatter.match({
  "location": "CalculatorSteps.i_subtract_from(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the result should be 3",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.the_result_should_be(int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c3\u003e but was:\u003c4\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat com.example.stepdefinitions.CalculatorSteps.the_result_should_be(CalculatorSteps.java:32)\r\n\tat ✽.the result should be 3(file:src/test/resources/features/Sample.feature:11)\r\n",
  "status": "failed"
});
});