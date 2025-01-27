package org.QAfoxprojectGenericUtility;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This Class contains reusable methods to perform driver related operations
 * 
 * @author sai
 */

public class WebDriverLibrary {
	public WebDriver driver;
	public static WebDriver static_driver;
	public Actions action;
	public Select select;

	/**
	 * This Method launches specified browser
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver LunchBrowser(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			static_driver = driver;
			break;
		case "firefox":
			driver = new FirefoxDriver();
			static_driver = driver;
			break;
		case "edge":
			driver = new EdgeDriver();
			static_driver = driver;
			break;
		default:
			System.out.println("invalid browser info");
		}
		return driver;
	}

	/**
	 * this method maximize the browser
	 */
	public void maximizeBrowser() {
		driver.manage().window().maximize();

	}

	/**
	 * this method is used to navigate to the Application
	 * 
	 * @param url
	 */
	public void navigateToApp(String url) {
		driver.get(url);
	}

	/**
	 * This Method is used to Close the Browser
	 */
	public void closeTheBrowser() {
		driver.close();
	}

	/**
	 * This Method is used to Close All the Browser window/tab
	 */
	public void closeAllBrowsers() {
		driver.quit();
	}

	/**
	 * This Method is used to wait the statement until element will found
	 */
	public void waituntilElementFound() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PathConstant.DURATION));
		
	}
	/**
	 * This Method waits element or elements is found
	 * @param element
	 */
	public void waituntilElementFound(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(PathConstant.DURATION));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This Method is Used to mouse hover on an element
	 * @param element
	 */
	public void mouseHoverToElement(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	/**
	 * This Method is Used to double click on an element
	 * 
	 */
	public void doubleClickOnElement(WebElement element) {
		action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	/**
	 * This Method is used to right Click on an element
	 */
	public void rightClickOnElement(WebElement element) {
		action = new Actions(driver);
		action.contextClick(element).perform();
	}
	/**
	 * This Method is Used to drag and drop an element 
	 */
	public void dragAndDropElement(WebElement source,WebElement target) {
		action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
	}
	/**
	 * This Method is used to select an element from drop down based on index
	 * @param element
	 * @param index
	 */
	public void selectFromDropDown(WebElement element,int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
	/**
	 * This Method is used to select an element from dropdown based on value
	 * @param element
	 * @param value
	 */
	public void selectFromDropDown(WebElement element,String value) {
		select = new Select(element);
		select.selectByValue(value);
	}
	/**
	 * This Method is used to select an element from dropdown on visibletext
	 */
	public void selectFromDropDown(String visibletext,WebElement element) {
		select = new Select(element);
		select.selectByVisibleText(visibletext);
	}
	/**
	 * This Method is used to switch to frame based on index
	 * @param index
	 */
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * This Method is used to switch to frame based on id or name attribute value
	 */
	public void switchToFrame(String idOrName) {
		driver.switchTo().frame(idOrName);
	}
	/**
	 * This Method is used to switch to Frame based on frame element
	 */
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * This Method is used to switch Back to default window
	 * 
	 */
	public void switchToFrame() {
		driver.switchTo().defaultContent();
	}
	/**
	 * This Method is used to switch back to Parent window
	 */
	public void switchToParentFrame() {
		driver.switchTo().parentFrame();
		
	}
	/**
	 * This Method handle alert pop up
	 * @param status
	 */
	public void handleAlert(String status) {
		Alert al = driver.switchTo().alert();
		if(status.equalsIgnoreCase("ok"))
			al.accept();
		else
			al.dismiss();
	}
	/**
	 * This Method coverts dynamic xpath to WebElement
	 * 
	 */
	public WebElement convertDynamicXpathToWebElement(String commonPath,String replaceData) {
		String requiredPath = String.format(commonPath, replaceData);
		return driver.findElement(By.xpath(requiredPath));
		
	}
	
	 
}
