package dropdown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://blazedemo.com/");

		WebElement web1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		valueselect(web1, "Boston");

		Thread.sleep(2000);

		WebElement web2 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		valueselect(web2, "London");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();

		Thread.sleep(2000);
		
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"inputName\"]"));

		ele.sendKeys("Vishakh nain");
		
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("address"));
ele1.sendKeys("India");
		
		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("city"));

		ele3.sendKeys("Noida");
		
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("state"));

		ele4.sendKeys("UP");
		
		Thread.sleep(2000);

		
		
		WebElement ele5 = driver.findElement(By.id("zipCode"));

		ele5.sendKeys("201301");
		
		Thread.sleep(2000);
		
		

		WebElement web = driver.findElement(By.className("form-inline"));

		Thread.sleep(2000);

		Select drpvalue = new Select(web);

		drpvalue.selectByValue("visa");

		Thread.sleep(2000);
		
		
		WebElement ele6 = driver.findElement(By.id("creditCardNumber"));

		ele6.sendKeys("012345678910");
		
		Thread.sleep(2000);
		
		
		WebElement ele7 = driver.findElement(By.id("creditCardYear"));

		ele7.sendKeys("2023");
		
		Thread.sleep(2000);
		
		
		WebElement ele8 = driver.findElement(By.id("creditCardMonth"));

		ele8.sendKeys("January");
		
		Thread.sleep(2000);
		
		
		WebElement ele9 = driver.findElement(By.id("nameOnCard"));

		ele9.sendKeys("Vishakha");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		Thread.sleep(2000);
		driver.close();

		TakesScreenshot sc = ((TakesScreenshot) driver);

		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\image\\imagesss.png");
		FileUtils.copyFile(src, f2);

		Thread.sleep(2000);

		driver.close();

	}

	public static void valueselect(WebElement el, String val) {
		Select drp = new Select(el);
		List<WebElement> everyvalue = drp.getOptions();

		for (WebElement value : everyvalue) {
			if (value.getText().equals(val)) {// value //
				value.click();
				break;
			}
		}

	}

}
