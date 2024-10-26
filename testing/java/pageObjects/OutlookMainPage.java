package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OutlookMainPage {

	private WebDriver driver;

	public OutlookMainPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicAtIniciarSesion() {
		
		WebElement loginButton = driver.findElement(By.xpath("(//a[text()='Iniciar sesión'])[2]"));
		
		loginButton.click();
	}
	

	
}
