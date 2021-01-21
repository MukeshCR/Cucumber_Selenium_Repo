package Stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/mukesh/eclipse-workspace/Cucumberjava/src/test/resources/Features" ,
glue={"Stepdefinitions"},
monochrome= true ,
plugin = {"pretty" , "junit:target/JunitReports/report.junit",
		  "json:/target/JSONreports/report.json",
		  "html:target/HtmlReports"	}									//to generate reports
)

public class TestRunner {

}
