package setpDefOrder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseStore.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;


public class StepOrderFile {
	WebDriver driver = TestBase.getDriver();
	LoginPage loginPage;
	
public StepOrderFile() {
	loginPage= new LoginPage(driver);
	
}
	@Given("User is on login page")
	public void user_is_on_login_page() {
		TestBase.openUrl("https://www.demoblaze.com/");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		loginPage.logIntoApp(strUser, strPwd);
	}
	@Then("User should be on Home Page")
	public void user_should_be_on_home_page() {
	    
	}
	@When("Add an item to cart")
	public void add_an_item_to_cart() {
	    
	}
	@Then("Item must be added to cart")
	public void item_must_be_added_to_cart() {
	    
	}

	
}
   
