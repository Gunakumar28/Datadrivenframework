package org.stepdefn.data.driven;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import base.clas.LibGlobal;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClasForDataDriven extends LibGlobal {
	
	@Before
	public  void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://adactinhotelapp.com/");
	}
	@After
	public  void QuitBrowser(Scenario sc) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
		//driver.manage().deleteAllCookies();
		driver.quit();
		
	}
}
