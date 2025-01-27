package org.QAfoxproject.Compenents;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Components_MiceAndTrackballs_Test extends BaseConfiguration {

	@Test
	public void addProduct_MiceAndTrackballs() {
		
		HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getComponents_headertext());
		
		webdriverobj.mouseHoverToElement(homeobj.getComponent_MiceAndTrackballs());
		
		javautilityobj.pause(3000);
		Reporter.log("MiceAndBalls Product Added",true);
		
	}
	
		
	}

	
