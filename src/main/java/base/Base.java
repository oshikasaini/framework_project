package base;

import java.util.Properties;
import java.io.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public String getUrl() throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\Oshika.Saini\\eclipse-workspace\\project\\src\\main\\java\\utils\\config.properties"));
		return prop.getProperty("url");
	}

}
