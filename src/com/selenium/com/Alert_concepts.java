package com.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_concepts {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		click.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		WebElement click1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		click1.click();
		
		WebElement click2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		click2.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement click3 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		click3.click();
		
		WebElement click4 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		click4.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
	}

}
