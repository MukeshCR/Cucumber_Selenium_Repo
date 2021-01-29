package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_PF {
	
	@FindBy(xpath = " //input[@id='name']")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement txt_password;
	
	@FindBy(xpath = " //button[normalize-space()='Login']")
	WebElement btn_login;
	
	WebDriver driver;
	
	public Loginpage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
		
	}
	
	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickonlogin() {
		btn_login.click();
	}
	
	

}
