package fed.automation.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "fed.automation.stepdefinitions", tags = "@test1", monochrome = true)

public class RunnerCukes {

}
