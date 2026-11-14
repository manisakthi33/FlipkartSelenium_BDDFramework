package com.flipkart.hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public static WebDriver driver; 
	
	public static void setup(){
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		
	} 
	
	public static void tearDown(){
		if(driver!=null) 
			driver.quit(); 
		}
	
	}