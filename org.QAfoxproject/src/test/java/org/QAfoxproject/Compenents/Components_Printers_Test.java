package org.QAfoxproject.Compenents;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Components_Printers_Test extends BaseConfiguration{
	
	@Test
	public void addProduct_Printers() {
		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		
		//Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getComponents_headertext());
		
		//Perform mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getComponent_Printers()); 
		
		javautilityobj.pause(3000);
		
		Reporter.log("Printers_Product_added",true);
	}
	

}
