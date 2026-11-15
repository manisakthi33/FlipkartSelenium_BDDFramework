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
    //TC001
	@When("user clicks home button") 
	public void click() throws InterruptedException{
		page.clickHome();
		}

	@Then("validate more chill less spends text") 
	public void validate(){
		//Assert.assertTrue(page.verifyText());
		Hooks.tearDown();
		}
	
	//TC002
	@When("user clicks Fashion button")
	public void user_clicks_fashion_button() throws InterruptedException {
		page.clickfashionBtn();
		
	}

	@Then("Validate Fashion text")
	public void validate_fashion_text() {
		Hooks.tearDown();
		
	}

	//TC003
	@When("user clicks Electronics button")
	public void user_clicks_electronics_button() throws InterruptedException {
	    page.clickelectronicsBtn();
		
	}

	@Then("Validate Electronics text")
	public void validate_electronics_text() {
		Hooks.tearDown();
		
	}
	
	//TC004
	@When("user clicks beauty button")
	public void user_clicks_beauty_button() throws InterruptedException {
	    page.clickbeautyBtn();
		
	}

	@Then("Validate beauty text")
	public void validate_beauty_text() {
		Hooks.tearDown();
		
	}

	//TC005
	@When("user clicks Food button")
	public void user_clicks_food_button() throws InterruptedException {
	page.clickfoodBtn();
		
	}

	@Then("Validate Food text")
	public void validate_food_text() {
		Hooks.tearDown();
		
	}

	//TC006
	@When("user clicks Furniture button")
	public void user_clicks_furniture_button() throws InterruptedException {
		page.clickfurnitureBtn();
		
	}

	@Then("Validate Furniture text")
	public void validate_furniture_text() {
		Hooks.tearDown();
		
	}
	
	//TC007
	@When("user clicks books button")
	public void user_clicks_books_button() throws InterruptedException {
	 page.clickbooksBtn();
		
	}

	@Then("validate books text")
	public void validate_books_text() {
		Hooks.tearDown();
		
	}



}