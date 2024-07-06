package com.example.runners;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Util.TestConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.example.stepdefinitions",
    plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "json:target/reports/cucumber-reports/cucumber.json",
    		"junit:build/test-results/test/cucumber.xml",    		
    		 "rerun:target/failedScenarios.txt"}
)
public class Runner {
	
	@BeforeClass
	public static void setUp() {
		TestConfig.cleanReportFiles();
	}
}

