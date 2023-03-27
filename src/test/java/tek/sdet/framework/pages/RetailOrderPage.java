package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	public RetailOrderPage() {
	PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@id = 'orderLink']")
	public WebElement ordersBtn;
	
	@FindBy(className = "order")
	public WebElement firstOrderInList;
	
	@FindBy(xpath = "//button[@id = 'cancelBtn']")
	public WebElement cancelOrderBtn;
	
	@FindBy(xpath = "//select[@id = 'reasonInput']")
	public WebElement cancelationInput;
	
	@FindBy(xpath = "//button[@class = 'order__cancel-submit']")
	public WebElement cancelOrder;
	
	@FindBy(xpath = "//p[text() = 'Your Order Has Been Cancelled']")
	public WebElement orderCancelledMsg;
	
	@FindBy(xpath = "//button[@id = 'returnBtn']")
	public WebElement returnBtn;
	
	@FindBy(xpath = "//select[@id = 'reasonInput']")
	public WebElement returnReasonInput;
	
	@FindBy(xpath = "//select[@id = 'dropOffInput']")
	public WebElement returnDropOffInput;
	
	@FindBy(xpath = "//button[@class = 'order__cancel-submit']")
	public WebElement returnOrderBtn;
	
	@FindBy(xpath = "//button[@id = 'reviewBtn']")
	public WebElement reviewBtn;
	
	@FindBy(xpath = "//input[@name = 'headline']")
	public WebElement reviewHeadlineInput;
	
	@FindBy(xpath = "//textarea[@id = 'descriptionInput']")
	public WebElement reviewDescpInput;
	
	@FindBy(xpath = "//button[@id = 'reviewSubmitBtn']")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[text() = 'Your review was added successfully']")
	public WebElement confirmMsg;
}
