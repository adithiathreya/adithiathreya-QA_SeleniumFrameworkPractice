package org.company.project.automation.testCases;

import org.company.project.automation.baseClass.InitiateBrowser;
import org.company.project.automation.pages.SignupPage;
import org.testng.annotations.Test;

//LogIn class extends InitiateBrowser class to access WebDriver an
public class SignUpTestScenario extends InitiateBrowser{

	@Test
	public void validateSignUpFunction() throws Exception {
		
		//instantiate SignupPage class to enter email and password to login
		SignupPage signupPage = new SignupPage(driver);
		signupPage.clickCreateNewAccountButton();
		signupPage.enterFirstName("Practice");
		signupPage.enterLastName("Selenium");
		String mobileNumberOrEmail = "practiceselenium@gmail.com";
		signupPage.enterMobileNumberOrEmail(mobileNumberOrEmail);
		if (mobileNumberOrEmail.contains("@") && mobileNumberOrEmail.contains(".")) {
			signupPage.enterReenterEmail(mobileNumberOrEmail);
		}
		signupPage.enterPassword("password123");
		signupPage.selectBirthdayMonth(0);
		signupPage.selectBirthdayDay("1");
		signupPage.selectBirthdayYear("1905");
		signupPage.selectGender();
		signupPage.clickSignUpButton();
		
	}
}
