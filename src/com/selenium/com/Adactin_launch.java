package com.selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Adactin_launch {
	public static void main(String[] args) throws AWTException, Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("vignesh1798");
		driver.findElement(By.id("password")).sendKeys("Vikrish@17");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.id("location")).click();//location
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("hotels")).click();//hotels
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("room_type")).click();//room type
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("room_nos")).click();//no of rooms
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.id("datepick_in"));//check in date
		date.clear();
		Thread.sleep(2000);
		date.sendKeys("12/12/2021");
		Thread.sleep(2000);
		
		WebElement date2 = driver.findElement(By.id("datepick_out"));//check out date
		date2.clear();
		Thread.sleep(2000);
		date2.sendKeys("14/12/2021");
		Thread.sleep(2000);
		
		driver.findElement(By.id("adult_room")).click();//adults per room
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("child_room")).click();//child per room
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("radiobutton_0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("vignesh");
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys("krishnan");
		Thread.sleep(2000);
		driver.findElement(By.id("address")).sendKeys("xxxxxx,yyyyyy,zzzzzz");
		Thread.sleep(2000);
		driver.findElement(By.name("cc_num")).sendKeys("1234567890987654");
		Thread.sleep(2000);
		
		driver.findElement(By.id("cc_type")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s = new Select(month);
		s.selectByValue("10");
		Thread.sleep(2000);
		driver.findElement(By.name("cc_exp_year")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("000");
		Thread.sleep(2000);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
	}

	
}
