package com.selenium.com;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_launch {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		
		WebDriver setter = new ChromeDriver();
		
		setter.get("https://accounts.google.com/");
		
		setter.manage().window().maximize();
		
		//setter.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		setter.findElement(By.id("identifierId")).sendKeys("ranjithrara2016@gmail.com");
		
		setter.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		
		Actions ac = new Actions(setter);
		ac.click();
		
       // WebElement select = setter.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));	
       // select.click();
		
		
	}

}
