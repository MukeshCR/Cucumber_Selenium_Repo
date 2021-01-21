package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pageobjects.loginpage;

public class LoginDemosteps2_pom {
	WebDriver driver =null;
	loginpage login;
	
	@Given("browser is opened")
	public void browser_is_opened() {
		
		System.out.println("i am inside logindemosteps2_pom");
		
		 System.out.println("inside step - browser is opened");
		    
		    String projectpath = System.getProperty("user.dir");
		    System.setProperty("webdriver.gecko.driver", projectpath+"/Drivers/geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
	   
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		
	
	    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		login= new loginpage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
//		driver.findElement(By.xpath(" //input[@id='name']")).sendKeys(username);
//		driver.findElement(By.xpath(" //input[@id='password']")).sendKeys(password);
		
	   }
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		login.clicklogin();
		//driver.findElement(By.xpath(" //button[normalize-space()='Login']")).click();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		login.checklogoutisdisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		
		driver.close();
		driver.quit();
	    
	}

}
