package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = {"stepDefinitions"},
		tags = "@activity1",
		plugin = {"pretty","html: test-reports","json: test-reports/json-report.json"},
		monochrome = true
		)

public class ActivityRunner {}
