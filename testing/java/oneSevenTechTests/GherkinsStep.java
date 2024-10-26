package oneSevenTechTests;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.PageObject;

public class GherkinsStep extends PageObject {

	public final static String WEB_PAGE_URL = "https://mailchimp.com/es/";

	private String usernameOutlookEmail = "musical_Bryan01@outlook.com";

	private String outlookPassword = "1144191672@spotify";
	
	private String mailchimpPassword = "1144.Musical";
	
	@Before
	public void browserSettings() {

		driver.manage().window().maximize();

	}

	
	@Given("^User Navigates to the MailChim WebPage$")
	public void navigateToMailchimPage() {

		mailChimpLoginPage.navigateToMailChimpPage(WEB_PAGE_URL);

		mailChimpLoginPage.closeCookiesPopUp();
	}
	

	@Given("Signs Up a New Account")
	public void signUpNewAccount() throws InterruptedException {

		mailChimpLoginPage.clicAtLoginButton();

		mailChimpLoginPage.clicAtCreateAnAccountLink();

		signUpPage.fillBussinessEmailField(usernameOutlookEmail);

		signUpPage.fillPasswordField(mailchimpPassword);

		signUpPage.clicAtHideIconButton();

		signUpPage.clicAtSignUpButton();

	}

	@When("LogIn to Outlook App")
	public void logInToOutlookApp() {

		checkYourEmailPage.clicAtOpenOutlook("https://outlook.live.com/mail/0/inbox");

		outlookMainPage.clicAtIniciarSesion(); 
		
		switchTotheSecondtab();
		
		executeImplicitWait();

		outlookLogInPage.fillEmailPhoneField(usernameOutlookEmail);

		outlookLogInPage.clicAtNextButton(); // TODO - Henry - - - - - - - - - - - - - - - - - - - - - - - - - - 

		outlookLogInPage.fillPassword(outlookPassword); // Testing Account - No Personal Information

		outlookLogInPage.clicSignInButton();

		outlookLogInPage.clicNoButton();

		executeImplicitWait();
	}

	@When("Open the Activation Link Email")
	public void openTheActivationLinkEmail() {

										// TODO - Switch Iframe [BRYAN]
		
		outlookInboxPage.clicAtInbox(); // Bandeja de Entrada

		outlookInboxPage.clicAtPrioritariosTab();

		outlookInboxPage.clicAtMailchimpClientServices(); // EL PRIMERO

		outlookInboxPage.scrollToWeReGladYouReHere(); 

		outlookInboxPage.clicAtActivateAccount();

	}

	@When("LogIn With the New Confirmed Account")
	public void logInWithTheNewConfirmedAccount() {

		driver.quit();	//Cierra Browser (TODAS las Pestañas)

		driver = new ChromeDriver(); //Abrir Browser

		driver.manage().window().maximize(); 
		
		loginPage.goToMainchampLoginScreen();
		
		mailChimpLoginPage.closeCookiesPopUp();

		mailChimpLoginPage.clicIniciarSesionButton();

		loginPage.fillUserName(); 
		
		loginPage.fillPassword();

		loginPage.clicAtIniciarSesion();
		
		executeImplicitWait();

		mailChimpLoginPage.navigateToMailChimpPage(WEB_PAGE_URL);

		mailChimpLoginPage.clicUsernameTopCornerIcon(); // Icono de la Esquina;
		
	}

	@After
	public void closeBrowser() throws InterruptedException {

		Thread.sleep(5000); // TODO - Borrar

		driver.quit();
	}


}
