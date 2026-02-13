package hooks;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ScenarioHook extends Base{
	@Before
	public void setup() {
		
	driver = new ChromeDriver();
	System.out.println("hooks invoked");
}

	@After
	public void tearDown(Scenario scenario) {
		driver.quit();
	}
}
