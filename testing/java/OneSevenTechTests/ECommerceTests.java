package OneSevenTechTests;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerceTests {

	private WebDriver driver;

	@Before
	public void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		
	}

	@After
	public void tearDownAfterClass() throws Exception {
	}

	
	
	@Test
	public void test() {

		driver.manage().window().maximize();

		driver.get("https://mailchimp.com/es/");
	}

	
	
}
