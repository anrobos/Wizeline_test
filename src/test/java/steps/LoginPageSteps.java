package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java8.En;
import pages.LoginPage;
import pages.MainPage;




public class LoginPageSteps extends BaseSteps implements En {

	public LoginPageSteps() {

		When("^Nos encontramos en pagina de login \"(.+?)\"$", (String titleTextExpected)->{
			LoginPage login_page = new LoginPage(driver);
			String titleTextObtained = login_page.getLoginPageTitle();
			assertEquals(titleTextObtained, titleTextExpected);		
		
		});
		
			When("^Introducimos usuario \"(.+?)\" y password \"(.+?)\"$", (String userText, String passText)->{
				LoginPage login_page = new LoginPage(driver);
				login_page.sendUserText(userText);
				login_page.sendPassText(passText);			
		
		});
			When("pulsamos boton de logado", ()->{
				LoginPage login_page = new LoginPage(driver);
				login_page.clickLoginButton();
		
		});
			Then("^Nos encontramos un mensaje de error \"(.+?)\"$", (String loginErrorTextExpected)->{
				LoginPage login_page = new LoginPage(driver);
				String loginErrorObtained = login_page.getLoginErrorMessage();
				assertEquals(loginErrorObtained, loginErrorTextExpected);	
		});
		
		
	}
}