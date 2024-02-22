package org.company.project.automation.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator {

	// DataProvider annotation for reading multiple test data for multiple test sets
	@DataProvider(name = "staticdata")
	public Object[][] testdata() {

		// Java's 2D object class to read multiple test case data
		Object data[][] = { { "xyz1@abc.com", "pass1" }, { "xyz2@abc.com", "pass2" }, { "xyz3@abc.com", "pass3" } };
		return data;

	}
	
}
