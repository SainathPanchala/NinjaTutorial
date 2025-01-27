package org.QAfoxproject.Compenents;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Components_Scanner_Test extends BaseConfiguration {
	
	@Test
	public void addProduct_Scanners() {
		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getComponents_headertext());
		
		//Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getComponent_Scanners());
		homeobj.getComponent_Scanners().click();
		
		javautilityobj.pause(3000);
		Reporter.log("Scanners_Product_Added",true);
	}

}
