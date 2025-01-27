package org.QAfoxprojectPageRepository;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAccountPage extends BaseConfiguration {
	//Declaration
	@FindBy(id="input-email")
	private WebElement Emailadd_TextField;
	
	@FindBy(id="input-password")
	private WebElement password_TextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Login_button;
	
	//Intilization
	public LoginAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Utilization

	public WebElement getEmailadd_TextField() {
		return Emailadd_TextField;
	}

	public WebElement getPassword_TextField() {
		return password_TextField;
	}

	public WebElement getLogin_button() {
		return Login_button;
	}
	

	
	
	

}
