package Practice;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;
import genericUtility.Seleniumutility;
import pomClasses.CreatingNewLeadPage;
import pomClasses.HomePage;
import pomClasses.Leadspage;
import pomClasses.LoginPage;

public class SignoutOp {
	public static void main(String[] args) throws IOException {
		Seleniumutility sutil=new Seleniumutility();
		PropertiesUtility  putil=new PropertiesUtility();
		String URL=putil.getDataFromProperties("url");
		String UN=putil.getDataFromProperties("username");
		String pass=putil.getDataFromProperties("password");
		
		WebDriver driver= new ChromeDriver();
		sutil.implicitWait(driver, 15);
		sutil.accessApplication(driver, URL);
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToAppliction(UN, pass);
	
		//HomePage hp= new HomePage(driver);
		//hp.signOutOperation(driver);
		HomePage hp= new HomePage(driver);
		hp.ClickOnLeadsMenu();
		
		Leadspage lep=new Leadspage(driver);
		lep.clickOnCreateNewLeadsIcon();
		
		genericUtility.ExelUtility eutil=new genericUtility.ExelUtility();
		String fname=eutil.getDataFromeXel("Leads", 1, 1);
		String lname=eutil.getDataFromeXel("Leads", 1, 2);
		String company=eutil.getDataFromeXel("Leads", 1, 3);
		CreatingNewLeadPage cnlp=new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fname, lname, company);
		hp.signOutOperation(driver);
	
		
		
	}

}
