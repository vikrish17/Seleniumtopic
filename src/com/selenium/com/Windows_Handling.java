package com.selenium.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement first = driver.findElement(By.linkText("Fashion"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(first).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
	    WebElement second = driver.findElement(By.linkText("Best Sellers"));
	    ac.contextClick(second).perform();
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    
	    WebElement third = driver.findElement(By.linkText("Mobiles"));
	    ac.contextClick(third).perform();
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    
	    String one = driver.getWindowHandle();
	    String title = driver.switchTo().window(one).getTitle();
	    System.out.println(title);
	    
	    Set<String> all = driver.getWindowHandles();
	    for (String string1 : all) {
	    	String title2 = driver.switchTo().window(string1).getTitle();
	    	System.out.println(title2);
	    	
	    for (String string2 : all) {
	    	if (driver.switchTo().window(string2).getTitle().equals("Amazon.in Bestsellers: The most popular items on Amazon")) {
	    		break;
				
			}	
				
			}
			
		}	
	    	
			
		}
	   
		
	}


