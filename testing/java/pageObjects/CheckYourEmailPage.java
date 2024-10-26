package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckYourEmailPage {
	
	private WebDriver driver;
	
	public CheckYourEmailPage(WebDriver driver) {
		this.driver = driver;
	}


	public void clicAtOpenOutlook(String url) {
		
		driver.get(url);
	
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
