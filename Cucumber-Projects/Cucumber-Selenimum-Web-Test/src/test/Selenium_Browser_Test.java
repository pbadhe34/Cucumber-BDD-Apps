package test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

 

public class Selenium_Browser_Test {
	
		private static WebDriver driver = null;
		
		static Scanner input;
		
		
	public static void main(String[] args) throws InterruptedException {
		
		input = new Scanner(System.in);
		
		//assign browser capabilities for IE for earlier versions		
		/*DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		
		 driver = new InternetExplorerDriver(caps); //depreceated
		
		*/

	
		// Create a new instance of the Server driver specific for browser
        //For Firefox Mozilla driver			
		
		/* System.setProperty("webdriver.gecko.driver","D:\\Cucumber-Java-Training\\Day2\\Selenim Web Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        
		 driver = new FirefoxDriver();*/
		
		
	     //For chrome driver
	    /* System.setProperty("webdriver.chrome.driver","D:\\Cucumber-Java-Training\\Day2\\Selenim Web Drivers\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();*/
		
        //For IE Browser
		System.setProperty("webdriver.ie.driver", "D:/Cucumber-Java-Training/Day2/Selenium-Drivers/IEDriverServer_x64_2.53.1/IEDriverServer.exe");
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		
		options.ignoreZoomSettings();
		options.requireWindowFocus();			
		 
		driver = new  InternetExplorerDriver(options);  
		//In case of slow operations check the driver 32 bit or 64 bit and Advabced--> security  -->Enable enhanced protected mode for the browser  
      
		
        
        //driver = new PhantomJSDriver(); //OLD Invisible browser : NOW NO Support
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Launch the app login page in browser

        driver.get("http://localhost:8090/WebLoginApp/LoginPage.html");
        Thread.sleep(2000);
        
        System.out.println("Check the page in browser and hit Enter key..: ");          
    	String s = input.nextLine();      
        
    	
    	System.out.println("The element locating");        

        

        // Find the element that's ID attribute is 'log' (Username)

        // Enter Username on the element found by above desc.
    	
    	WebElement  elem1 = driver.findElement(By.id("uName"));
    	
    	 System.out.println("The element found is : "+elem1.getText());        

        //driver.findElement(By.id("uName")).sendKeys("viju"); 
    	 
    	 elem1.sendKeys("viju");
    	 System.out.println("The element locating...");     

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

       // driver.findElement(By.id("uPass")).sendKeys("secret");
    	 
    	 elem1 = driver.findElement(By.id("uPass"));
        
        
        System.out.println("The element found is : "+elem1.getText());       
    	 
    	 elem1.sendKeys("secret");
    	 
    	 System.out.println("The element locating....");     
    	 
    	 elem1 = driver.findElement(By.id("remem"));
    	      
         
         System.out.println("The element found is : "+elem1.getText()); 
         elem1.sendKeys("ssdd");   
        
        Thread.sleep(2000);
        System.out.println("View the user login details in browser and hit Enter key..: ");          
        input.nextLine();
        
        System.out.println("The login elemenbt  locating");     
        // Now submit the form. WebDriver will find the form for us from the element 

       // driver.findElement(By.id("login")).click();
        
        elem1 = driver.findElement(By.id("login"));
        System.out.println("View the user login details in browser and hit Enter key..: ");          
        elem1.click();

        // Print a Log In message to the screen

        System.out.println("Login Successfully");
        Thread.sleep(3000);
        
        System.out.println("Do some watch and hit Enter key to logout");       
        input.nextLine();
        

        // Find the element that's ID attribute is 'account_logout' (Log Out)

        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();

        // Print a Log In message to the screen

        System.out.println("LogOut Successfully");

        // Close the driver

        driver.quit();

	}

}