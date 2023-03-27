package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
		@FindBy(id = "profileImage")
		public WebElement acctProfileImage;	
		
		@FindBy(id = "accountLink")
		public WebElement accounOption;
		
		@FindBy(id ="nameInput")
		public WebElement acctNameField;
		
		@FindBy(xpath = "//input[@name = 'phoneNumber']")
		public WebElement acctPhoneField;
		
		@FindBy(id = "personalUpdateBtn")
		public WebElement acctUpdatBtn;
		
		@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
		public WebElement personalInfoUpdateMsg;
		
		@FindBy(xpath = "//input[@name = 'previousPassword']")
		public WebElement previousPassword;
		
		@FindBy(xpath = "//input[@name='newPassword']")
		public WebElement newPassword;
		
		@FindBy(xpath = "//input[@name='confirmPassword']")
		public WebElement confirmPassword;
		
		@FindBy(id = "credentialsSubmitBtn")
		public WebElement changePasswordBtn;
		
		@FindBy(xpath = "//div[text() = 'Password Updated Successfully']")
		public WebElement acctPassworUpdatedSuccessfullyMsg;
		
		@FindBy(xpath = "//p[text() = 'Add a payment method']")
		public WebElement addPaymentMethod;
		
		@FindBy(id = "cardNumberInput")
		public WebElement cardNumberInput;
		
		@FindBy(xpath = "//input[@name='nameOnCard']")
		public WebElement nameOnCardInput;
		
		@FindBy(id = "expirationMonthInput")
		public WebElement expMonthInput;
		
		@FindBy(id = "expirationYearInput")
		public WebElement expYearInput;
		
		@FindBy(id = "securityCodeInput")
		public WebElement securityCodeInput;
		
		@FindBy(id = "paymentSubmitBtn")
		public WebElement addAndUpdateCardOption;
		
		@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
		public WebElement paymentMethodAddedSuccessfullyMsg;
		
		@FindBy(xpath = "//div[@class='account__payment-detail']//button[text()='Edit']")
		public WebElement editCardOption;
		
		@FindBy(xpath = "//div[text() = 'Payment Method updated Successfully']")
		public WebElement paymentMethodUpdatedSuccussfully;
				
		@FindBy(xpath = "//html[@lang = 'en']")
		public WebElement scrollBar;
		
		@FindBy(xpath = "//p[text() = '6398']")
		public WebElement cardTwo6398;
		
		@FindBy(xpath = "//button[@class = 'text-blue-800 cursor-pointer hover:underline' and text() = 'remove']")
		public WebElement removeOption;
		
		@FindBy(xpath = "//p[text() = 'Add Address']")
		public WebElement addAddress;
		
		@FindBy(xpath = "//select[@id = 'countryDropdown']")
		public WebElement countryDropDown;
		
		//@FindBy(xpath = "//option[@value = 'United States']")
		//public WebElement selectCountry;
		
		@FindBy(xpath = "//input[@id = 'fullNameInput']")
		public WebElement addressFullName;
		
		@FindBy(xpath = "//input[@id = 'phoneNumberInput']")
		public WebElement addressPhoneNumber;
		
		@FindBy(xpath = "//input[@id = 'streetInput']")
		public WebElement addressStreetInput;
		
		@FindBy(xpath = "//input[@id = 'apartmentInput']")
		public WebElement addressAptInput;//button[@id = 'addressBtn']
		
		@FindBy(xpath = "//input[@id = 'cityInput']")
		public WebElement addressCityInput;
		
		@FindBy(xpath = "//select[@name = 'state']")
		public WebElement addressStateInput;
		
		//@FindBy(xpath = "//option[@value = 'Virginia']")
		//public WebElement selectStateVA;
		
		@FindBy(xpath = "//input[@id = 'zipCodeInput']")
		public WebElement addressZipCode;
		
		@FindBy(xpath = "//button[@id = 'addressBtn']")
		public WebElement addAddressBtn;
		
		@FindBy(xpath = "//div[text()= 'Address Added Successfully']")
		public WebElement addressAddedSuccessfullyMsg;
		
		@FindBy(xpath = "//div[@class='account__address-single'][2]//button[text()='Edit']")
		public WebElement addressEditOption;
		
		@FindBy(xpath = "//div[text() = 'Address Updated Successfully']")
		public WebElement addressUpdatedSuccessfullyMsg;
		
		@FindBy(xpath = "//div[@class = 'account__address-single'][2]//button[text() = 'Remove']")
		public WebElement addressRemoveOption;
	}
	

