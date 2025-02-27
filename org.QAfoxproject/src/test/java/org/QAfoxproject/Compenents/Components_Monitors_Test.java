package org.QAfoxproject.Compenents;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Components_Monitors_Test extends BaseConfiguration{
	
	@Test
	public void addProduct_Monitors() {
		
		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getComponents_headertext());
		
		//Perform Mouse Hovering Monitors Component
		webdriverobj.mouseHoverToElement(homeobj.getComponent_Monitors());
		
		javautilityobj.pause(3000);
		
		Reporter.log("Monitors Product Added",true);
	}

}
