package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().ordersBtn);
		logger.info("user clicked on orders section");
	}
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().firstOrderInList);
		logger.info("user clicked on first order in list");
	}
	
	@And("User click on Cancel The Order button")
	public void userClickedOnCancelTheOrderBtn() {
		click(factory.orderPage().cancelOrderBtn);
		logger.info("user clicked on cancel the order button");
	}
	
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReson(String cancelationReason) {
		click(factory.orderPage().cancelationInput);
		selectByVisibleText(factory.orderPage().cancelationInput, cancelationReason);
		logger.info("user selected the cancelation reason");
	}
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrder);
		logger.info("user clicked on cancel order button");
	}
	
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMsgShouldBeDisplayed(String confMsg) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//p[text()='" + confMsg + "']"))));
		logger.info("your order has been cancelled message should be displayed");
	}

	@And("User click on Return Items button")
	public void userClickOnReturnItemBtn() {
		click(factory.orderPage().returnBtn);
		logger.info("user click on return item button");
	}
	
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String returnReason) {
		click(factory.orderPage().returnReasonInput);
		selectByVisibleText(factory.orderPage().returnReasonInput, returnReason);
		logger.info("user selected the return reason");
	}
	
	@And("User select the drop off service {string}")
	public void userSelectedTheDropOffService(String dropOffService) {
		click(factory.orderPage().returnDropOffInput);
		selectByVisibleText(factory.orderPage().returnDropOffInput, dropOffService);
		logger.info("user selected the drop off service");
	}
	
	@And("User click on Return Order button")
	public void userClickOnReturnOrderBtn() {
		click(factory.orderPage().returnOrderBtn);
		logger.info("user clicked on return order button");
	}
	
	@And("User click on Review button")
	public void userClickOnReviewBtn() {
		click(factory.orderPage().reviewBtn);
		logger.info("user clicked on review button");
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHeadline(String headline, String reviewText) {
		sendText(factory.orderPage().reviewHeadlineInput, headline);
		sendText(factory.orderPage().reviewDescpInput, reviewText);
		logger.info("user wrote review");
	}
	
	@And("User click Add your Review button")
	public void userClickAddYourReviewBtn() {
		click(factory.orderPage().reviewSubmitBtn);
		logger.info("user clicked add your review button");
	}
	
	@Then("a review message should be displayed 'Your review was added successfully'")
	public void aReviewMsgShouldBeDisplayed() {
		waitTillPresence(factory.orderPage().confirmMsg);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().confirmMsg));
		logger.info("a review message is displayed");
	}
}
