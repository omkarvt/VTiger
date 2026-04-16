package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {

	@FindBy(name ="firstname" )
	private WebElement firstNameTextField1;
	
	@FindBy(name ="lastname" )
	private WebElement lastNameTextField;
	
	@FindBy(name ="company" )
	private WebElement CompanyNameTextField;
	
	@FindBy(id ="designation" )
	private WebElement TitleTextField;
	
	@FindBy(name ="leadsource" )
	private WebElement leadsSourceDropDown;
	
	@FindBy(name ="noofemployees" )
	private WebElement noOfEmpTextField;
	
	@FindBy(name ="mobile" )
	private WebElement MobTextField;
	
	@FindBy(name ="email" )
	private WebElement EmailTextField;
	
	@FindBy(name ="city" )
	private WebElement CityTextField;
	
	@FindBy(name ="state" )
	private WebElement StateTextField;
	
	@FindBy(name ="country" )
	private WebElement CountryTextField;
	
	@FindBy(xpath  ="//input[@title='Save [Alt+S]']" )
	private WebElement SaveButton;
	
	
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField1() {
		return firstNameTextField1;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyNameTextField() {
		return CompanyNameTextField;
	}

	public WebElement getTitleTextField() {
		return TitleTextField;
	}

	public WebElement getLeadsSourceDropDown() {
		return leadsSourceDropDown;
	}

	public WebElement getNoOfEmpTextField() {
		return noOfEmpTextField;
	}

	public WebElement getMobTextField() {
		return MobTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getCityTextField() {
		return CityTextField;
	}

	public WebElement getStateTextField() {
		return StateTextField;
	}

	public WebElement getCountryTextField() {
		return CountryTextField;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	/**
	 * this is the bussiness library to create new lead
	 * @param fname
	 * @param lName
	 * @param Company
	 */
	
	public void createNewLead(String fname, String lName, String Company) {
		getFirstNameTextField1().sendKeys(lName);
		getLastNameTextField().sendKeys(lName);
		getCompanyNameTextField().sendKeys(Company);
		getSaveButton().click();
		
	}
	
	public void createNewLead(String lName, String Company, String Title, String Leadsource, String NoofEmp) {
		getLastNameTextField().sendKeys(lName);
		getCompanyNameTextField().sendKeys(Company);
		getTitleTextField().sendKeys(Title);
		getLeadsSourceDropDown().sendKeys(Leadsource);
		getNoOfEmpTextField().sendKeys(NoofEmp);
		getSaveButton().click();
	}
	
	public void createNewLead(String lname, String company, String mob, String email, String city, String state, String country) {
		getLastNameTextField().sendKeys(lname);
		getCompanyNameTextField().sendKeys(company);
		getMobTextField().sendKeys(mob);
		getEmailTextField().sendKeys(email);
		getCityTextField().sendKeys(city);
		getStateTextField().sendKeys(state);
		getCountryTextField().sendKeys(country);
		getSaveButton().click();
	}
	
	

}
