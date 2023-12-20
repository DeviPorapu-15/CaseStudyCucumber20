package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
	@FindBy(id="login2")
	WebElement login;
	
	@FindBy(id="loginusername")
	WebElement username;
	
	@FindBy(id="loginpassword")
	WebElement pwd;
	
	@FindBy(id="//button[contains(text(),'Log in')]")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		
	}
	public static void logIntoApp() {
				   
	   }
}
