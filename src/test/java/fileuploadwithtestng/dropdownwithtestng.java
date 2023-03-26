package fileuploadwithtestng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownwithtestng {

	WebDriver driver;

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

	}

	@Test
	public void dropdown() throws InterruptedException {
	
		
		WebElement web = driver.findElement(By.className("custom-select"));

		valueselect(web, "Norway");
		
		Thread.sleep(2000);
		
		WebElement web1 = driver.findElement(By.className("custom-select"));

		valueselect(web1, "Spain");
		
		Thread.sleep(2000);
		
		WebElement web2 = driver.findElement(By.className("custom-select"));

		valueselect(web, "Sweden");

		
	}
		private static void valueselect(WebElement el, String val) {
			Select drp=new Select(el);
			List<WebElement>everyvalue=drp.getOptions();
			for(WebElement value:everyvalue) {
				if(value.getText().equals(val)) {//value//
					value.click();
					break;
				}
			}
	    }
	

	@AfterTest
	public void teardwon() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
