package com.atmecs.demo_automation.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.atmecs.demo_automation.basetest.BaseTest;
import com.atmecs.demo_automation.pagehelper.RegistrationFormFilling;
import com.atmecs.demo_automation.utilities.ReadDataFromExcel;

public class Registration extends BaseTest
{
	@DataProvider
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData("Form_Filling");
		
		return data;
		
	}
	
	@Test(dataProvider = "readData")
	public void registration(String firstname, String lastname, String address, String mail, String number, String password, String confirmpass)
	{
		RegistrationFormFilling form = new RegistrationFormFilling(driver);
		
		try 
		{
			form.registerationTest(firstname, lastname, address, mail, number, password, confirmpass);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
