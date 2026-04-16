package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * this is an utility class which stores the functionality from selenium
 * @author omkar
 * @version 26-03-26
 */

public class Seleniumutility {
	/**
	 * this is the generic method to access the web application
	 * @param driver
	 * @param URL
	 */
	public void accessApplication(WebDriver driver, String URL) {
		driver.get(URL);
	}
	/**
	 * this method is used to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * this is the generic method to implicit wait
	 * @param driver
	 * @param maxtime
	 */
	public void implicitWait(WebDriver driver,int maxtime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxtime));
	}
	/**
	 * 
	 * @param driver
	 * @param maxTime
	 * @param by
	 */
	public void waitForElementToBeVisible(WebDriver driver, int maxTime,By by) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(maxTime));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	/**
	 * method to scroll webpage
	 * @param driver
	 * @param element
	 */
	public void scrollingOperation(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	/**
	 * this is the generic method to perform mouse hovering action
	 * @param driver
	 * @param element
	 */
	public void mouseHovering(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * this is the generic method to perform double click operation on web element
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * this is the generic method to select an option in dropdown using attribute 
	 * @param dropdownEle
	 * @param value
	 */
	public void selectOptionByValue(WebElement dropdownEle,String value) {
		Select sel=new Select(dropdownEle);
		sel.selectByValue(value);
	
	}
	/**
	 * this is the generic method to select an option in dropdown using visibletext
	 * @param dropdownEle
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement dropdownEle, String visibleText) {
		Select sel=new Select(dropdownEle);
		sel.selectByVisibleText(visibleText);
	}
	/**
	 * this is the generic method to select an option in dropdown using index
	 * @param dropdownEle
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownEle, int index) {
		Select sel=new Select(dropdownEle);
		sel.selectByIndex(index);
	}
	//////////////***********frames*********//////////
	
	/**
	 * this is the generic method to switch the control inside a frame
	 * @param driver
	 * @param frameindex
	 */
	public void swithToFrameUsingIndex(WebDriver driver,int frameindex) {
		driver.switchTo().frame(frameindex);
	}
	/**
	 * this is the generic method to switch the control inside a frame
	 * @param driver
	 * @param NameOrId
	 */
	public void swithToFrameUsingNameOrId(WebDriver driver,String NameOrId) {
		driver.switchTo().frame(NameOrId);
	}
	/**
	 * this is the generic method to swith the control inside a frame
	 * @param driver
	 * @param frameele
	 */
	public void swithToFrameUsingFrameEle(WebDriver driver,WebElement frameele) {
		driver.switchTo().frame(frameele);
	}
	
	////////********Alert*******/////////
	
	/**
	 * to accept the alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	/**
	 * to accept the dismiss popup
	 * @param driver
	 */
	public void dissmisstAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	//////******MultipleWindow****///////////
	
	/**
	 * this is the generic method to switch the window control to other tab
	 * @param driver
	 */
	public void switchToSecondtab(WebDriver driver) {
		String pid=driver.getWindowHandle();
		Set<String> allids=driver.getWindowHandles();
		for (String id : allids) {
			if(!id.equals(pid))
				driver.switchTo().window(id);
			
		}
	}
	
	public void uploadFile(WebElement fileUploadEle, String filePath) {
		fileUploadEle.sendKeys(filePath);
	}
	public String webPageScreenshot(WebDriver driver, String screenshotname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\screenshots\\"+screenshotname+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();
	}
}

	
