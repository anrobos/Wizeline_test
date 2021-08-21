package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java8.En;
import pages.LoginPage;
import pages.MainPage;
import pages.MynotesPage;




public class MynotesPageSteps extends BaseSteps implements En {

	public MynotesPageSteps() {

		When("^Nos encontramos logados en la pagina de bienvenida \"(.+?)\"$", (String titleExpected)->{
			MynotesPage mynotes_page = new MynotesPage(driver);
			String titleObtained = mynotes_page.getMynotesPageTitle();
			assertEquals(titleObtained, titleExpected);		
		
		});
		
			
		
		
	}
}