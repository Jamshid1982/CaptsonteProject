
package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		// we are implementing PageFactory Class to initialize the UI elements
		//using @FindBy annotation of PageFactory.
		PageFactory.initElements(getDriver(), this);
		}
	
	// @FindBy(id = "signinBtn") public WebElemnent signIn;
	 
	// syntax for storing UI elements using @FindBy annotations    
	// @FindBy(locatorType = "locator Value")    
	// public WebElement nameOfElement    
	
	@FindBy(xpath = "//a[@id = 'signinLink']")
	public WebElement signIn;
	
	@FindBy(xpath = "//span[text()= 'All']")
	public WebElement allSections;
	
	@FindBy(xpath = "//span[text()= 'Electronics']")
	public WebElement Electronics;
	
	@FindBy(xpath = "//span[text() = 'Computers']")
	public WebElement Computers;
	
	@FindBy(xpath = "//span[text() = 'Smart Home']")
	public WebElement smartHome;
	
	@FindBy(xpath = "//span[text() = 'Sports']")
	public WebElement Sports;
	
	@FindBy(xpath = "//span[text() = 'Automative']")
	public WebElement Automative;
	
	@FindBy(xpath = "//div[@class = 'sidebar_content-item']//span")
	public List<WebElement> deptSidebar;
	
	@FindBy(xpath = "//select[@ id = 'search']" )
	public WebElement allDepartments;
	
	
	@FindBy(xpath = "//input[@id = 'searchInput']" )
	public WebElement searchInput;
	
	@FindBy(xpath = "//button[@id = 'searchBtn']" )
	public WebElement searchBtn;
	
	@FindBy(xpath = "//img[@alt = 'Kasa Outdoor Smart Plug']" )
	public WebElement itemImage;
	
	@FindBy(xpath = "//select[@class = 'product__select']//option[@value = '2']" )
	public WebElement qtyTwo;
	 
	
	@FindBy(xpath = "//button[@id ='addToCartBtn']")
	public WebElement addToCardBtn;
	
	@FindBy(xpath = "//select[@class = 'product__select']")
	public WebElement cartQtyIcon;
	
	@FindBy(xpath = "//div[@id = 'cartBtn']")
	public WebElement cartOption;
	
	@FindBy(xpath = "//button[@id = 'proceedBtn']")
	public WebElement proceedChkOutBtn;
	
	//@FindBy(xpath = "//button[@id = 'addAddressBtn']")
	//public WebElement addANewAddress;
	
	@FindBy(id = "addAddressBtn")
	public WebElement addAddressButton;
	
	@FindBy(xpath = "//select[@id = 'countryDropdown']")
	public WebElement countryDrpDwn;
	
	@FindBy(xpath = "//input[@id = 'phoneNumberInput']")
	public WebElement newAddPhNum;
	
	@FindBy(xpath = "//input[@id = 'fullNameInput']")
	public WebElement newAddFullName;
	
	@FindBy(xpath = "//input[@id = 'streetInput']")
	public WebElement newAddStInput;
	
	@FindBy(xpath = "//input[@id = 'apartmentInput']")
	public WebElement newAddAptInput;
	
	@FindBy(xpath = "//input[@id = 'cityInput']")
	public WebElement newAddCityInpute;
	
	@FindBy(xpath = "//select[@name = 'state']")
	public WebElement newAddState;
	
	@FindBy(xpath = "//input[@id = 'zipCodeInput']")
	public WebElement newAddZipCode;
	
	@FindBy(xpath = "//button[@id = 'addressBtn']")
	public WebElement addAddressBtn;
	
	@FindBy(xpath = "//button[@id = 'addPaymentBtn']")
	public WebElement addPaymentBtn;
	
	@FindBy(xpath = "//input[@id= 'cardNumberInput']")
	public WebElement cardNumber;
	
	@FindBy(xpath = "//input[@id= 'nameOnCardInput']")
	public WebElement nameOnCard;
	
	@FindBy(xpath = "//select[@id= 'expirationMonthInput']")
	public WebElement expMonthInput;
	
	@FindBy(xpath = "//select[@id= 'expirationYearInput']")
	public WebElement expYearInput;
	
	@FindBy(xpath = "//input[@id = 'securityCodeInput']")
	public WebElement securityCode;
	
	@FindBy(xpath = "//button[@id = 'paymentSubmitBtn']")
	public WebElement addCardBtn;
	
	@FindBy(xpath = "//button[@id = 'placeOrderBtn']")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//p[text() = 'Order Placed, Thanks']")
	public WebElement confirmationMsg;
	
	@FindBy(className = "products__layout")
	public WebElement smartPlug;
	
	@FindBy(className = "product__select")
	public WebElement qty;
	
	@FindBy(className = "products__layout")
	public WebElement product;
	}
