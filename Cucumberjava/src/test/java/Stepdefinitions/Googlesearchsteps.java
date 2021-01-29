package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Googlesearchsteps {
	
	WebDriver driver = null;
	
	@Given("browser is opened")
	public void browser_is_opened() {
		
	    System.out.println("inside step - browser is opened");
	    
	    String projectpath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectpath+"/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("inside step - user is on google page");
		
		driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("inside step - user enters text in searchbox");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("inside step - user clicked on search");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("inside step - user is navigated to the search results");
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
	}

}
