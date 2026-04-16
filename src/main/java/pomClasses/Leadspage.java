package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadspage {
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLeadsIcon;
	
	public Leadspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCreateNewLeadsIcon() {
		return createNewLeadsIcon;
	}
	
	public void clickOnCreateNewLeadsIcon() {
		getCreateNewLeadsIcon().click();
	}

}
