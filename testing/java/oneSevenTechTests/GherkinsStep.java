package oneSevenTechTests;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.PageObject;

public class GherkinsStep extends PageObject {

	public final static String ECOMMERCE_WEB_PAGE_URL = "https://mailchimp.com/es/";

	public final static String OUTLOOK_URL = "https://outlook.live.com/mail/0/inbox";

	private String usernameOutlookEmail = "musical_Bryan01@outlook.com"; // Testing Account - No Personal Information

	private String outlookPassword = "1144191672@spotify"; // Testing Account - No Personal Information

	private String mailchimpPassword = "1144.Musical";

	@Before
	public void browserSettings() {

		WebDriver driver = openNewBrowser();

		initPageObjects(driver);
	}

	@Given("^User Navigates to the MailChim WebPage$")
	public void navigateToMailchimPage() {

		navigateTo(ECOMMERCE_WEB_PAGE_URL);

		mailChimpMainPage.closeCookiesPopUp();
	}

	@Given("Signs Up a New Account")
	public void signUpNewAccount() throws InterruptedException {

		mailChimpMainPage.clicAtLoginButton();

		mailChimpLoginPage.clicAtCreateAnAccountLink();

		signUpPage.fillBussinessEmailField(usernameOutlookEmail);

		signUpPage.fillPasswordField(mailchimpPassword);

		signUpPage.clicAtHideIconButton();

		signUpPage.clicAtSignUpButton();
	}

	@And("LogIn to Outlook App")
	public void logInToOutlookApp() {

		boolean loginSuccessful = false;

		while (!loginSuccessful) {

			navigateTo(OUTLOOK_URL);

			outlookMainPage.clicAtIniciarSesion();
			
			switchTotheSecondtab();

			executeImplicitWait();
			
			closeFirstBrowserTab();

			outlookLogInPage.fillEmailPhoneField(usernameOutlookEmail);

			outlookLogInPage.clicAtNextButton();

			outlookLogInPage.fillPassword(outlookPassword);

			outlookLogInPage.clicSignInButton();
			
			executeImplicitWait();

			loginSuccessful = outlookInboxPage.isStayedSignedMessageDisplayed();
		}

		outlookLogInPage.clicNoButton();

		executeImplicitWait();
	}


	@When("Open the Activation Link Email")
	public void openTheActivationLinkEmail() throws InterruptedException {

		outlookInboxPage.clicAtInbox();

		outlookInboxPage.clicAtPrioritariosTab();

		outlookInboxPage.clicAtMailchimpClientServices();

		outlookInboxPage.scrollToWeReGladYouReHere();

		outlookInboxPage.clicAtActivateAccount();
		
	}

	@When("LogIn With the New Confirmed Account")
	public void logInWithTheNewConfirmedAccount() throws InterruptedException {
		
		closeFirstBrowserTab();
		
		navigateTo(ECOMMERCE_WEB_PAGE_URL);

		mailChimpMainPage.clicAtLoginButton();

		executeImplicitWait();
		
		mailChimpLoginPage.fillUserName(usernameOutlookEmail);

		mailChimpLoginPage.fillPassword(mailchimpPassword);

		mailChimpLoginPage.clicAtIniciarSesion();

		executeImplicitWait();

		navigateTo(ECOMMERCE_WEB_PAGE_URL);

		executeImplicitWait();
		
		mailChimpMainPage.clicUsernameTopCornerIcon();
	}

	
	@After
	public void finishTest() throws InterruptedException {

		Thread.sleep(5000); 
		
		closeBrowser();
	}

}
