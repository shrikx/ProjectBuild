package com.selenium.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		if(driver.findElement(By.xpath("//button[@name='login']")).getSize() != null) {
			System.out.println("Element present");
		}
		else {
			System.out.println("Element not present");
		}
		System.out.println(driver.getTitle());
		 

	}

}
