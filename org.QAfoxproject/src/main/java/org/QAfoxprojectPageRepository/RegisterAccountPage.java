package org.QAfoxprojectPageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;

public class RegisterAccountPage implements ITestListener {

	// 1.Declaration


	@FindBy(name = "firstname")
	private WebElement UserFirstnameTextField;

	@FindBy(name = "lastname")
	private WebElement UserLastnameTextField;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement UserEmailTextField;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement UserTelePhoneTextField;

	@FindBy(id = "input-password")
	private WebElement UserPasswordTextField;
	@FindBy(name = "confirm")
	private WebElement UserConfirmPasswordTextField;

	@FindBy(name = "newsletter")
	private WebElement SubscribeRadioButton;
	
	@FindBy(xpath="//label[text()='No']")
	private WebElement NoradioButton;

	@FindBy(name = "agree")
	private WebElement PrivacypolicyCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton;

	

	//2. Initialization of WebElement ---Using Constructer
	public  RegisterAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//3.Utilization Of WebElement
	/**
	 * 
	 * @return UserFirstnameTextField
	 */

	public WebElement getUserFirstnameTextField() {
		return UserFirstnameTextField;
	}
	/**
	 * 
	 * @return UserLastnameTextField
	 */

	public WebElement getUserLastnameTextField() {
		return UserLastnameTextField;
	}
	/**
	 * 
	 * @return UserEmailTextField
	 */

	public WebElement getUserEmailTextField() {
		return UserEmailTextField;
	}

	public WebElement getUserTelePhoneTextField() {
		return UserTelePhoneTextField;
	}

	public WebElement getUserPasswordTextField() {
		return UserPasswordTextField;
	}

	public WebElement getUserConfirmPasswordTextField() {
		return UserConfirmPasswordTextField;
	}

	public WebElement getSubscribeRadioButton() {
		return SubscribeRadioButton;
	}

	public WebElement getPrivacypolicyCheckBox() {
		return PrivacypolicyCheckBox;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}

	public WebElement getNoradioButton() {
		return NoradioButton;
	}

	public void setNoradioButton(WebElement noradioButton) {
		NoradioButton = noradioButton;
	}



}
