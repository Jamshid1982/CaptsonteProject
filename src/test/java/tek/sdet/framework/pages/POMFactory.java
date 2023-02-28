package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	public POMFactory() {
		// creating an object of the RetailHomePage class
		this.homePage = new RetailHomePage();
		// creating an object of the RetailSignInPage class
		this.signInPage = new RetailSignInPage();
		
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}

}


