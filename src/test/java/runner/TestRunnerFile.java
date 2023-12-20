package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src//test//resources//features//StoreLogin.feature",
		glue= {"stepDefOrder"},
		//dryRun = false,
		monochrome= true,
		plugin= {"pretty",
				"html:target//Report//HtmlReport.html"}
				)
public class TestRunnerFile extends AbstractTestNGCucumberTests {
	

}
