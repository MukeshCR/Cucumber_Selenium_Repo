package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF {
	@FindBy(id="logout")
	WebElement btn_logout;
	
	
WebDriver driver;
	
	public Homepage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,Loginpage_PF.class );
	
	}
	public void checklogoutisDisplayed() {
		btn_logout.isDisplayed();
		
	}
}
