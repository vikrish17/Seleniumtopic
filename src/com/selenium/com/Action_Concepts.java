package com.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Concepts {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://traininginchennai.in/selenium-training-in-chennai.html");
		
		driver.manage().window().maximize();
		
		WebElement courses = driver.findElement(By.xpath("//div[@title='Courses']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(courses).perform();
	
	}

}
