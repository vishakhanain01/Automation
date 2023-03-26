
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@Test(priority = 1)
	public void verifyUrl() {
		
		String expecurl="https://www.saucedemo.com/";
		
		String actualurl=driver.getCurrentUrl();
		assertEquals(expecurl, actualurl);
		assertTrue(true);
	}
	
	@Test(priority = 2)
	public void VeryTile() {
		
		String expectedtitle="Swag Labs";
		
		String actualtile=driver.getTitle();
		
		assertEquals(expectedtitle, actualtile);
		
		assertTrue(true);
	}
	
	@Test(priority = 3)
	public void login() throws InterruptedException {
		WebElement ele = driver.findElement(By.id("user-name"));
		ele.sendKeys("standard_user");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("password"));

		ele1.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);
	}
	
	
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	
	
	
	
}
