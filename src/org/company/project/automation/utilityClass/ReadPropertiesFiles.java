package org.company.project.automation.utilityClass;

import java.io.FileReader;
import java.util.Properties;

//reading properties file class
public class ReadPropertiesFiles {
	
	//reading config.properties for configuration settings
	public static String readConfigFile(String key) throws Exception {
		
		FileReader fileReader = new FileReader("./TestData/config.properties");
		Properties prop = new Properties();
		
		prop.load(fileReader);
		return prop.get(key).toString();
	}
	
	//reading element.properties for element locator settings
		public static String readElementFile(String key) throws Exception {
			
			FileReader fileReader = new FileReader("./TestData/element.properties");
			Properties prop = new Properties();
			
			prop.load(fileReader);
			return prop.get(key).toString();
		}
}
