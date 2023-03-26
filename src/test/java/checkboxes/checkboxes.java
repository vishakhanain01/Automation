package checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@type='checkbox'  and contains(@id ,'day')]"));

		System.out.println(checkboxes.size());

		for (WebElement box : checkboxes) {

			String chkn = box.getAttribute("id");
			System.out.println(chkn);
//			System.out.println(chkn.endsWith("monday"));
//			System.out.println(chkn.endsWith("tuesday"));

			if (chkn.equals("monday") || chkn.equals("tuesday")) {
				box.click();
			}
		}

		Thread.sleep(4000);
		driver.close();

	}

}