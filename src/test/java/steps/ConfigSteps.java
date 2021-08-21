package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java8.En;


public class ConfigSteps extends BaseSteps implements En{

	public ConfigSteps() {
		
		Before(()->{
			System.setProperty("webdriver.chrome.driver", "C://Se/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Al incluirlo a este nivel "Before" cada vez que usemos findElement este método será afectado por este implicit wait, usandolo en tiempo de ejecución.
			driver.manage().window().maximize();
			driver.get("http://testapp.galenframework.com/");
		});
		
	
		After(()->{
			driver.quit();
		
		});
		
	}
}