package com.atmecs.demo_automation.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name = "form_filling")
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData("Form_Filling");
		
		return data;
		
	}
}
