package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
		PageFactory.initElements(driver, this);
		
	}
	public void pagelogclick() {
		login.click();
	}
	public void logIntoApp(String strUser, String strPwd) {
		  username.sendKeys(strUser);
		  pwd.sendKeys(strPwd);
		  loginbtn.click();
	   }
}
