package org.QAfoxproject.CheckOut;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseConfiguration {
	
	@Test
	public void click_CheckOut() {
		HomePage homeobj = new HomePage(webdriverobj.driver);

		// Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getCheckout_Button());
		homeobj.getCheckout_Button().click();

		javautilityobj.pause(3000);
		Reporter.log("clicked_CheckOut_Button", true);
	}

}
