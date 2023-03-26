package Practiceradiodropdown ;
	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Radiobuttonpractice {

		WebDriver driver;

		@BeforeTest
		public void beforetest() {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.get("https://itera-qa.azurewebsites.net/home/automation");

		}

		@Test
		public void radio() throws InterruptedException {
			Thread.sleep(2000);
			List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio'  and contains(@id ,'ale')]"));

			System.out.println("The size of the radio is=:" + radio.size());
			for (WebElement btn : radio) {
				Thread.sleep(1000);
				btn.click();
			}
		}

		@AfterTest
		public void teardwon() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
		}

	}


