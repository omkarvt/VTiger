package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.CreatingNewLeadPage;
import pomClasses.HomePage;
import pomClasses.Leadspage;

@Listeners(genericUtility.ListenersImplementation.class) //copy from ListenersImplementation class(qualified name)
public class TC_001 extends BaseClass {
	
	int i=1;
	@Test(groups = {"Regrassion","System"}, retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class) 
	
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.ClickOnLeadsMenu();
		Leadspage lp = new Leadspage(driver);
		lp.clickOnCreateNewLeadsIcon();
		if(i<=3) {
			i++;
		Assert.fail();
		}
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		String fname = eutil.getDataFromeXel("Leads", 1, 1);
		String lname = eutil.getDataFromeXel("Leads", 1, 2);
		String company = eutil.getDataFromeXel("Leads", 1, 3);
		cnlp.createNewLead(fname, lname, company);

	}
}

