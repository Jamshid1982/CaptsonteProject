package tek.sdet.framework.steps;

import java.util.List; 
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGenerator;

public class SingInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	//LogIn
	
	@Given ("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertTrue(isElementDisplayed(factory.signInPage().tekSchoolLogo));
		logger.info("user is on retail website");
		
	}
	
	
	@When("User click on Sign in option")
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
	
	@And("User click on login button")
	public void userClicksOnLogInButton() {
		waitTillPresence(factory.signInPage().login);
		click(factory.signInPage().logIn);
		logger.info("user clicked on log in");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().logOutBtn));
		logger.info("user is logged in into account");
	}
	
	//SignUp
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountBtn);
		logger.info("user clicked on create new account button");
	}
	
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformation(DataTable dataTable) {
		List<Map<String, String>>data = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().signUpName, DataGenerator.getData(data.get(0).get("name"))); 
		sendText(factory.signInPage().signUpEmail,  DataGenerator.getData(data.get(0).get("email")));
		sendText(factory.signInPage().signUpPassword, data.get(0).get("password"));
		sendText(factory.signInPage().signUpConfPass, data.get(0).get("confirmPassword"));
		logger.info("user filled the signup information");
	}
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpBtn);
		logger.info("user clicked on signup button");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLOggedIntoAccountPage() {
		waitTillPresence(factory.accountPage().acctProfileImage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().acctProfileImage));
		logger.info("user should be logged into account page");
	}
	

	
}

