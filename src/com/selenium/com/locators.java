package com.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.instagram.com/");
		  
		  driver.manage().window().maximize();
		  
		  
		  Thread.sleep(2000);
		  driver.findElement(By.id("Mobile Number or Email")).sendKeys("9994433766");
		  
		  Thread.sleep(2000);
		  driver.findElement(By.name("fullName")).sendKeys("vignesh");
		  
		  Thread.sleep(2000);
		  driver.findElement(By.name("username")).sendKeys("vikrish");
		  
		  
	}

}
