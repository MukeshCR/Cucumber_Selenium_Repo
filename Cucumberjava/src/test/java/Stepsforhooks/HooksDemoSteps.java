package Stepsforhooks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	@Before(order = 1)
	public void browsersetup() {
		System.out.println("i am inside browsersetup");
		System.setProperty("webdriver.chrome.driver","C:/Users/mukesh/git/TestProject1/Cucumberjava/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before(order = 0)
	public void setup2() {
		System.out.println("i am inside setup2");
	}
	
	@After
	public void teardown() {
		System.out.println("i am inside teardwon");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public void beforesteps() {
		System.out.println("i am inside beforesteps");
	}
	
	@AfterStep
	public void aftersteps() {
		System.out.println("i am inside after steps");
	}


	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	}

	@When("user enter valid username and passowrd")
	public void user_enter_valid_username_and_passowrd() {
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
	}
	
	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	}




}
