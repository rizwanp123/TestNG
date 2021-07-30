package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(id = "userName")
	WebElement usernamefield;
	
	@FindBy(id = "password")
	WebElement passwordfield;
	
	@FindBy(id = "login")
	WebElement loginButtonfield;
	
	
	public void enterUsername() {
		usernamefield.sendKeys("rizwan964");
	}
	
	public void enterPassword() {
		passwordfield.sendKeys("testpassword");
	}
	
	public void clickLoginButton() {
		loginButtonfield.click();
	}
	

}
