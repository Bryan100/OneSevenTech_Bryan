package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckYourEmailPage {
	
	private WebDriver driver;
	
	public CheckYourEmailPage(WebDriver driver) {
		this.driver = driver;
	}


	public void clicAtOpenOutlook() {
		
		driver.get("https://outlook.live.com/mail/0/inbox");
		
	}

}
