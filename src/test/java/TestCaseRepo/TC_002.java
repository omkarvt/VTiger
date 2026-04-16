package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.CreatingNewLeadPage;
import pomClasses.HomePage;
import pomClasses.Leadspage;

public class TC_002 extends BaseClass{
	
	@Test (groups = "Smoke")
	public void LE_002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.ClickOnLeadsMenu();
		Leadspage lp = new Leadspage(driver);
		lp.clickOnCreateNewLeadsIcon();
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		String lname = eutil.getDataFromeXel("Leads", 4, 1);
		String company = eutil.getDataFromeXel("Leads", 4, 2);
		String title = eutil.getDataFromeXel("Leads", 4, 3);
		String leadsource = eutil.getDataFromeXel("Leads", 4, 4);
		String noofemp = eutil.getDataFromeXel("Leads", 4, 5);
		cnlp.createNewLead(lname, company,title,leadsource,noofemp);

	}
}

