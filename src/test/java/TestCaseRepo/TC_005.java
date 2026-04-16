package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import pomClasses.ContactsPage;
import pomClasses.CreatingNewContact;
import pomClasses.HomePage;

public class TC_005 extends BaseClass {
		@Test(groups = "Smoke")
		public void CON_004() throws EncryptedDocumentException, IOException{
			HomePage hp=new HomePage(driver);
			hp.ClickOnContactsMenu();
			ContactsPage cp=new ContactsPage(driver);
			cp.clickOnCreateNewContact();
			String lName=eutil.getDataFromeXel("Contacts", 4, 1);
			String department=eutil.getDataFromeXel("Contacts", 4, 2);
			String email=eutil.getDataFromeXel("Contacts", 4, 3);
			String mobile=eutil.getDataFromeXel("Contacts", 4, 4);
			CreatingNewContact cncp=new CreatingNewContact(driver);
			cncp.CreatingNewContact(lName, department,email,mobile);
		}

	}


