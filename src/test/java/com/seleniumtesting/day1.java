package com.seleniumtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.saucedemo.com/");

			Thread.sleep(2000);

			driver.close();

		}

}
