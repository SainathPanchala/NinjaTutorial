package org.QAfoxproject.RegisterAccount;


import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectGenericUtility.WebDriverLibrary;
import org.QAfoxprojectPageRepository.RegisterAccountPage;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.QAfoxprojectListenerfeature.Listenerimplimentation.class)

public class RegisterAccountTest extends BaseConfiguration{
	
	
	@Test(retryAnalyzer = org.QAfoxprojectListenerfeature.Listenerimplimentation.class)
	public void verifywithValidInput() {
		
		 //Create Object 
		RegisterAccountPage ra = new RegisterAccountPage(WebDriverLibrary.static_driver);
		//Enter FirstName in the Name TextField
		ra.getUserFirstnameTextField().sendKeys("Sai");
		//Enter LastName in the Name TextField
		ra.getUserLastnameTextField().sendKeys("Nath");
		
		//Enter the mail in Email Text Field
		ra.getUserEmailTextField().sendKeys("p.sainath980@gmail.com");
		
		//Enter the Telephone in Telephone Text Field
		ra.getUserTelePhoneTextField().sendKeys("8989898989");
		
		//Enter the password in Password Text Field
		ra.getUserPasswordTextField().sendKeys("89898989");
		
		//Enter the Confirm password in Password Text Field
		ra.getUserConfirmPasswordTextField().sendKeys("89898989");
		
		//Click on Subscribe "Yes" Radio Button
		ra.getSubscribeRadioButton().click();
		//Click on CheckBox
		ra.getPrivacypolicyCheckBox().click();
		
		//Click on Continue Button
		ra.getContinueButton().click();
		
		//Test log
		Reporter.log("Register Account verifyWith with valid inputs",true);
		//org.testng.Assert.fail();
	}
	
	@Test(enabled = false)
	public void verifyWithINvalidInput() {
		
	 RegisterAccountPage ra = new RegisterAccountPage(WebDriverLibrary.static_driver);
	
				ra.getUserFirstnameTextField().sendKeys("Sai");
				//Enter LastName in the Name TextField
				ra.getUserLastnameTextField().sendKeys("Nath");
				
				//Enter the mail in Email Text Field
				ra.getUserEmailTextField().sendKeys("p.sai@gmail.com");
				
				//Enter the Telephone in Telephone Text Field
				ra.getUserTelePhoneTextField().sendKeys("90909090");
				
				//Enter the password in Password Text Field
				ra.getUserPasswordTextField().sendKeys("89898989");
				
				//Enter the Confirm password in Password Text Field
				ra.getUserConfirmPasswordTextField().sendKeys("Abcd123");
				
				//Click on Subscribe "Yes" Radio Button
				ra.getSubscribeRadioButton().click();
				//Click on CheckBox
				ra.getPrivacypolicyCheckBox().click();
				
				//Click on Continue Button
				ra.getContinueButton().click();
				

		//Test log
		Reporter.log("Register Account verify with invalid inputs ");
	}
	

}
