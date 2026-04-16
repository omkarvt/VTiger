package Revision;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertiesfile {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\Properties\\orangehrm.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
		String uname=prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(uname, Keys.TAB,pass,Keys.ENTER);
		
	}

}
