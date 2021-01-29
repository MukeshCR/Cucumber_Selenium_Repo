package Stepdefinitions;

import io.cucumber.java.en.*;

public class loginsteps {



	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside step -user is on login page");
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		System.out.println("inside step -user entered valid username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside step -user is on clicked on login");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	   System.out.println("inside step-user is navigated to home page");
	}

}
