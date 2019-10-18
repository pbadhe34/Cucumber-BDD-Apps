package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import junit.framework.Assert;
 

public class TestIEBrowser {
	
	static String driverPath = "D:/Cucumber-Java-Training/Day2/Selenium-Drivers/IEDriverServer_x64_2.53.1/";
	public WebDriver driver;
	
	@Before
	public void setUp() {
		System.out.println("*******************");
		System.out.println("launching IE browser");
		System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		
		InternetExplorerOptions options = new InternetExplorerOptions()
				   .requireWindowFocus().ignoreZoomSettings();

		
		driver = new  InternetExplorerDriver(options);
		driver.manage().window().maximize();
	}
	
	@Test
	public void testGooglePageTitleInIEBrowser() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		Assert.assertTrue("Page title doesn't match",strPageTitle.equalsIgnoreCase("Google"));
	}

	@After 
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing IE browser");
			driver.quit();
		}
	}
}