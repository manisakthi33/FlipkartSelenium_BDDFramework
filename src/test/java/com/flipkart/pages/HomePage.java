package com.flipkart.pages;
import org.openqa.selenium.*;

public class HomePage {
	
	WebDriver driver; 
	public HomePage(WebDriver driver)
	{this.driver=driver;} 
	
	By homeBtn=By.xpath("//div[text()='Home']");
	By promoText=By.xpath("//*[contains(text(),'More chill, less spends')]");
	
	public void open(){
		driver.get("https://www.flipkart.com/");
		}
	

	public void clickHome() throws InterruptedException	{
		Thread.sleep(5000);
		driver.findElement(homeBtn).click();
		}

	public boolean verifyText(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");

		WebElement text = driver.findElement(promoText);
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",  text);
		return text.isDisplayed();
		}
}
