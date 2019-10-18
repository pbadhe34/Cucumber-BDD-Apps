package steps;

import java.util.Scanner;
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

public class Cucumber_Selenium_steps {
	
	WebDriver driver;
	
	static Scanner input;

	@Before  
	public void initWebDriver()
	{
		 System.out.println("Running Cucumber_Selenium_steps initWebDriver ");
		 System.out.println("Running Cucumber_Selenium_steps ");
		 System.setProperty("webdriver.chrome.driver","C:/lib/chromedriver.exe");
		 driver = new ChromeDriver();	
			//driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         input = new Scanner(System.in);

	}
	 
	@After
	public void closeWebDriver()
	{
		 System.out.println("Running Cucumber_Selenium_steps closeWebDriver ");	 
		 driver.close();
		 driver.quit();
		 driver = null;		 
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions 
		
		 System.out.println("Running Cucumber_Selenium_steps user_is_on_Home_Page ");	 
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		//Launch login page
		 driver.get("http://localhost:8090/WebLoginApp/LoginPage.html");		 
	     
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		 
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("uName")).sendKeys("viju"); 

	        // Find the element that's ID attribute is 'pwd' (Password)

	        // Enter Password on the element found by the above desc.

	        driver.findElement(By.id("uPass")).sendKeys("secret");
	        
	       // input.nextLine();      
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
		// input.nextLine();      
		 element.click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("LogOut Successfully");		
	}



}
