package StepDefinition;

import org.junit.Assert;

import org.openqa.selenium.By;


import BaseLayer.BaseClass;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EndToEndStepDef extends BaseClass{
	
	@BeforeStep
	public void abc()  throws InterruptedException{
		Thread.sleep(5000);
	}
	
	
	@Given("User is on Sauce Demo Application")
	public void user_is_on_sauce_demo_application() {
		initialization();
	   
	}


	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
	 
	driver.findElement(By.name("user-name")) .sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	}

	@Then("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.name("login-button")).click();
	    
	}

	@When("User is on Home Page Validate Home Page Title")
	public void user_is_on_home_page_validate_home_page_title() {
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,"Swag Labs");
	}

	@Then("Search Product and Add to the Cart")
	public void search_product_and_add_to_the_cart() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	    
	}

	@Then("Click on cart button")
	public void click_on_cart_button() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	   
	}

	@Then("Click on checkout button")
	public void click_on_checkout_button() {
		driver.findElement(By.id("checkout")).click();

	}

	@When("User enters firstname lastname and zip code")
	public void user_enters_firstname_lastname_and_zip_code() {
		driver.findElement(By.id("first-name")).sendKeys("Priyanka");
		driver.findElement(By.id("last-name")).sendKeys("Kokate");
		driver.findElement(By.id("postal-code")).sendKeys("411055");
	    
	}

	@Then("Click on continue button")
	public void click_on_continue_button() {
		driver.findElement(By.id("continue")).click();
		
	}

	@Then("Click on Finish button")
	public void click_on_finish_button() {
		driver.findElement(By.id("finish")).click();   
	}

}
