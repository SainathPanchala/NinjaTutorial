package org.QAfoxproject.MP3players;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mp3Players_Test18_Test extends BaseConfiguration {
	
	@Test
	public void addProduct_Mp3players_Test_18() {
HomePage homeobj = new HomePage(webdriverobj.driver);
		
		//Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getMp3Players_headertext());
		
		//Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getMp3Player_test_18());
		homeobj.getMp3Player_test_18().click();
		
		javautilityobj.pause(3000);
		Reporter.log("Mp3Players_Test_18_Product_Added",true);
	}

}
