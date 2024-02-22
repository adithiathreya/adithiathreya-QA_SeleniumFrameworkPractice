package org.company.project.automation.utilityClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	static WebDriver driver;
	
	public static void saveResult(WebDriver driver, String fileName) throws IOException {
		
		//takes screenshot
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		
		//save into file
		File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File resultFile = new File("./ResultScreenshot/" + fileName + ".png");
		FileUtils.copyFile(screenshotFile, resultFile);
		
	}
	
}
