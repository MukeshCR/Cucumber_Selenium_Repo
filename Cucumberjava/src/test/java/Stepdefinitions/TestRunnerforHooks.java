package Stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/mukesh/git/TestProject1/Cucumberjava/src/test/resources/HooksDemo/HooksDemo.feature", 
glue= {"Stepsforhooks"},
monochrome= true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports"}
		)
public class TestRunnerforHooks {

}
