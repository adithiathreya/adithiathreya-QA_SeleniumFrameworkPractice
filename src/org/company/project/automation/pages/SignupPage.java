package org.company.project.automation.pages;

import org.company.project.automation.utilityClass.ReadPropertiesFiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

// class for each page with basic methods defined
public class SignupPage {

	WebDriver driver;
	
	// constructor with parameter for Webdriver
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// method for clicking Create new account Button
	public void clickCreateNewAccountButton() throws Exception {

		// find 'Create new account' button using xpath
		driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("CreateNewAccount_xpath"))).click();

	}

	// method for entering First name
	public void  enterFirstName(String firstName) throws Exception {
		
		// find 'First name' textbox/web-element by 'name' and input Email
		driver.findElement(By.name(ReadPropertiesFiles.readElementFile("FirstName_name"))).sendKeys(firstName);
		
	}
	
	// method for entering Last name
	public void enterLastName(String lastName) throws Exception {

		// find 'Last name' textbox/element using 'name'
		driver.findElement(By.name(ReadPropertiesFiles.readElementFile("LastName_name"))).sendKeys(lastName);

	}

	// method for entering Mobile number or email
	public void enterMobileNumberOrEmail(String mobileNumberOrEmail) throws Exception {

		// find 'Mobile number or email' textbox/element using xpath
		driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("MobileNumberOrEmail_xpath"))).sendKeys(mobileNumberOrEmail);

	}

	// private method for Re-entering email
	public void enterReenterEmail(String mobileNumberOrEmail) throws Exception {

		// find 'Re-enter email' textbox/element using xpath
		driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("ReEnterEmail_xpath"))).sendKeys(mobileNumberOrEmail);

	}		
		
	// method for entering Password
	public void enterPassword(String password) throws Exception {

		// find 'Password' textbox/web-element by 'name' and input password
		driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("Password_xpath"))).sendKeys(password);

	}
	
	// method for selecting Birth month
	public void selectBirthdayMonth(int monthIndex) throws Exception {

		// select 'birthday month' dropdown/element using xpath
		Select birthday = new Select(driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("BirthdayMonth_xpath"))));
		birthday.selectByIndex(monthIndex);
		
	}
	
	// method for selecting Birth date
	public void selectBirthdayDay(String dayValue) throws Exception {

		// select 'birthday day' dropdown/element using xpath
		Select birthday = new Select(driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("BirthdayDate_xpath"))));
		birthday.selectByValue(dayValue);

	}
	
	// method for selecting Birth year
	public void selectBirthdayYear(String yearInText) throws Exception {

		// select 'birthday year' dropdown/element using xpath
		Select birthday = new Select(driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("BirthdayYear_xpath"))));
		birthday.selectByVisibleText(yearInText);

	}
	
	// method for selecting Gender
	public void selectGender() throws Exception {

		// find 'Gender' radiobutton/element using xpath
		driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("Gender_xpath"))).click();

	}

	// method for clicking Sign Up Button
	public void clickSignUpButton() throws Exception {

		// find 'Sign Up' button using xpath
		driver.findElement(By.xpath(ReadPropertiesFiles.readElementFile("SignUpButton_xpath"))).click();

	}
	
}
