package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.Base;

public class ScreenshotUtil extends Base{
	public static void capture(WebDriver driver) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./screenshot.PNG"));
			
			System.out.println("ss taken********");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
