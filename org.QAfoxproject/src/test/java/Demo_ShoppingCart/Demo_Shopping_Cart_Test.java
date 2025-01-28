package Demo_ShoppingCart;


import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectPageRepository.Shopping_Cart_Module;
import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.Status;
public class Demo_Shopping_Cart_Test extends BaseConfiguration {

	@Test
	public void addQuantity() {
		//Create a Information
	//	test = report.createTest("Verify-Shopping Cart");
		// Create a Object For HomePage
		Shopping_Cart_Module sc = new Shopping_Cart_Module(webdriverobj.driver);
          webdriverobj.waituntilElementFound();
		// Click on ShoppingCart
		sc.getShoppingCartModule().click();
	//	test.log(Status.PASS, "Step 1:Perform Click Action----Shopping Cart Module Clicked");
		boolean result = sc.getShoppingCartModule().isDisplayed();
		if(result) {
			System.out.println("Shopping Cart Module is Displayed");
		}
		else {
			System.out.println("Shopping Cart Module Not Displayed ");
		}
		boolean result1 = sc.getShoppingCartModule().isEnabled();
		if(result1) {
			System.out.println("Shopping Cart is Enabled");
		}
		else {
			System.out.println("Shopping Cart is Not Enabled");
		//	test.log(Status.PASS, "Step 1.1:Perform  Verify");
			
		}
		// Fetch the Text
		sc.getAlertPopup().getText();
		String exp ="Products marked with *** are not available in the desired quantity or not in stock!";
		String act ="Products marked with *** are not available in the desired quantity or not in stock!";
		if(exp.equals(act))
			System.out.println("Test----Pass");
		else {
			System.out.println("Test----Fail");
		}
		Assert.assertEquals(exp, act);
		//test.log(Status.PASS, "Step 1.2:Alert PopUp is Same");
		// Fetch The Weight
		sc.getShoppingCartWeight().getText();
		String exp1 ="Shopping Cart  (5.00kg)";
		String act1 ="Shopping Cart  (5.00kg)";
		
		if(exp1.equals(act1))
			System.out.println("Test1----Passs");
		else {
			System.out.println("Test1----Fail");
		}
		Assert.assertEquals(exp1, act1);
	//	test.log(Status.PASS, "Step 1.3:Shopping Cart weigt is Same");
		// Click on Quantity
		sc.getQuantity().click();
	//	test.log(Status.PASS, "Step 1.4:Perform Click action-Quantity");
		boolean result2 = sc.getQuantity().isEnabled();
		if(result2) {
			System.out.println("Quantity is Enabled");
		}
		else {
			System.out.println("Quantity is Not Enabled");
		}
		boolean result3 = sc.getQuantity().isDisplayed();
		if(result3) {
			System.out.println("Quantity is Displayed");
		}
		else {
			System.out.println("Quantity is Not Displayed");
		}
		
		//Clear Quantity
		sc.getQuantity().clear();
		
		//Enter Quantity
		sc.getQuantity().sendKeys("1");
		
		// Click On Update
		sc.getUpdateQuantity().click();
	//	test.log(Status.PASS, "Step 2:Perform Click Action----Update");
		boolean result4 = sc.getUpdateQuantity().isDisplayed();
		if(result4) {
			System.out.println("UpdatedQuantity is Displayed");
		}
		else {
			System.out.println("UpdatedQuantity is Not Displayed");
		}
		// Fetch the Text From UpdateQuantity Text
		sc.getSuccessfullModifiedtText().getText();
		String exp2 = "Success: You have modified your shopping cart!";
		String act2 ="Success: You have modified your shopping cart!";
		if(exp2.equals(act2))
			System.out.println("Test2 ----Passs");
		else {
			System.out.println("Test2----Fail");
		}
		// Click on UseCouponCode
		sc.getUSECouponCode().click();
	//	test.log(Status.PASS, "Step 2.1:Perform Click Action----UseCouponCode");
		boolean result5 = sc.getUSECouponCode().isDisplayed();
		if(result5) {
			System.out.println("Use Coupon Code Is Displayed");
		}
		else {
			System.out.println("Use Coupon Code is Not Displayed");
		}
		// Enter Coupon
		sc.getEnterYourCouponCode().sendKeys("8u8u8u8u8u");
		// Click the ApplyCoupon
		sc.getApplyCoupon().click();
	//	test.log(Status.PASS, "Step 2.1:Perform Click Action-----ApplyCoupon");
		boolean result6 = sc.getApplyCoupon().isDisplayed();
		if(result6) {
			System.out.println("Apply Coupon is Displayed");
		}
		else {
			System.out.println("Apply Coupon is Not Displayed");
		}
		boolean result7 = sc.getApplyCoupon().isEnabled();
		if(result7) {
			System.out.println("Apply Coupon is Enabled");
		}
		else {
			System.out.println("Apply Coupon is Not Enabled");
		}
			
		// Fetch the Coupon Text
		sc.getWarningTextCoupon().getText();
		String exp3 =" Warning: Coupon is either invalid, expired or reached its usage limit!";
		String act3 = " Warning: Coupon is either invalid, expired or reached its usage limit!";
		if(exp3.equals(act3))
			System.out.println("Test3 ------Pass");
		else {
			System.out.println("Test3--------Fail");
		}
		Assert.assertEquals(exp3, act3);

		// Click on EstimateshippingTaxes
		sc.getEstimateshippingTaxes().click();
	//	test.log(Status.PASS, "Step 2.2:Perform Click Action-----EstimateshippingTaxes");
		boolean result8 = sc.getEstimateshippingTaxes().isDisplayed();
		if(result8) {
			System.out.println("EstimateShipping&Taxes is Displayed");
		}
		else {
			System.out.println("EstimateShipping&Taxes is Not Displayed");
		}
		// Click on Country
		sc.getCountry().click();
	//	test.log(Status.PASS, "Step 2.3:Perform Click Action -----Country");
		boolean result9 = sc.getCountry().isDisplayed();
		if(result9) {
			System.out.println("Country is Displayed");
		}
		else {
			System.out.println("Country is Not Displayed");
		}
		boolean result10 = sc.getCountry().isEnabled();
		if(result10) {
			System.out.println("Country is Enabled");
		}
		else {
			System.out.println("Country is Not Enabled");
		}
		// Select On Country
		webdriverobj.selectFromDropDown(sc.getCountry(),"99");
		
		Boolean result11 =sc.getCountry().isDisplayed();
		if(result11) {
			System.out.println("Select Country is Displayed");
		}
		else {
			System.out.println("Select Country is Not Displayed");
		}
		boolean result12 = sc.getCountry().isEnabled();
		if(result12) {
			System.out.println("Select Country is Enabled");
		}
		else {
			System.out.println("Select Country is Not Enabled");
		}
		
		
		// Click on State
		sc.getState().click();
		boolean result13 = sc.getState().isDisplayed();
		if(result13) {
			System.out.println("State is Displayed");
		}
		else {
			System.out.println("State is Not Displayed");
		}
		boolean result14 = sc.getState().isEnabled();
		if(result14) {
			System.out.println("State is Enabled");
		}
		else {
			System.out.println("State is Not Enabled");
		}
		
		// Select on State
		webdriverobj.selectFromDropDown("Telangana", sc.getState());
		boolean result15 = sc.getState().isDisplayed();
		if(result15) {
			System.out.println("Select State is Displayed");
		}
		else {
			System.out.println("Select State is Not Displayed");
		}
		boolean result16 = sc.getState().isEnabled();
		if(result16) {
			System.out.println("Select State is Enabled");
		}
		else {
			System.out.println("Select State is Not Enabled");
		}
		
		//Click PostCode TextFiled
		sc.getPostcode().click();
		boolean result17 = sc.getPostcode().isDisplayed();
		if(result17) {
			System.out.println("PostCode is Displayed");
		}
		else {
			System.out.println("PostCode is Not Displayed");
		}
		boolean result18 = sc.getPostcode().isEnabled();
		if(result18) {
			System.out.println("PostCode is Enabled");
		}
		else {
			System.out.println("PostCode is Not Enabled");
		}
		
		// Enter PostCode
		sc.getPostcode().sendKeys("78787");

		// Click GetQuots
		sc.getGetquote().click();
		boolean result19 = sc.getGetquote().isDisplayed();
		if(result19) {
			System.out.println("GetQuote is Displayed");
		}
		else {
			System.out.println("GetQuote is Not Displayed");
		}
		boolean result20 = sc.getGetquote().isEnabled();
		if(result20) {
			System.out.println("GetQuote is Enabled");
		}
		else {
			System.out.println("GetQuote is Not Enabled");
		}

		// Click On Flat Rate RadioButton
		sc.getQuoteRadioButton().click();
		boolean result21 = sc.getQuoteRadioButton().isDisplayed();
		if(result21) {
			System.out.println("RadioButton is Displayed");
		}
		else {
			System.out.println("RadioButton is Not Displayed");
		}
		boolean result22 = sc.getQuoteRadioButton().isEnabled();
		if(result22) {
			System.out.println("RadioButton is Enabled");
		}
		else {
			System.out.println("RadioButton is Not Enabled");
		}

		// Click on Apply Shopping
		sc.getApplyShopping().click();
		boolean result23 = sc.getApplyShopping().isDisplayed();
		if(result23) {
			System.out.println("ApplyShopping is Displayed");
		}
		else {
			System.out.println("ApplyShopping is Not Displayed");
		}
		boolean result24 = sc.getApplyShopping().isEnabled();
		if(result24) {
			System.out.println("ApplyShopping is Enabled");
		}
		else {
			System.out.println("ApplyShopping is Not Enabled");
		}
		

		// Fetch The Text From ApplyShopping
		sc.getSuccesfulEstimate().getText();
		String exp4 = "Success: Your shipping estimate has been applied!";
		String act4 ="Success: Your shipping estimate has been applied!";
		if (exp4.equals(act4))
			System.out.println("Test4------Passs");
		else {
			System.out.println("Test4-----Fail");
			
		}
		Assert.assertEquals(exp4, act4);

		// Click on Use Gift Certificate
		sc.getUseGiftCertificate().click();
		boolean result25 = sc.getUseGiftCertificate().isDisplayed();
		if(result25) {
			System.out.println("UseGiftCertificate is Displayed");
		}
		else {
			System.out.println("UseGiftCertificate is Not Displayed");
		}
		boolean result26 = sc.getUseGiftCertificate().isEnabled();
		if(result26) {
			System.out.println("UseGiftCertificate is Enabled");
		}
		else {
			System.out.println("UseGiftCertificate is Not Enabled");
		}

		// Enter GiftCode
		sc.getEnterGiftCertificate().sendKeys("8u8u8u8");

		// Click on ApplyGiftCertificate
		sc.getApplyGiftCertificate().click();
		boolean result27 = sc.getApplyGiftCertificate().isDisplayed();
		if(result27) {
			System.out.println("ApplyGiftCertificate is Displayed");
		}
		else {
			System.out.println("ApplyGiftCertificate is Not Displayed");
		}
		boolean result28 = sc.getUseGiftCertificate().isEnabled();
		if(result28) {
			System.out.println("UseGiftCertificate is Enabled");
		}
		else {
			System.out.println("UseGiftCertificate is Not Enabled");
		}
		
		// Fetch The Text From Gift
		sc.getWarning().getText();
		String exp5 = " Warning: Gift Certificate is either invalid or the balance has been used up!";
		String act5 = " Warning: Gift Certificate is either invalid or the balance has been used up!";
		if(exp5.equals(act5))
			System.out.println("Test5=====Pass");
		else {
			System.out.println("Test5=====Fail");
		}

		// Click On CheckOut
		sc.getCheckoutButton().click();
		boolean result29 = sc.getCheckoutButton().isDisplayed();
		if(result29) {
			System.out.println("CheckoutButton is Displayed");
		}
		else {
			System.out.println("CheckoutButton is Not Displayed");
		}
		boolean result30 = sc.getCheckoutButton().isEnabled();
		if(result30) {
			System.out.println("UseGiftCertificate is Enabled");
		}
		else {
			System.out.println("UseGiftCertificate is Not Enabled");
		}
	}

	}

