package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="user_name") 
	WebElement usernameTF;
	
	@FindBy(name = "user_password")
	WebElement passTF;
	
	@FindBy(id = "submitButton") 
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPassTF() {
		return passTF;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginToAppliction(String UN,String PSW) {
		getUsernameTF().sendKeys(UN);
		getPassTF().sendKeys(PSW);
		getLoginButton().click();
	}
}
