package com.example.runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "@target/failedScenarios.txt",
    glue = "com.example.stepdefinitions",
    plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm","json:target/reports/cucumber-reports/cucumberReRun.json",
    		"junit:build/test-results/test/cucumberReRun.xml",
    		"html:target/reports/cucumber-reports/cucumberReRun.html"}
)
public class ReRunner {
}

