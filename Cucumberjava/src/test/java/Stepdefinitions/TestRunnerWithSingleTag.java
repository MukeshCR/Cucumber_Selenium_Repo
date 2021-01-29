package Stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/mukesh/git/TestProject1/Cucumberjava/src/test/resources/FeaturesWithTags" ,
glue={"Stepdefinitions"}, tags = "@smoke or @regression and not @sanity"

)

public class TestRunnerWithSingleTag {

}
