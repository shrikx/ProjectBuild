package com.selenium.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumExample4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualTitle = driver.getTitle();
//		System.out.println(actualTitle);
		String expectedTitle = "Facebook – log in or sign up";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title do not match");
		}
//		Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		

	}

}
