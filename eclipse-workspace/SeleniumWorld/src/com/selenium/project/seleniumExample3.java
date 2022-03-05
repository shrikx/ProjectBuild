package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExample3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		if(driver.findElement(By.xpath("//button[@name='login']")).isEnabled()) {
			System.out.println("Element is enabled");
		}
		else {
			System.out.println("Element is not enabled");
		}
		System.out.println(driver.getTitle());

	}

}
