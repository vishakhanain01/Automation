package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class url {
	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

	}

	@Test(priority = 1)
	public void urls() {
		String expectedurl = driver.getCurrentUrl();

		String actualurl = "https://www.saucedemo.com/";
		assertEquals(expectedurl, actualurl);
		assertTrue(true);

	}

	
	@AfterTest
	public void teardwon() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}