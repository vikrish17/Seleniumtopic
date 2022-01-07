package com.selenium.com;

import org.openqa.selenium.By;

public class Demo_base extends BaseClass{
	public static void main(String[] args) throws Throwable {
		browser("chrome");
		
		geturl("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		sendkeys(driver.findElement(By.id("email")), "vignesh");
		
		sendkeys(driver.findElement(By.id("pass")), "123456789");
		
		Thread.sleep(2000);
		
		navigate("https://www.instagram.com/");
		Thread.sleep(2000);
		
		navigateback("https://www.facebook.com/");
		Thread.sleep(2000);
		
		navigateforward("https://www.instagram.com/");
	    Thread.sleep(2000);
		
		navigaterefresh();
		Thread.sleep(2000);
		
        getitle("https://www.facebook.com/");		
		getCurrenturl();
		
		geturl("https://www.google.co.in/");
		sendkeys(driver.findElement(By.xpath("//input[@type='text']")), "amazon");
		Robot("https://www.google.co.in/");
		geturl("http://demo.automationtesting.in/Alerts.html");
		Alert_Concepts("//button[@onclick='alertbox()']");
		
		//quit();
		
		
		
		
		
	}
	
	
	}
