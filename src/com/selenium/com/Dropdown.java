package com.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("day"));
		Thread.sleep(2000);
		Select a = new Select(date);
		a.selectByValue("17");
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select a1 = new Select(month);
		a1.selectByVisibleText("Jul");
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));	
		Select a2 = new Select(year);
		a2.selectByValue("1998");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
	}

}
