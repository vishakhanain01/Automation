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

public class drpv2 {

	public static void main(String[] args)throws InterruptedException, IOException { {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://blazedemo.com/");

		WebElement web = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		valueselect(web, "Boston");

		Thread.sleep(2000);
		
		WebElement web1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		valueselect(web1, "London");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("inputName"));
		ele2.sendKeys("Ambuj");

		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("address"));
		ele3.sendKeys("Saket");

		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("city"));
		ele4.sendKeys("New delhi");

		Thread.sleep(2000);
		
		WebElement ele5 = driver.findElement(By.id("state"));
		ele5.sendKeys("delhi");

		Thread.sleep(2000);
		
		WebElement ele6 = driver.findElement(By.id("zipCode"));
		ele6.sendKeys("110017");

		Thread.sleep(2000);
		
		WebElement web7 = driver.findElement(By.xpath("/html/body/div[2]/form/div[6]/div/select"));
		valueselect(web7, "Visa");

		Thread.sleep(2000);
		
		WebElement ele8 = driver.findElement(By.id("creditCardNumber"));
		ele8.sendKeys("1234567891234567");

		Thread.sleep(2000);
		
		WebElement ele9 = driver.findElement(By.id("creditCardMonth"));
		ele9.sendKeys("11");

		Thread.sleep(2000);
		
		WebElement ele10 = driver.findElement(By.id("creditCardYear"));
		ele10.sendKeys("2023");

		Thread.sleep(2000);
		
		WebElement ele11 = driver.findElement(By.id("nameOnCard"));
		ele11.sendKeys("Ambuj");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();

		Thread.sleep(2000);
		
		TakesScreenshot sc=((TakesScreenshot)driver);
		File src=sc.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\image\\images.png");
		FileUtils.copyFile(src,f2);
		
		Thread.sleep(2000);
		
		driver.close();		
		



	}

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
		
		
	}