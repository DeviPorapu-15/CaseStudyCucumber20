package setpDefOrder;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseStore.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	 @Before
	 public static void setUpDriver() {
		 TestBase.initDriver();
	 }
	 
	 @After
	 public void tearDown(Scenario scenario) {
		 if(scenario.isFailed()) {
			 TakesScreenshot screen =(TakesScreenshot)TestBase.getDriver();
		byte[]	imgBytes = screen.getScreenshotAs(OutputType.BYTES);
		scenario.attach(imgBytes,"image/png" , "ScreenImage");
			 
	 }
		 
	 }

}
