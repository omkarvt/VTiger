package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;
import genericUtility.Seleniumutility;

public class POMpractice {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		PropertiesUtility putil=new PropertiesUtility();
		String URL=putil.getDataFromProperties("url");
		System.out.println(URL);
		String UN=putil.getDataFromProperties("username");
		System.out.println(UN);
		Seleniumutility sutil= new Seleniumutility();
		sutil.maximizeWindow(driver);
		sutil.implicitWait(driver, 15);
		sutil.accessApplication(driver, URL);
		//driver.findElement(By.name("user_name")).sendKeys(UN);
		//driver.navigate().refresh();
		//driver.findElement(By.name("user_name")).sendKeys(UN);
		WebElement User=driver.findElement(By.name("user_name"));
		User.sendKeys(UN);
		driver.navigate().refresh();
		User.sendKeys(UN);
	}

}
