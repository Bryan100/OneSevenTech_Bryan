package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class OutlookInboxPage {

	private WebDriver driver;
	

	public OutlookInboxPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void clicAtInbox() {
		
		WebElement clickAtInbox = driver.findElement(By.xpath("//span [text() = 'Bandeja de entrada']"));
		
		clickAtInbox.click();
		
		
	}

	public void clicAtPrioritariosTab() {
		
	
		WebElement clickAtPrioritariosTab = driver.findElement(By.xpath("//span [text() = 'Prioritarios']"));
		
		clickAtPrioritariosTab.click();
		
		
	}

	public void clicAtMailchimpClientServices() {
		
        WebElement clickAtMailchimpClientServices = driver.findElement(By.xpath("//span [text() = 'Mailchimp Client Services']"));
		
		clickAtMailchimpClientServices.click();
		
	}

	public void scrollToWeReGladYouReHere() {
		
		 WebElement labelScrollToWeReGladYouReHere = driver.findElement(By.xpath("//h1 [text() = 'Nos alegra tenerte por aquí,']"));
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		
		 js.executeScript("arguments[0].scrollIntoView();", labelScrollToWeReGladYouReHere);
		
	}
	
	public void clicAtActivateAccount() throws InterruptedException {
		
        WebElement clickButtonActivateAccount = driver.findElement(By.xpath("//td [@id = 'x_button']"));
		
        clickButtonActivateAccount.click();
		
        Thread.sleep(3000);
	}


	public boolean isStayedSignedMessageDisplayed() {
		
		List<WebElement> webElementList = driver.findElements(By.xpath("//div[@id='kmsiTitle']"));

		return webElementList.size() > 0;
		
	}

}