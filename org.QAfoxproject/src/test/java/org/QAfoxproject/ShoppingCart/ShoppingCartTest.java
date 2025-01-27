package org.QAfoxproject.ShoppingCart;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseConfiguration {
	@Test
	public void clickShoppingcart() {
		HomePage homeobj = new HomePage(webdriverobj.driver);

		// Perform Mouse Hovering Action
		webdriverobj.mouseHoverToElement(homeobj.getShopping_cartButton());
		homeobj.getShopping_cartButton().click();

		javautilityobj.pause(3000);
		Reporter.log("clicked_Shopping_cart", true);

	}

}
