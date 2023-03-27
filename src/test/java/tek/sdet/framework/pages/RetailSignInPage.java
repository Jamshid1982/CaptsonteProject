package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	//@FindBy(locatorType = "Value of Locator")
	//public WebElement elementName;
	
	
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(css = "#password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement login;
	
	@FindBy(id = "newAccountBtn")
	public WebElement createNewAccountBtn;
	
	@FindBy(xpath = "//a[@class = 'top-nav__logo active']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id = "nameInput")
	public WebElement signUpName;
	
	
	@FindBy(xpath = "//button[@id = 'loginBtn']")
	public WebElement logIn;
	
	@FindBy(xpath = "//button[@id ='logoutBtn']")
	public WebElement logOutBtn;
	
	@FindBy(id = "emailInput")
	public WebElement signUpEmail;
	
	@FindBy(id = "passwordInput")
	public WebElement signUpPassword;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement signUpConfPass;
	
	@FindBy(id = "signupBtn")
	public WebElement signUpBtn;
	
	
	
	
}

