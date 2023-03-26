package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileuploaddemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Vishakha\\Downloads\\Akshay Kumar CV.pdf");
		Thread.sleep(2000);
				driver.close();
		
	}

}
