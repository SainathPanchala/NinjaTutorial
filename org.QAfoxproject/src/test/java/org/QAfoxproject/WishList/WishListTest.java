package org.QAfoxproject.WishList;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WishListTest extends BaseConfiguration {
	
	@Test
	public void clickWish_List() {
		HomePage homeobj = new HomePage(webdriverobj.driver);

		// Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getWishList_Button());
		homeobj.getWishList_Button().click();

		javautilityobj.pause(3000);
		Reporter.log("clicked_WishList_Button", true);
		
	}

}
