package org.QAfoxprojectPageRepository;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Cart_Module extends BaseConfiguration {
	
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']//following::span[text()='Shopping Cart']")
	private WebElement ShoppingCartModule;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement AlertPopup;
	
	@FindBy(xpath="//div[@id='content']/h1")
	private WebElement ShoppingCartWeight;
	
	@FindBy(xpath="//div[@class='input-group btn-block']/input")
	private WebElement Quantity;
	
	@FindBy(xpath="//i[@class='fa fa-refresh']")
	private WebElement UpdateQuantity;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessfullModifiedtText;
	
	@FindBy(xpath="//i[@class='fa fa-times-circle']")
	private WebElement RemoveProduct;
	
	@FindBy(xpath="//a[text()='Use Coupon Code ']")
	private WebElement USECouponCode;
	
	@FindBy(id="input-coupon")
	private WebElement EnterYourCouponCode;
	
	@FindBy(xpath="//span[@class='input-group-btn']//input[@id='button-coupon']")
	private WebElement ApplyCoupon;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement WarningTextCoupon;
	
	@FindBy(xpath="//a[text()='Estimate Shipping & Taxes ']")
	private WebElement EstimateshippingTaxes;
	
	@FindBy(xpath="//div[@class='col-sm-10']/select[@name='country_id']")
	private WebElement Country;
	
	@FindBy(id="input-zone")
	private WebElement State;
	
	@FindBy(id="input-postcode")
	private WebElement postcode;
	
	@FindBy(id="button-quote")
	private WebElement Getquote;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement RadioButton;
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement CancelButton;
	
	@FindBy(id="button-shipping")
	private WebElement ApplyShopping;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccesfulEstimate;
	
	@FindBy(xpath="//a[text()='Use Gift Certificate ']")
	private WebElement UseGiftCertificate;
	
	@FindBy(xpath="//input[@id='input-voucher']")
	private WebElement EnterGiftCertificate;
	
	@FindBy(xpath="//input[@id='button-voucher']")
	private WebElement ApplyGiftCertificate;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement Warning;
	
	@FindBy(xpath="//a[text()='Continue Shopping']")
	private WebElement ContinueShoppingButton;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement CheckoutButton;
	
	public Shopping_Cart_Module(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getShoppingCartModule() {
		return ShoppingCartModule;
	}

	public WebElement getAlertPopup() {
		return AlertPopup;
	}

	public WebElement getShoppingCartWeight() {
		return ShoppingCartWeight;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getUpdateQuantity() {
		return UpdateQuantity;
	}

	public WebElement getSuccessfullModifiedtText() {
		return SuccessfullModifiedtText;
	}

	public WebElement getRemoveProduct() {
		return RemoveProduct;
	}

	public WebElement getUSECouponCode() {
		return USECouponCode;
	}

	public WebElement getEnterYourCouponCode() {
		return EnterYourCouponCode;
	}

	public WebElement getApplyCoupon() {
		return ApplyCoupon;
	}

	public WebElement getWarningTextCoupon() {
		return WarningTextCoupon;
	}

	public WebElement getEstimateshippingTaxes() {
		return EstimateshippingTaxes;
	}

	public WebElement getCountry() {
		return Country;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getGetquote() {
		return Getquote;
	}

	public WebElement getQuoteRadioButton() {
		return RadioButton;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}

	public WebElement getApplyShopping() {
		return ApplyShopping;
	}

	public WebElement getSuccesfulEstimate() {
		return SuccesfulEstimate;
	}

	public WebElement getUseGiftCertificate() {
		return UseGiftCertificate;
	}

	public WebElement getEnterGiftCertificate() {
		return EnterGiftCertificate;
	}

	public WebElement getApplyGiftCertificate() {
		return ApplyGiftCertificate;
	}

	public WebElement getWarning() {
		return Warning;
	}

	public WebElement getContinueShoppingButton() {
		return ContinueShoppingButton;
	}

	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}

}
