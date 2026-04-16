package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.ContactsPage;
import pomClasses.CreatingNewContact;
import pomClasses.HomePage;

public class TC_006 extends BaseClass {
		@Test(groups = "System")
		public void CON_004() throws EncryptedDocumentException, IOException{
			HomePage hp=new HomePage(driver);
			hp.ClickOnContactsMenu();
			ContactsPage cp=new ContactsPage(driver);
			cp.clickOnCreateNewContact();
			String lName=eutil.getDataFromeXel("Contacts", 7, 1);
			String title=eutil.getDataFromeXel("Contacts", 7, 2);
			String email=eutil.getDataFromeXel("Contacts", 7, 3);
			String mailcity=eutil.getDataFromeXel("Contacts", 7, 4);
			String mailstate=eutil.getDataFromeXel("Contacts", 7, 5);
			String mailcountry=eutil.getDataFromeXel("Contacts", 7, 6);
			CreatingNewContact cncp=new CreatingNewContact(driver);
			cncp.CreatingNewContact(lName, title,email,mailcity,mailstate,mailcountry);
		}

	}

