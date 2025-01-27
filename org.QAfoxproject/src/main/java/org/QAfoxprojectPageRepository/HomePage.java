package org.QAfoxprojectPageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// Declaration of WebElement
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myaccount_headerlink;

	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]//a[text()='Login']")
	private WebElement login_headerlink;

	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]//a[text()='Register']")
	private WebElement register_headerlink;

	@FindBy(xpath = "//li/a[contains(text(),'Desktops')]")
	private WebElement desktop_headertext;

	@FindBy(xpath = "//a[contains(text(),'PC')]")
	private WebElement desktop_pc_Product;

	@FindBy(xpath = "//a[text()='Mac (1)']")
	private WebElement desktop_Mac_Product;
	
	@FindBy(xpath="//div[@class='caption']//a")
	private WebElement iMac;
	
	@FindBy(id="button-cart")
	private WebElement MacAddtoCart;
	
	@FindBy(xpath="//i[@class='fa fa-user']")
	private WebElement MyAccount_Button;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Logout']")
	private WebElement LogOut_Button;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[text()='Components']")
	private WebElement Components_headertext;

	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='Mice and Trackballs (0)']")
	private WebElement Component_MiceAndTrackballs;

	@FindBy(xpath = "//a[text()='Monitors (2)']")
	private WebElement Component_Monitors;

	@FindBy(xpath = "//a[text()='Printers (0)']")
	private WebElement Component_Printers;

	@FindBy(xpath = "//a[text()='Scanners (0)']")
	private WebElement Component_Scanners;

	@FindBy(xpath = "//a[text()='Web Cameras (0)']")
	private WebElement Component_webcameras;

	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement Mp3Players_headertext;

	@FindBy(xpath = "//ul[@class='list-unstyled']//a[text()='test 18 (0)']")
	private WebElement mp3Player_test_18;

	@FindBy(xpath = "//a[@title='Shopping Cart']")
	private WebElement Shopping_cartButton;

	@FindBy(id = "wishlist-total")
	private WebElement WishList_Button;
	
	@FindBy(xpath="//ul[@class='list-inline']//a[@title='Checkout']")
	private WebElement Checkout_Button;
	

	// initialization of webelement
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getMyaccount_headerlink() {
		return myaccount_headerlink;
	}

	public WebElement getLogin_headerlink() {
		return login_headerlink;
	}

	public WebElement getRegister_headerlink() {
		return register_headerlink;
	}

	public WebElement getDesktop_headertext() {
		return desktop_headertext;
	}

	public WebElement getDesktop_pc_Product() {
		return desktop_pc_Product;
	}

	public WebElement getDesktop_Mac_Product() {
		return desktop_Mac_Product;
	}

	public WebElement getComponents_headertext() {
		return Components_headertext;
	}

	public WebElement getComponent_MiceAndTrackballs() {
		return Component_MiceAndTrackballs;
	}

	public WebElement getComponent_Monitors() {
		return Component_Monitors;
	}

	public WebElement getComponent_Printers() {
		return Component_Printers;
	}

	public WebElement getComponent_Scanners() {
		return Component_Scanners;
	}

	public WebElement getComponent_webcameras() {
		return Component_webcameras;
	}

	public WebElement getMp3Players_headertext() {
		return Mp3Players_headertext;
	}

	public WebElement getMp3Player_test_18() {
		return mp3Player_test_18;
	}

	public WebElement getShopping_cartButton() {
		return Shopping_cartButton;
	}

	public WebElement getWishList_Button() {
		return WishList_Button;
	}

	public WebElement getCheckout_Button() {
		return Checkout_Button;
	}

	public WebElement getLogOut_Button() {
		return LogOut_Button;
	}

	public WebElement getMyAccount_Button() {
		return MyAccount_Button;
	}


	public WebElement getMacAddtoCart() {
		return MacAddtoCart;
	}

	public WebElement getiMac() {
		return iMac;
	}
	
	
	

}
