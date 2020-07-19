package com.TestRunner;

import org.testng.annotations.AfterClass;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/Features/Admin.feature", glue = { "com.StepDefinition" }, plugin = { "pretty",
				"html:src/test/resources/Reports/cucumber-html-report",
				"json:src/test/resources/Reports/cucumber-html-report/jsonreport",
		// "com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreport.html"
		},

		monochrome = true

)

public class TestRunner extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}