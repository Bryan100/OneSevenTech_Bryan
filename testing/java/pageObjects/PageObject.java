package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {

	private final static String GOOGLE_CHROME_DRIVER_LOCATION = "Drivers/chromedriver-win64/chromedriver.exe";

	protected WebDriver driver;
		
	protected MailChimpLoginPage mailChimpLoginPage;
	
	protected MailChimpMainPage mailChimpMainPage;
	
	protected OutlookInboxPage outlookInboxPage;
	
	protected OutlookLogInPage outlookLogInPage;
	
	protected OutlookMainPage outlookMainPage;
	
	protected SignUpPage signUpPage;
	
	protected WebDriver openNewBrowser() {
		
		driver = new ChromeDriver();
		
		maximizeWindow();
		
		return driver;
	}
	
	
	protected void initPageObjects(WebDriver driver){
	    		
		System.setProperty("webdriver.chrome.driver", GOOGLE_CHROME_DRIVER_LOCATION);
				
	    mailChimpLoginPage = new MailChimpLoginPage(driver);
		
	    mailChimpMainPage = new MailChimpMainPage(driver);
		
	    outlookInboxPage = new OutlookInboxPage(driver);
		
	    outlookLogInPage = new OutlookLogInPage(driver);
		
	    outlookMainPage = new OutlookMainPage(driver);
		
	    signUpPage  = new SignUpPage(driver);
	}


	protected void switchTotheSecondtab() {
	
		Set<String> idVentanas = driver.getWindowHandles();

		Iterator<String> iterador = idVentanas.iterator();

		iterador.next();
		
		driver.switchTo().window(iterador.next());

	}
	
	
	protected void executeImplicitWait() {
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	protected void maximizeWindow() {
		
		driver.manage().window().maximize();
	}
	
	protected void closeBrowser() {
		
		driver.quit();
	}
	
	protected void navigateTo(String URL) {
		
		driver.get(URL);
		
		executeImplicitWait();
	}
	

	protected void closeFirstBrowserTab() {
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

		driver.switchTo().window(tabs.get(0));
		
		driver.close();	
		
		driver.switchTo().window(tabs.get(1));		
	}
	
}
