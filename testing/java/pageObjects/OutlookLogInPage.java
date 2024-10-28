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
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement emailField = driver.findElement(By.xpath("//input[@id='i0116']"));

		emailField.sendKeys(email);	
			
	}
	
	public void fillPassword(String password) {
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id = 'i0118']"));

		passwordField.sendKeys(password);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void clicAtNextButton() {
		
		WebElement ButtonNext = driver.findElement(By.xpath("//button [@type = 'submit']"));
			
		ButtonNext.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clicSignInButton() {
		
		 WebElement buttonSi = driver.findElement(By.xpath("//button[@id = 'idSIButton9']"));
			
		buttonSi.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public void clicNoButton() {
		
		 WebElement ButtonNo = driver.findElement(By.xpath("//button[@id = 'declineButton']"));
			
			ButtonNo.click();
		
	}

	
}