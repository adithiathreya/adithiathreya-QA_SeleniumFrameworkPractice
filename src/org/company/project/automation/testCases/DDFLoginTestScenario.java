package org.company.project.automation.testCases;

import org.company.project.automation.baseClass.InitiateBrowser;
import org.company.project.automation.dataGenerator.TestDataGenerator;
import org.company.project.automation.pages.LoginPage;
import org.testng.annotations.Test;

// LogIn class extends InitiateBrowser class to access WebDriver
public class DDFLoginTestScenario extends InitiateBrowser {

	// dataProvider annotaions to understand data to be fed
	@Test(dataProvider="staticdata", dataProviderClass=TestDataGenerator.class)
	public void validateLoginFunctions(String emailOrPhonenumber, String password) throws Exception {

		// instantiate LoginPage class to enter email and password to login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmailOrPhonenumber(emailOrPhonenumber);
		loginPage.enterPassword(password);
		loginPage.clickLogInButton();

	}

	
}
