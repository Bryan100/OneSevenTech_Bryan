package oneSevenTechTests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.PageObject;

public class GherkinsStep extends PageObject {

	public final static String WEB_PAGE_URL = "https://mailchimp.com/es/";

	private String usernameEmail = "musical_Bryan01@outlook.com";

	@Given("^User Navigates to the MailChim WebPage$")
	public void navigateToMailchimPage() {

		mailChimpLoginPage.navigateToMailChimpPage(WEB_PAGE_URL);

		mailChimpLoginPage.closeCookiesPopUp();
	}

	@Given("Signs Up a New Account")
	public void signUpNewAccount() throws InterruptedException {

		mailChimpLoginPage.clicAtLoginButton();

		mailChimpLoginPage.clicAtCreateAnAccountLink();

		signUpPage.fillBussinessEmailField(usernameEmail);

		signUpPage.fillPasswordField("1144.Musical");

		signUpPage.clicAtHideIconButton();

		signUpPage.clicAtSignUpButton();
		
		Thread.sleep(100000);

	}

	@When("LogIn to Outlook App")
	public void logInToOutlookApp() {

		checkYourEmailPage.clicAtOpenOutlook();

		outlookMainPage.clicAtIniciarSesion();

		outlookLogInPage.fillEmailPhoneField(usernameEmail);

		outlookLogInPage.fillPassword("1144191672.youtube"); // Testing Account - No Personal Information

		outlookLogInPage.clicAtNextButton();

	}

	@When("Open the Activation Link Email")
	public void openTheActivationLinkEmail() {

		outlookInboxPage.clicAtInbox();

		outlookInboxPage.clicAtPrioritariosTab();

		outlookInboxPage.clicAtMailchimpClientServices();

		outlookInboxPage.scrollToWeReGladYouReHere();

		outlookInboxPage.clicAtActivateAccount();

	}

	@When("LogIn With the New Confirmed Account")
	public void logInWithTheNewConfirmedAccount() {

		loginPage.goToMainchampLoginScreen();

		loginPage.fillUserName(); 
		
		loginPage.fillPassword();

		loginPage.clicAtIniciarSesion();

	}

	@Before
	public void browserSettings() {

		driver.manage().window().maximize();

	}

	@After
	public void closeBrowser() throws InterruptedException {

		//driver.quit();

	}

}
