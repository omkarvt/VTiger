package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.ContactsPage;
import pomClasses.CreatingNewContact;
import pomClasses.HomePage;

public class TC_004 extends BaseClass{
	@Test(groups = {"Smoke","System"})
	public void CON_004() throws EncryptedDocumentException, IOException{
		HomePage hp=new HomePage(driver);
		hp.ClickOnContactsMenu();
		ContactsPage cp=new ContactsPage(driver);
		cp.clickOnCreateNewContact();
		String fname=eutil.getDataFromeXel("Contacts", 1, 1);
		String lName=eutil.getDataFromeXel("Contacts", 1, 2);
		String title=eutil.getDataFromeXel("Contacts", 1, 3);
		CreatingNewContact cncp=new CreatingNewContact(driver);
		cncp.CreatingNewContact(fname, lName, title);
	}


}
