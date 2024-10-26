package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailChimpLoginPage {

	private WebDriver driver;

	public MailChimpLoginPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void navigateToMailChimpPage(String URL) {
		
		driver.get(URL);
		
	}
	
	public void closeCookiesPopUp() {
	
		WebElement cookiesCloseButton = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));

		cookiesCloseButton.click();
	}
	
	
	public void clicAtLoginButton () {
		
		WebElement loginButton = driver.findElement(By.xpath("(//a[contains(@href,'login')])[1]"));
				
		loginButton.click();
	}

	public void clicAtCreateAnAccountLink() {
		
		WebElement createAccountLink = driver.findElement(By.xpath("//a[@id='create-account-link']"));
		
		createAccountLink.click();
	}

	public void clicIniciarSesionButton() {
		// TODO Auto-generated method stub
		
	}

	public void clicUsernameTopCornerIcon() {
		// TODO Auto-generated method stub
		
	}

	

}
