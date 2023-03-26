package Practiceradiodropdown;

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

public class Textarea {
	
	
	WebDriver driver;
	

	@BeforeTest
	public void beforetest()  {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

	}
	
	@Test
	public void text() throws InterruptedException {

		WebElement ele = driver.findElement(By.id("name"));

		ele.sendKeys("Vishakha");
		
		Thread.sleep(2000);
		
		
		WebElement ele1 = driver.findElement(By.id("phone"));

		ele1.sendKeys("0123456789");
		
		Thread.sleep(2000);
		
		
		WebElement ele2 = driver.findElement(By.id("email"));

		ele2.sendKeys("Vishakha.nain@gmail.com");
		
		Thread.sleep(2000);
		
		
		WebElement ele3 = driver.findElement(By.id("password"));

		ele3.sendKeys("Vishakha123");
		
		Thread.sleep(2000);
		
		
		WebElement ele4 = driver.findElement(By.id("address"));

		ele4.sendKeys("noida");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		

	}

	@AfterTest
	public void teardwon() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
}


