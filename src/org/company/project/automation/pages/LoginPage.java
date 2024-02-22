package org.company.project.automation.pages;

import org.company.project.automation.utilityClass.ReadPropertiesFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//class for each page with basic methods defined
public class LoginPage {

	WebDriver driver;

	// constructor with parameter for Webdriver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// method for entering Email Or Phone number
	public void enterEmailOrPhonenumber(String emailOrPhonenumber) throws Exception {

		// find 'Email or phone number' textbox/web-element by 'id' and input Email
		driver.findElement(By.id(ReadPropertiesFiles.readElementFile("EmailOrPhonenumber_id"))).sendKeys(emailOrPhonenumber);

	}

	// method for entering Password
	public void enterPassword(String password) throws Exception {

		// find 'Password' textbox/web-element by 'name' and input password
		driver.findElement(By.name(ReadPropertiesFiles.readElementFile("Password_name"))).sendKeys(password);

	}

	// method for clicking Log In Button
	public void clickLogInButton() throws Exception {

		// find 'Log In' button using css
		driver.findElement(By.cssSelector(ReadPropertiesFiles.readElementFile("LogInButton_css"))).click();

	}
	
}
