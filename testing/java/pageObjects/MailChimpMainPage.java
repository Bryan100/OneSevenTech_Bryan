package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailChimpMainPage {

	private WebDriver driver;

	public MailChimpMainPage(WebDriver driver) {
		this.driver = driver;

	}

	
	public void closeCookiesPopUp() {
		
		WebElement cookiesCloseButton = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));

		cookiesCloseButton.click();
	}
	
	
	public void clicAtLoginButton () {
		
		WebElement loginButton = driver.findElement(By.xpath("(//a[contains(@href,'login')])[1]"));
				
		loginButton.click();
	}


	public void clicUsernameTopCornerIcon() {

		WebElement clickButtonUser = driver.findElement(By.xpath("(//button[contains(@onclick,'avatar')])[1]"));
		
		clickButtonUser.click();
	}	

	
}
