package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContact {
	
	@FindBy(name="firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name="lastname")
	private WebElement lastNameTextField;
	
	@FindBy(name="title")
	private WebElement TitleTextField;
	
	@FindBy(name="department")
	private WebElement departmentTextField;
	
	@FindBy(name="email")
	private WebElement emailTextField;
	
	@FindBy(name="mobile")
	private WebElement mobileTextField;
	
	@FindBy(name="mailingcity")
	private WebElement mailingCityTextField;
	
	@FindBy(name="mailingstate")
	private WebElement mailingStateTextField;
	
	@FindBy(name="mailingcountry")
	private WebElement mailingCountryTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
	
	public CreatingNewContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getTitleTextField() {
		return TitleTextField;
	}

	public WebElement getDepartmentTextField() {
		return departmentTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}

	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}

	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	/**
	 * this is the business library to create new contact
	 * @param fname
	 * @param lname
	 * @param title
	 */
	
	public void CreatingNewContact(String fname, String lname, String title) {
		getFirstNameTextField().sendKeys(fname);
		getLastNameTextField().sendKeys(lname);
		getTitleTextField().sendKeys(title);
		getSavebutton().click();
		
	}
	/**
	 * this is the business library to create new contact
	 * @param lname
	 * @param dept
	 * @param email
	 * @param mobile
	 */
	
	public void CreatingNewContact(String lname, String dept, String email, String mobile) {
		getLastNameTextField().sendKeys(lname);
		getDepartmentTextField().sendKeys(dept);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getSavebutton().click();
		
	}
	/**
	 * this is the business library to create new contact
	 * @param lname
	 * @param title
	 * @param email
	 * @param mailingcity
	 * @param mailingState
	 * @param mailingCountry
	 */
	
	public void CreatingNewContact(String lname, String title, String email,
			String mailingcity, String mailingState, String mailingCountry) {
			getLastNameTextField().sendKeys(lname);
			getTitleTextField().sendKeys(title);
			getEmailTextField().sendKeys(email);
			getMailingCityTextField().sendKeys(mailingcity);
			getMailingStateTextField().sendKeys(mailingState);
			getMailingCountryTextField().sendKeys(mailingCountry);
			getSavebutton().click();
			
	}
}
