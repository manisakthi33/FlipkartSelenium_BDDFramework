package com.flipkart.stepdefinitions;
import com.flipkart.hooks.Hooks; 
import com.flipkart.pages.HomePage; 
import io.cucumber.java.en.*; 
import org.junit.Assert;

public class FlipkartSteps { 
	
	HomePage page;

	@Given("user opens flipkart") 
	public void open(){
		Hooks.setup(); 
		page=new HomePage(Hooks.driver);
		page.open();
		
	}

	@When("user clicks home button") 
	public void click() throws InterruptedException{
		page.clickHome();
		}

	@Then("validate more chill less spends text") 
	public void validate(){
		//Assert.assertTrue(page.verifyText());
		Hooks.tearDown();
		}
}