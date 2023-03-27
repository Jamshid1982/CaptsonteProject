package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable; 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.beust.jcommander.internal.Maps;
 


public class HomeSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	
	
	// Verify shop by department sidebar
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSections);
		logger.info("user clicked on All section");
	}
	
	@Then("Below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		waitTillPresence(factory.homePage().Electronics);
		String[] allOptions = {"Electronics", "Computers", "Smart Home", "Sports", "Automative"};
		for (int i = 0; i < allOptions.length; i++) {
			WebElement element = getDriver().findElement(By.xpath( "//div[@class = 'sidebar_content-item']//span"));
			assert element.isDisplayed();
		}
		logger.info("all options are present");
		
	}
	
	
	//Verify department sidebar options
	@And("User click on {string}")
	public void userClickOnDepartment(String department) {
	    click(getDriver().findElement(By.xpath("//span[text()='" + department +"']")));
		logger.info("User clicked on departments");
	}
	@Then("below options are present in department{string}  {string}")
	public void optionsArePresentInDepartment(String optionOne, String optionTwo) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text()='" + optionOne + "']"))));
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[text()='" + optionTwo + "']"))));
		logger.info("Options are present in Department");
	}
	
	//Verify user can add an item to cart
	@And("User change the category to {string}")
	public void userChangeTheCategoryToSmartHome(String category) {
		click(factory.homePage().allDepartments);
		selectByVisibleText(factory.homePage().allDepartments, category);
		logger.info("category changed to Smart Home");
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnItem(String itemName) {
		sendText(factory.homePage().searchInput, itemName);
		logger.info("user searched for the item");
	}
	
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBtn);
		logger.info("user clicked on search icon");
	}
	
	@And("User click on item")
	public void userClickOnItem(){
		click(factory.homePage().product);
		logger.info("user clicked on item");
	}
	
	@And("User select quantity {string}")
	public void userSelectQuantity(String quantity) {
		click(factory.homePage().qty);
		selectByVisibleText(factory.homePage().qty, quantity);
		logger.info("user selected quantity");
	}
	
	@And("User click add to Cart button")
	public void userClicAddToCartButton() {
		click(factory.homePage().addToCardBtn);
		logger.info("user clicked add to cart button");
	}
	
	@Then("the cart icon quantity should change to {string}")
	public void cartIconQuantityShouldChange(String qty) {
		waitTillPresence(factory.homePage().cartQtyIcon);
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//span[@id = 'cartQuantity' and text()='" + qty +"']"))));
		logger.info("cart icon quantity is chaged to '2'");
	}
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
		waitTillPresence(factory.homePage().cartOption);
		click(factory.homePage().cartOption);
		logger.info("user clicked on cart option");
	}
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutBtn() {
		waitTillPresence(factory.homePage().proceedChkOutBtn);
		click(factory.homePage().proceedChkOutBtn);
		logger.info("user clicked on proceed to checkout Btn");
	}
	
	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddLinkForShpngAdd() {
		click(factory.homePage().addAddressButton);
		logger.info("user clicked add a new address link");
	}
	
	@And("User fill new address form with below information")
	public void userFillNewAddFormInfo(DataTable dataTable) {
		List<Map<String, String >> data = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.homePage().countryDrpDwn, data.get(0).get("country"));
		sendText(factory.homePage().newAddFullName, data.get(0).get("fullName"));
		sendText(factory.homePage().newAddPhNum, data.get(0).get("phoneNumber"));
		sendText(factory.homePage().newAddStInput, data.get(0).get("streetAddress"));
		sendText(factory.homePage().newAddAptInput, data.get(0).get("apt"));
		sendText(factory.homePage().newAddCityInpute, data.get(0).get("city"));
		selectByVisibleText(factory.homePage().newAddState, data.get(0).get("state"));
		sendText(factory.homePage().newAddZipCode, data.get(0).get("zipCode"));
		logger.info("the new address form is filled");
	}
	
	//@And("User click Add Your Address button")
//	public void userClickAddYourAddBtn() {
//	click(factory.homePage().addAddressBtn);
//		logger.info("user clicked on add your address button");
//}
	
	@And("User click Add a credit card or Debit Card for Payment method")
	public void useClickAddCreditDebitCardforPaymentMethod() {
		click(factory.homePage().addPaymentBtn);
		logger.info("user clicked on Add a credit or debit card button");
	}
	
//	@And("User fill Debit or credit card information")
//	public void userFillDebitOrCreditCardInfo(DataTable dataTable) {
//		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
//		sendText(factory.homePage().cardNumber, data.get(0).get("cardNumber"));
//		sendText(factory.homePage().nameOnCard, data.get(0).get("nameOnCard"));
//		sendText(factory.homePage().expMonthInput, data.get(0).get("expirationMonth"));
//		sendText(factory.homePage().expYearInput, data.get(0).get("expirationYear"));
//		sendText(factory.homePage().securityCode, data.get(0).get("securityCode"));
//	}
	
//	@And("User click on Add your card button")
//	public void userClickOnAddYourCardBtn() {
//		click(factory.homePage().addCardBtn);
//		logger.info("user clicked on add your card button");
//	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder(){
		click(factory.homePage().placeOrderBtn);
		logger.info("user clicked on place you order");
	}
	
	@Then("a message should be displayed {string}")
	public void orderPlacedMessageShouldBeDisplayed(String message){
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//p[text()='" + message + "']"))));
		logger.info("Order Placed, Thanks message is displayed");
	}
	
}
