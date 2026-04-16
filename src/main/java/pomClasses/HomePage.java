package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.Seleniumutility;

public class HomePage {
	/**
	 * 
	 */
	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement LeadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement ContactsMenu;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement AccountsIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement Signout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return LeadsMenu;
	}

	public WebElement getContactsMenu() {
		return ContactsMenu;
	}

	public WebElement getAccountsIcon() {
		return AccountsIcon;
	}

	public WebElement getSignout() {
		return Signout;
	}
	
	/**
	 * this is bussiness library to click on leads menu
	 */
	public void ClickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	/**
	 * this is business library to click on contacts menu
	 */
	public void ClickOnContactsMenu() {
		getContactsMenu().click();
	}
	/**
	 * this is business library to click on AccountIcon menu
	 */
	public void ClickOnAccoutIcon() {
		getAccountsIcon().click();
	}
	
	public void signOutOperation(WebDriver driver) {
		Seleniumutility sutil=new Seleniumutility();
		sutil.mouseHovering(driver, getAccountsIcon());
		getSignout().click();
	}
	
}
