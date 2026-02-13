package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;

public class WishlistPage extends Base{
	//addTowishlist () 
	public WishlistPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addToWishlist() {
		WebElement wishBtn = driver.findElement(By.xpath("//button[contains(text(),'Wishlist')]"));
		wishBtn.click();
	}

}
