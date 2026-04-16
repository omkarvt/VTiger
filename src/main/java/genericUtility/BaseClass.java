package genericUtility;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import com.beust.jcommander.Parameter;

import pomClasses.HomePage;
import pomClasses.LoginPage;

public class BaseClass {

	public WebDriver driver;
	public static WebDriver sDriver;
	public PropertiesUtility putil= new PropertiesUtility();
	public Seleniumutility sutil = new Seleniumutility();
	public ExelUtility eutil = new ExelUtility();
	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("Creating DB Connection");
	}
	
	
	@BeforeClass(alwaysRun = true)
	public void bcConfig(@Optional("Chrome") String BROWSER) throws IOException {
		if(BROWSER.equals("Chrome"))
		driver = new ChromeDriver();
		else if(BROWSER.equals("edge"))
			driver =new EdgeDriver();
		else if(BROWSER.equals("firefox"))
			driver=new FirefoxDriver();
		else
			driver=new ChromeDriver();
		sDriver=driver; //used for listerners
		
		String URL =putil.getDataFromProperties("url");
		sutil.accessApplication(driver,URL);
		sutil.maximizeWindow(driver);
		sutil.implicitWait(driver, 15);
		System.out.println("Browser Launched Sucessfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException {
		String UN = putil.getDataFromProperties("username");
		String PWD = putil.getDataFromProperties("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToAppliction(UN, PWD);
		System.out.println("Login Done Sucessfully");	
	}
	
	@AfterMethod(alwaysRun = true)
	public void amConfig(){
		HomePage hp = new HomePage(driver);
		hp.signOutOperation(driver);
		System.out.println("Logout Done Sucessfully");
	}
	@AfterClass(alwaysRun = true)
	public void acConfig() {
		driver.quit();
		System.out.println("Browser closed sucessfully");
	}
	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("DB Connection Closed");
	}
}
