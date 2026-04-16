package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.CreatingNewLeadPage;
import pomClasses.HomePage;
import pomClasses.Leadspage;

public class TC_003 extends BaseClass{
	@Test(groups = "Regrassionn")
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.ClickOnLeadsMenu();
		Leadspage lp = new Leadspage(driver);
		lp.clickOnCreateNewLeadsIcon();
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		String lname = eutil.getDataFromeXel("Leads", 7, 1);
		String company = eutil.getDataFromeXel("Leads", 7, 2);
		String mobile = eutil.getDataFromeXel("Leads", 7, 3);
		String email = eutil.getDataFromeXel("Leads", 7, 4);
		String city = eutil.getDataFromeXel("Leads", 7, 5);
		String state = eutil.getDataFromeXel("Leads", 7, 6);
		String country = eutil.getDataFromeXel("Leads", 7, 7);
		cnlp.createNewLead(lname, company,mobile,email,city,state,country);

	}
}


