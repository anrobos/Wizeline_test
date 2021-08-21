package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
	
	WebDriver driver;
	
	By loginButton = By.cssSelector(".button-login");
	
	public MainPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
   
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
    
	
}
