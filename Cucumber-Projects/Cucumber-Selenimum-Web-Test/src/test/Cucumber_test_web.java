package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber_test_web {
	
	WebDriver driver;	
	
	@Before  
	public void initWebDriver()
	{
		 System.out.println("Running Cucumber_test_web initWebDriver ");
		 System.out.println("Running Cucumber_test_web");
		// System.setProperty("webdriver.chrome.driver","D:\\Cucumber-Java-Training\\Day2\\Selenim Web Drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();	
		//driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          
	}
	 
	@After
	public void closeWebDriver()
	{
		 System.out.println("Running Cucumber_test_web closeWebDriver ");	 
		 driver.close();
		 driver.quit();
		 driver = null;		 
	}
	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		 
		 
        driver.get("http://www.store.demoqa.com");
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	     
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		 
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("log")).sendKeys("pbadhe34"); 

	        // Find the element that's ID attribute is 'pwd' (Password)

	        // Enter Password on the element found by the above desc.

	        driver.findElement(By.id("pwd")).sendKeys("MyBizPass123");
	        
	       driver.findElement(By.id("login")).click();
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successfully");
	}
 
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		 
		 System.out.println("The driver is  "+driver);
		 WebElement element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
		 System.out.println("The element to be clicked is  "+element);
		 element.click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("LogOut Successfully");		 
	}



}
