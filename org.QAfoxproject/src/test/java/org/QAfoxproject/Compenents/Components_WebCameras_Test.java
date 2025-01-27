package org.QAfoxproject.Compenents;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Components_WebCameras_Test extends BaseConfiguration {

	@Test
	public void addProduct_WebCameras() {
		HomePage homeobj = new HomePage(webdriverobj.driver);

		// Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getComponents_headertext());

		// Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getComponent_webcameras());
		homeobj.getComponent_webcameras().click();

		javautilityobj.pause(3000);
		Reporter.log("WebCameras_Product_Added", true);
	}

}
