package fed.automation.testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features",
glue="fed.automation.stepdefinitions",
tags="@regression",
monochrome=true,
plugin = "json:target/cucumber-report.json"
)

public class TestNgRunner extends AbstractTestNGCucumberTests{
  

}
