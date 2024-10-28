package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailChimpLoginPage {

	private WebDriver driver;

	
	public MailChimpLoginPage(WebDriver driver) {
	
		this.driver = driver;
	}
	
	public void fillUserName(String username) {
		
		WebElement emailField = driver.findElement(By.xpath("//input [@id= 'username']"));

		emailField.sendKeys(username);
		
	}
	
	public void fillPassword(String password) {
		
		WebElement passwordField = driver.findElement(By.xpath("//input [@id= 'password']"));

		passwordField.sendKeys(password);
		
	}

	public void clicAtIniciarSesion() {
		
      WebElement clickButtonIniciarSesion = driver.findElement(By.xpath("//button [@id= 'submit-btn']"));
		
      clickButtonIniciarSesion.click();
	}
	
	
	
	public void clicAtCreateAnAccountLink() {
		
		WebElement createAccountLink = driver.findElement(By.xpath("//a[@id='create-account-link']"));
		
		createAccountLink.click();
	}


}
