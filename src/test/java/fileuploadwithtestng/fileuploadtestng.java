package fileuploadwithtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileuploadtestng {
	

	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

	}
	
	@Test
	public void upload() throws InterruptedException {

		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Vishakha\\Downloads\\Akshay Kumar CV.pdf");
		Thread.sleep(2000);
				
		
	}
	
	@AfterTest
	public void teardwon() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	

}
