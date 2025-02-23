package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions
(
		features = "featurefiles\\userReg.feature",
		glue = "stepDefinitions",
		dryRun = false,
		plugin = {"pretty","html:TestReports/userRegistration.html"}

)

public class userRegTestCase extends AbstractTestNGCucumberTests
{

	
}
	