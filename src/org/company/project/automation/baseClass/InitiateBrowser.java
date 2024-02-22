package org.company.project.automation.baseClass;

import java.time.Duration;

import org.company.project.automation.utilityClass.ReadPropertiesFiles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeMethod;

public class InitiateBrowser {
	
	public WebDriver driver;
	
	//before @Test methods are run
	@BeforeMethod
	public void launchBrowser() throws Exception {
		
		//launch browser by reading browser name from config.properties file
		if(ReadPropertiesFiles.readConfigFile("BrowserName").equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver(); //launch Chrome browser
		} 
		else if(ReadPropertiesFiles.readConfigFile("BrowserName").equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver(); //launch Firefox browser
		}
		else if(ReadPropertiesFiles.readConfigFile("BrowserName").equalsIgnoreCase("InternetExplorer")) {
			driver = new InternetExplorerDriver(); //launch InternetExplorer browser
		}
		else if(ReadPropertiesFiles.readConfigFile("BrowserName").equalsIgnoreCase("Safari")) {
			driver = new SafariDriver(); //launch Safari browser
		}
		else if(ReadPropertiesFiles.readConfigFile("BrowserName").equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver(); //launch Edge browser
		}
		/*else if(ReadPropertiesFiles.readConfigFile("BrowserName").equalsIgnoreCase("Opera")) {
			driver = new OperaDriver(); //launch Opera browser
		}*/
		else {
			driver = new ChromeDriver(); //launch Chrome browser as default browser
		}
				
		//pass the URL by reading URL from config.properties file
		driver.get(ReadPropertiesFiles.readConfigFile("ApplicationURL"));
		//maximize the window
		driver.manage().window().maximize();
		//page load wait 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
	
	//after @Test methods are run
	@AfterMethod
	public void closeBrowser() {
		//close all the tabs/windows in the browser
		driver.quit();
	}
}
