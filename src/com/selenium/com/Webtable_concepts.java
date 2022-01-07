package com.selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_concepts {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.w3schools.com/html/html_tables.asp");
    	driver.manage().window().maximize();
		
	}
}
