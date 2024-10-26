package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutlookLogInPage {

	private WebDriver driver;

	public OutlookLogInPage(WebDriver driver) {
		this.driver = driver;
	}

	public void fillEmailPhoneField (String email) {
		
		WebElement emailField = driver.findElement(By.xpath("//input[@id='i0116']"));

		emailField.sendKeys(email);	
			
	}
	
	public void fillPassword(String password) {
		
		
	}
	
	public void clicAtNextButton() {
		
	}

	public void clicSignInButton() {
		
		
	}

	public void clicNoButton() {
		
		
	}

	
}
