package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	
	WebDriver driver;
	
	By loginPageTitle = By.cssSelector("#login-page>h2");
	By loginButton = By.cssSelector(".button-login");
	By userField = By.cssSelector("input[placeholder=\"Username\"]");
	By passField = By.cssSelector("input[placeholder=\"Password\"]");
	By loginErrorMessage = By.cssSelector("#login-error-message");
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLoginPageTitle() {
		return driver.findElement(loginPageTitle).getText();
	}
   
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void sendUserText(String userText) {
		driver.findElement(userField).sendKeys(userText);
	}
	
	public void sendPassText(String passText) {
		driver.findElement(passField).sendKeys(passText);
	}
	public String getLoginErrorMessage() {
		return driver.findElement(loginErrorMessage).getText();
	}
    
	
}
