package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java8.En;
import pages.MainPage;




public class MainPageSteps extends BaseSteps implements En {

	public MainPageSteps() {

		Given("^Nos encontramos en la pagina inicial \"(.+?)\"$", (String titulo)->{
			MainPage main_page = new MainPage(driver);
			String title = main_page.getHomePageTitle();
			assertEquals(title, titulo);		
		
		});
		
			When("pulsamos boton acceso al login", ()->{
			MainPage main_page = new MainPage(driver);
			main_page.clickLoginButton();
		
		});
		
		
	}
}