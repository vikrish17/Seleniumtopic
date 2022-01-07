package com.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_concepts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Frames.html");
		 
		 driver.manage().window().maximize();
		 
		 WebElement single = driver.findElement(By.id("singleframe"));
		 driver.switchTo().frame(single);
		 System.out.println("========singleframe======");
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		 
		 driver.switchTo().defaultContent();
		 System.out.println("========default content");
		 
		 WebElement iframe = driver.findElement(By.linkText("Iframe with in an Iframe"));
		 iframe.click();
		 
		 WebElement outer = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		 driver.switchTo().frame(outer);
		 System.out.println("=======outer frame=======");
		 
		 WebElement inner = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		 driver.switchTo().frame(inner);
		 System.out.println("==========outer frame========");
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		 
		 driver.switchTo().parentFrame();
		 driver.switchTo().parentFrame();
		 System.out.println("=======exit======");
		 
		
		 
		 
		
	}

}
