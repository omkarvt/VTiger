package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * this is the pom class for contacts webpage
 */

public class ContactsPage {
	@FindBy(xpath = "//img[@title='Create Contact...']")
	private WebElement createNewContactIcon;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewContactIcon() {
		return createNewContactIcon;
	}
	/**
	 * this is the business library to click on create new contact
	 */
	public void clickOnCreateNewContact() {
		getCreateNewContactIcon().click();
	}
	
}
