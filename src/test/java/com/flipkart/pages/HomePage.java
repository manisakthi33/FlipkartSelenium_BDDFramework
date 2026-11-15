package com.flipkart.pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	WebDriver driver; 
	public HomePage(WebDriver driver)
	{this.driver=driver;} 
	
	By closeBtn = By.xpath("//span[text()='X']");
	By homeBtn=By.xpath("//div[text()='Home']");
	By fashionBtn=By.xpath("//div[text()='Fashion']");
	By electronicsBtn=By.xpath("//div[text()='Electronics']");
	By beautyBtn=By.xpath("//div[text()='Beauty']");
	By foodBtn=By.xpath("//div[text()='Food & Health']");
	By furnitureBtn=By.xpath("//div[text()='Furniture']");
	By booksBtn=By.xpath("//div[text()='Books']");
	By promoText=By.xpath("//*[contains(text(),'More chill, less spends')]");
	
	public void open(){
		driver.get("https://www.flipkart.com/");
		}
	

	public void clickHome() throws InterruptedException	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		driver.findElement(homeBtn).click();
		//Thread.sleep(3000);
		}
	
	public void clickfashionBtn() throws InterruptedException	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);		
		driver.findElement(fashionBtn).click();
		}
	
	public void clickelectronicsBtn() throws InterruptedException	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		driver.findElement(electronicsBtn).click();
		}
	
	public void clickbeautyBtn() throws InterruptedException	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		driver.findElement(beautyBtn).click();
		}
	
	public void clickfoodBtn() throws InterruptedException	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		driver.findElement(foodBtn).click();
		}
	
	public void clickbooksBtn() throws InterruptedException	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		driver.findElement(booksBtn).click();
		}
	
	
	
	public void clickfurnitureBtn() throws InterruptedException	{
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		driver.findElement(furnitureBtn).click();
		}
	
	

	public boolean verifyText(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");

		WebElement text = driver.findElement(promoText);
		js.executeScript("arguments[0].scrollIntoView({block:'center'});",  text);
		return text.isDisplayed();
		}
}
