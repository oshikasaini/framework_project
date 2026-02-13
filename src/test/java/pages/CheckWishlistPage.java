package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;

public class CheckWishlistPage extends Base{
	public CheckWishlistPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openWishlist() {
		WebElement wishList = driver.findElement(By.xpath("//*[@data-testid='toggle-wishlist']"));
		Actions act=new Actions(driver);
		act.moveToElement(wishList).perform();
		wishList.click();
	}
	
	
			
	public String getFlowerName() {
		WebElement flowerName = driver.findElement(By.xpath("(//h2[contains(text(),Wishlist)])/following-sibling::div/p"));
		return flowerName.getText();
	}
	
}
