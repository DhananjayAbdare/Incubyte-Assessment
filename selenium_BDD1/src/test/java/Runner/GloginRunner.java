package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Swara\\eclipse-workspace\\selenium_BDD1\\Feature\\gmail_Login.feature",
		glue={"StepDefinition"}
		)

public class GloginRunner {

}
