package org.company.project.automation.testCases;

import org.company.project.automation.baseClass.InitiateBrowser;
import org.company.project.automation.pages.LoginPage;
import org.testng.annotations.Test;

// LogIn class extends InitiateBrowser class to access WebDriver
public class LoginTestScenario extends InitiateBrowser{

	@Test
	public void validateLoginFunction() throws Exception {
		
		// instantiate LoginPage class to enter email and password to login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmailOrPhonenumber("xyz@abc.com");
		loginPage.enterPassword("pass123");
		loginPage.clickLogInButton();
		
	}
}
