package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions 
(
		features = "featurefiles\\userLogin.feature",
		glue = "stepDefinitions",
		dryRun = false,
		plugin = {"pretty","html:TestReports/userLogin.html"}
		
		
)
public class userLoginTestCase extends AbstractTestNGCucumberTests
{

}
