package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Base;

public class ProductPage extends Base{
//search flower --take ip from flower
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchFlower(String name) {
		WebElement searchBox = driver.findElement(By.xpath("//input[@data-testid='search-input']"));
		searchBox.click();
		searchBox.sendKeys(name);
	}
}
