package org.QAfoxprojectGenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * This Class Provides the Reusable  Method To Perform javaScript Related Actions
 */

public class JavaScriptLibrary {

	
	public JavascriptExecutor javascriptobj;
	
	/**
	 * This Method Used To Enter The Data in Disabled  TextFiled Element
	 * @param element
	 * @param Data
	 */
	
	public void enterData_DisabledElement(WebElement element,String data) {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].value="+data+"", element);
	}
	/**
	 * This Method used to perform Click on Disable Element
	 * @param element
	 */
	
	public void click_DisabledElement(WebElement element) {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].click()", element);
	}
	/**
	 * This Method Used To Scroll On WebPage
	 */
	public void defaultVerticalScrollBy() {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}
	/**
	 * This Method Used To Scroll on WebPage
	 */
	public void defaultVerticalScrollTo() {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("window.scrollTo(1000,1000");
		
	}
	/**
	 * This Method Used To Scroll until the Element visible
	 */
	public void scrollUsingView(WebElement element,boolean value) {
		javascriptobj = (JavascriptExecutor)WebDriverLibrary.static_driver;
		javascriptobj.executeScript("arguments[0].scrollIntoView("+value+");",element);
	}
}
