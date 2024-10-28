package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	private WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void fillBussinessEmailField(String email) {

		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));

		emailField.sendKeys(email);			
	}

	public void fillUsernameField(String username) {
		
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='new_username']"));

		usernameField.clear();
		
		usernameField.sendKeys(username);
		
	}
	

	public void fillPasswordField(String password) {
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='new_password']"));

		passwordField.sendKeys(password);
	}
	
	
	public void clicAtHideIconButton() {
			
		WebElement hideButton = driver.findElement(By.xpath("//label[@for='show-password']"));
				
		hideButton.click();
	}
	
	public void clicAtSignUpButton() throws InterruptedException {
		
		WebElement signUpButton = driver.findElement(By.xpath("//button[contains(@id,'create-account')]"));
		
		signUpButton.click();
			    
		Thread.sleep(3000);	    
	}
	

	
	

}
