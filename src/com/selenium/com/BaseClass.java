package com.selenium.com;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriver browser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
				
				driver = new ChromeDriver();
				}
			else if (browsername.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\\\Driver\\\\chromedriver.exe");
				driver = new EdgeDriver();
				}
			else {
				
				System.out.println("invalid condition");
				
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void geturl(String url) {
     try {
		driver.get(url);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	public static void sendkeys(WebElement element, String email) {
      try {
		element.sendKeys(email);
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public static void closed(String url) {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
      
	}
	
	public static void navigate(String url) {
          try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void quit() {
		
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void navigateback(String url) {
		
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static  void navigateforward(String url) {
       try {
		driver.navigate().forward();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public static void navigaterefresh() {
		
        try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
		public static void getitle(String url) {
            try {
				driver.getTitle();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void getCurrenturl() {
             
			try {
				driver.getCurrentUrl();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    public static void Robot(String url) throws AWTException {
	    	
				java.awt.Robot r = new java.awt.Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
			
			}
	    
	    public static void Alert_Concepts(String url) {
	    	try {
	    		driver.switchTo().alert().accept();
			} catch (Exception e) {
				e.printStackTrace();
			}
              
		}
	    	

		}

	
	


