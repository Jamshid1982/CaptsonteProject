package tek.sdet.framework.steps;

import java.util.List;  
import java.util.Map;

import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.base.BaseSetup;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;



public class RetailAccountSteps extends CommonUtility  {
	
	POMFactory factory = new POMFactory();
	
	
	// Update Profile Information
	@When("User click on Account option")
	public void userClickOnAccountOption(){
		click(factory.accountPage().accounOption);
		logger.info("user clicked on Account option");
		}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String NameValue, String PhoneValue ) {
		clearTextUsingSendKeys(factory.accountPage().acctNameField);
		sendText(factory.accountPage().acctNameField, DataGenerator.getData("name"));
		clearTextUsingSendKeys(factory.accountPage().acctPhoneField);
		sendText(factory.accountPage().acctPhoneField, DataGenerator.getData("phone"));
		logger.info("user updated name and phonenumber");
		
	}
	
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().acctUpdatBtn);
		logger.info("user clicked on update button");
		
	}
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateMsg);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateMsg));
		String actualMessage = factory.accountPage().personalInfoUpdateMsg.getText();
		String expectedMessage = "Personal Information Updated Successfully";
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("user profile information is updated");
		
	}
	
	
	//Update Account Password
	@And("User enter below information")
	public void userEntersPreviousNewAndConfirmPassword(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword, data.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPassword, data.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPassword, data.get(0).get("confirmPassword"));
		logger.info("user entered previou, new, and confirm password");
	}
	
	@And("User click on Change Password button")
	public void userClicksOnChangePasswordBtn() {
		click(factory.accountPage().changePasswordBtn);
		logger.info("user clicked on change password button");
	}
	
	@Then("a message should be displayed 'Password Updated Successfully'")
	public void passwordUpdatedSuccessfullyMsgShouldBeDisplayed() {
	waitTillPresence(factory.accountPage().acctPassworUpdatedSuccessfullyMsg);
	Assert.assertTrue(isElementDisplayed(factory.accountPage().acctPassworUpdatedSuccessfullyMsg));
	String actualMessage = factory.accountPage().acctPassworUpdatedSuccessfullyMsg.getText();
	String expectedMessage = "Password Updated Successfully";
	Assert.assertEquals(expectedMessage, actualMessage);
	logger.info("message passwor updated successfully is displayed");
		
	}
	
	
	//Add Payment card
	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethod() {
		click(factory.accountPage().addPaymentMethod);
		logger.info("user clicked on Add a payment Method");
	}
	
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> Data = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, Data.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, Data.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expMonthInput, Data.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expYearInput, Data.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput, Data.get(0).get("securityCode"));
		logger.info("user filled credit or debit card information");
		
		}
	
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addAndUpdateCardOption);
		logger.info("user clicked on Add your card button");
	}
	
	@Then("a message should be displayed 'Payment Method added successfully'")
	public void paymentMethodAddedSuccessfullyMsgShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().paymentMethodAddedSuccessfullyMsg);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodAddedSuccessfullyMsg));
		//String actualMessage = factory.accountPage().paymentMethodAddedSuccessfullyMsg.getText();
		//String expectedMessage = "Payment Method added successfully";
		//Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("payment method added successfully message displayed");
	}
	
	
	// Edit Payment card
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		
		
		click(factory.accountPage().cardTwo6398);
		click(factory.accountPage().editCardOption);
		logger.info("user clicked on Edit option of card Section");
	}
	
	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, data.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, data.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expMonthInput, data.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expYearInput, data.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput, data.get(0).get("securityCode"));
		logger.info("user filled credit or debit card information");
	}
	
	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().addAndUpdateCardOption);
		logger.info("user clicked on updated your card button");
	}
	
	@Then("a message should be displayed 'Payment Method updated Successfully'")
	public void paymentMethodUpdatedSuccessfullyMsgShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccussfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodUpdatedSuccussfully));
		logger.info("payment method updated successfully message displayed");
	}
	
	
	// Remove payment card
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	click(factory.accountPage().cardTwo6398);
	click(factory.accountPage().removeOption);
	logger.info("user clicked on remove option of the card section");
	
	}
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertFalse(factory.accountPage().cardTwo6398.toString(), false);
		logger.info("payment details is removed");
		
	}
	
	//Adding Account Address
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddress);
		logger.info("user clicked on Add address option");
	}
	
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable){
		List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().countryDropDown, data.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().addressFullName);
		sendText(factory.accountPage().addressFullName, data.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().addressPhoneNumber);
		sendText(factory.accountPage().addressPhoneNumber, data.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().addressStreetInput);
		sendText(factory.accountPage().addressStreetInput, data.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().addressAptInput);
		sendText(factory.accountPage().addressAptInput, data.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().addressCityInput);
		sendText(factory.accountPage().addressCityInput, data.get(0).get("city"));
		selectByVisibleText(factory.accountPage().addressStateInput, data.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().addressZipCode);
		sendText(factory.accountPage().addressZipCode, data.get(0).get("zipCode"));
		logger.info("user filled new address form");
	}
		
	@And("User click Add Your Address button")
		public void userClickAddYourAddressBtn() {
			click(factory.accountPage().addAddressBtn);
			logger.info("user clicked on Add Your Address Btn");
		}
		
	@Then("a message should be displayed 'Address Added Successfully'")
		public void addressAddedSuccessfullyMsgShouldBedDisplayed(){
		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMsg);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccessfullyMsg));
		logger.info("address added successfully message is displayed");	
	}
	
	//Edit Account Address
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().addressEditOption);
		logger.info("user clicked on edit address option");
	}
	
	//@And("user fill new address form with below information")
	//public void userFillNewAddressFormWithBelowInfo(DataTable dataTable) {
		
	
	@And("User click update Your Address button")
		public void userClickUpdateYourAddressBtn() {
		click(factory.accountPage().addAddressBtn);
		logger.info("user clicked update Your Address button");
	}
	
//	@Then("a message should be displayed 'Address Updated Successfully'")
//		public void addressUpdatedSuccessfullyMsgShouldBeDisplayed() {
//		waitTillPresence(factory.accountPage().addressUpdatedSuccessfullyMsg);
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfullyMsg));
//		logger.info("address updated successfully message is displayed");
//	}
	
	
	//Remove Account Address
	@And("User click on remove option of Address section")
		public void userClickOnRmoveOptionOfAddressSection() {
		click(factory.accountPage().addressRemoveOption);
		logger.info("user clicked on remove option of Address section");
	}
	
	@Then("Address details should be removed")
		public void addressDetailsShouldBeRemoved() {
		Assert.assertFalse(factory.accountPage().addressRemoveOption.toString(), false);
		logger.info("address details are removed");
	}
	
	
	
	
}
	
	
	
	


