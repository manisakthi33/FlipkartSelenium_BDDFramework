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
		//page.open();
		
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
	
	
	@When("user clicks Fashion button")
	public void user_clicks_fashion_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Fashion text")
	public void validate_fashion_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Electronics button")
	public void user_clicks_electronics_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Electronics text")
	public void validate_electronics_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks beauty button")
	public void user_clicks_beauty_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate beauty text")
	public void validate_beauty_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Food button")
	public void user_clicks_food_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Food text")
	public void validate_food_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Furniture button")
	public void user_clicks_furniture_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Furniture text")
	public void validate_furniture_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks books button")
	public void user_clicks_books_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("validate books text")
	public void validate_books_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}