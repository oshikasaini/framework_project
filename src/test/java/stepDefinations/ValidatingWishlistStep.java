package stepDefinations;


import org.apache.logging.log4j.Logger;



import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckWishlistPage;
import pages.ProductPage;
import pages.WishlistPage;
import utils.ExcelReader;
import utils.ScreenshotUtil;

public class ValidatingWishlistStep extends Base{
	ProductPage product;
	WishlistPage wishlist;
	CheckWishlistPage checkWishlist;
	String flower;
	private static final Logger Logger = LogManager.getLogger(ValidatingWishlistStep.class);
	@Given("user is on search screen")
	public void user_is_on_search_screen() throws Exception{
		try {
			driver.get(this.getUrl());
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    Logger.debug("User is on search screen");
		}catch(Exception e) {
			Logger.fatal("Exception is when: "+e.getMessage());
		}
		
	}
	@When("user searches flower from excel")
	public void user_searches_flower_from_excel()throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		try {
		flower = ExcelReader.getFlowerName(2); 
			//searchBox.click();
		    Thread.sleep(3000);
		    //searchBox.sendKeys("tulip");
		    product = new ProductPage(driver);
		    product.searchFlower(flower);
		    Thread.sleep(3000);
		    Logger.debug("Flower name is enetered in searchbox");
		}catch(Exception e) {
			Logger.fatal("Exception is when: "+e.getMessage());
		}
	    
	}
	@When("user adds flower to wish")
	public void user_adds_flower_to_wish() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		try {
			System.out.println("adding to wishlist");
			Thread.sleep(2000);
			wishlist = new WishlistPage(driver);
			wishlist.addToWishlist();
			Logger.debug("Flower found!");
			Thread.sleep(3000);
			Logger.debug("Flower is wishlisted");
		}catch(Exception e) {
			Logger.fatal("Exception is when: "+e.getMessage());
		}
		
	    
	}
	@Then("flower should be present in wish")
	public void flower_should_be_present_in_wish() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(4000);
			checkWishlist = new CheckWishlistPage(driver);
			checkWishlist.openWishlist();
			Logger.debug("Wishlist is open");
	
		
			Thread.sleep(8000);
			
			String actualFlower = checkWishlist.getFlowerName().toLowerCase();
			
			Assert.assertEquals(actualFlower, flower);
			ScreenshotUtil.capture(driver);
			Logger.debug("Flower successfully verified in wishlist");
		}
		catch(Exception e) {
			Logger.fatal("Exception is when: "+e.getMessage());
		}
		
	}
}
