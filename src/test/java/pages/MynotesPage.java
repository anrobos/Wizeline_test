package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MynotesPage {
	
	WebDriver driver;
	
	By mynotesPageTitle = By.cssSelector("#my-notes-page>h2");

	
	public MynotesPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getMynotesPageTitle() {
		return driver.findElement(mynotesPageTitle).getText();
	}
   

	
}
