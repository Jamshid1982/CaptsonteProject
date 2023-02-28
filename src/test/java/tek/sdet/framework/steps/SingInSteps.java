package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SingInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	@Given("User is on Retail website")
	public void userIsOnRetailWebsite() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("User clicks on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("user clicked on Sign In Option");
	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passValue) {
		sendText(factory.signInPage().emailField, emailValue);
		sendText(factory.signInPage().passwordField, passValue);
		logger.info("user entered email and password");
		
	}
	
	@And("User clicks on login button")
	public void userClicksOnLogginButton() {
		click(factory.homePage().login);
		logger.info("user clicked on log in button");
		
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		logger.info("user is logged in into Account");
		
	}
	
	@And("User clicks on Logout option")
	public void userClicksOnLogoutOption() {
		click(factory.homePage().logout);
		Assert.assertTrue(isElementDisplayed(factory.homePage().signIn));
		logger.info("user is logged out");
	}
	

	@When("User clicks on Create New Account button")
	public void userClicksOnCreateNewAccountButton() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	  
	}
	@When("User clicks on SignUp button")
	public void userClicksOnSignUpButton() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
	    // Write code here that turns the phrase above into concrete actions
	}
}

