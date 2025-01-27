package org.QAfoxproject.Desktops;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Desktops_PC_Test extends BaseConfiguration {
	
	@Test
	public void addProduct_Desktops_PC_Test() {
		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Perform MouseOver Action
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_headertext());
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_pc_Product());
		homeobj.getDesktop_pc_Product().click();
		javautilityobj.pause(3000);
		
		
		Reporter.log("Desktops_PC_Test Product added",true);
	}

}
