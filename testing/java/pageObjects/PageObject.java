package pageObjects;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {

	protected WebDriver driver;

	protected CheckYourEmailPage checkYourEmailPage;
	
	protected LoginPage loginPage;
	
	protected MailChimpLoginPage mailChimpLoginPage;
	
	protected MailChimpMainPage MailChimpMainPage;
	
	protected OutlookInboxPage outlookInboxPage;
	
	protected OutlookLogInPage outlookLogInPage;
	
	protected OutlookMainPage outlookMainPage;
	
	protected SignUpPage signUpPage;


	public PageObject() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();

		initPageObjects();
	}
	
	@Before
	public void setUp() throws Exception {

		driver.manage().window().maximize();

	}

	private void initPageObjects(){
	    
	    checkYourEmailPage = new CheckYourEmailPage(driver);
		
	    loginPage = new LoginPage (driver);
		
	    mailChimpLoginPage = new MailChimpLoginPage (driver);
		
	    MailChimpMainPage = new MailChimpMainPage (driver);
		
	    outlookInboxPage = new OutlookInboxPage (driver);
		
	    outlookLogInPage = new OutlookLogInPage (driver);
		
	    outlookMainPage = new OutlookMainPage (driver);
		
	    signUpPage  = new SignUpPage (driver);
	}



}
