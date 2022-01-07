package com.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Automaion_practice {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vicky\\Seleniumtopic\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		Thread.sleep(2000);
		WebElement scrollup = driver.findElement(By.xpath("//h3[@class='page-subheading']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollup);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("krishnavignesh1298@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Vikrish@17");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		
		WebElement scrollup1 = driver.findElement(By.xpath("(//a[@title='Blouse'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='product-name'])[6]")).click();
		WebElement scrollup2 = driver.findElement(By.id("send_friend_button"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup2);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.findElement(By.xpath("(//a[@rel='nofollow'])[7]")).click();
		
		driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]")).click();		
		
		Thread.sleep(2000);
		
		WebElement scrollup3 = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup3);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		WebElement scrollup4 = driver.findElement(By.xpath("//a[@title='Previous']"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup4);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		WebElement scrollup5 = driver.findElement(By.xpath("(//p[@class='carrier_title'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup5);
		driver.findElement(By.id("cgv")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		
		Thread.sleep(2000);
		WebElement scrollup6 = driver.findElement(By.id("total_price"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup6);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		
		Thread.sleep(2000);
		WebElement scrollup7 = driver.findElement(By.id("cart_navigation"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup7);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		}

}
