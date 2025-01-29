package org.QAfoxproject.Desktops;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.Cart_Page;
import org.QAfoxprojectPageRepository.Desktop_MacPage;
import org.QAfoxprojectPageRepository.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class Desktops_Mac_Test extends BaseConfiguration {
	@Test
	public void addProduct_Desktops_Mac_Test() {
		
		// Create The test Information
	   test = report.createTest("Verify-AddProduct_Desktops_Mac");
		
		HomePage homeobj = new HomePage(webdriverobj.driver);
		webdriverobj.waituntilElementFound();
		//Perform Mouse HoverAction----->Desktop
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_headertext());
		test.log(Status.PASS, "Step 1:Perform Mouse HoverAction-Desktop");
		//Perform Mouse HoverAction----->Mac
		webdriverobj.mouseHoverToElement(homeobj.getDesktop_Mac_Product());
	     test.log(Status.PASS, "Step 2.1:Perform Mouse HoverAction-Mac");
		homeobj.getDesktop_Mac_Product().click();
		test.log(Status.PASS, "Step 2.2:Perform Click Action");
		
		homeobj.getiMac().click();
		Reporter.log("Imac Product Clicked",true);
		
		homeobj.getMacAddtoCart().click();
		Reporter.log("Mac product Added",true);
		
		
	}
}
		/**
		test.log(Status.INFO,"Desktop_Mac_Product_Added Successful");
		
		Desktop_MacPage macObj = new Desktop_MacPage(webdriverobj.driver);
		Cart_Page cartObj=new Cart_Page(webdriverobj.driver);
		macObj.getImac().click();
		javautilityobj.pause(5000);

		String productTitle = macObj.getProduct_Title().getText();
		Reporter.log(productTitle, true);
		javautilityobj.pause(5000);

		String productBrand = macObj.getProduct_Brand().getText();
		Reporter.log(productBrand, true);
		javautilityobj.pause(5000);

		String productCode = macObj.getProduct_Code().getText();
		Reporter.log(productCode, true);
		javautilityobj.pause(5000);

		String productAvailability = macObj.getProduct_Availability().getText();
		Reporter.log(productAvailability, true);
		javautilityobj.pause(5000);

		String productActualPrice = macObj.getProduct_ActualPrice().getText();
		Reporter.log(productActualPrice, true);
		javautilityobj.pause(5000);

		String productDiscountPrice = macObj.getProduct_DiscountPrice().getText();
		Reporter.log(productDiscountPrice, true);
		javautilityobj.pause(5000);

		macObj.getProduct_Qty().sendKeys("5");
		Reporter.log("QTY is entered sucessfully",true);
		javautilityobj.pause(5000);

		macObj.getProduct_AddToCart().click();
		Reporter.log("add cart button click sucessfully ",true);
		javautilityobj.pause(5000);

		String productHeadingMessage = macObj.getProduct_heading_message().getText();
		Reporter.log(productHeadingMessage, true);
		javautilityobj.pause(5000);

		String productDescription = macObj.getProduct_Description().getText();
		Reporter.log(productDescription, true);
		javautilityobj.pause(5000);

		cartObj.getProduct_Cart().click();
		Reporter.log("shopping cart button click sucessfull", true);
		javautilityobj.pause(5000);

		cartObj.getView_Cart().click();
		Reporter.log("view cart button click sucessfull");
		javautilityobj.pause(5000);

		macObj.getProduct_CheckOut().click();
		Reporter.log("check out button click sucessfull");
		javautilityobj.pause(5000);

		productHeadingMessage = macObj.getProduct_heading_message().getText();
		Reporter.log(productHeadingMessage, true);
		javautilityobj.pause(5000);
		
	}
	**/


