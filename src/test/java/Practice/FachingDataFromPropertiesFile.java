package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FachingDataFromPropertiesFile {
	/**
	 * This is utility class which deals with properties file
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\Properties\\orangehrm.properties");
		Properties prop=new Properties();
		prop.load(file);
		String Url=prop.getProperty("url");
		String Uname=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(Url);                                                   
		System.out.println(Uname);
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Url);
		driver.findElement(By.name("username")).sendKeys(Uname,Keys.TAB,password,Keys.ENTER);
		
		
		
		
	}

}
