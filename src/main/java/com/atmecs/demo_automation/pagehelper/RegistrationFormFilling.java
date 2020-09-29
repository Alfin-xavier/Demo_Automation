package com.atmecs.demo_automation.pagehelper;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.demo_automation.constants.Constants;
import com.atmecs.demo_automation.helpers.Helpers;
import com.atmecs.demo_automation.utilities.PropertyReader;

public class RegistrationFormFilling 
{
public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	public RegistrationFormFilling(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void registerationTest(String firstname, String lastname, String address, String mail, String number, String password, String confirmpass) throws IOException 
	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		data = PropertyReader.readProperties(Constants.DATAS);
		
		driver.findElement(By.xpath(locatorsFile.getProperty("firstname"))).sendKeys(firstname);
		
		driver.findElement(By.xpath(locatorsFile.getProperty("lastname"))).sendKeys(lastname);
		
		driver.findElement(By.xpath(locatorsFile.getProperty("address"))).sendKeys(address);
		
		driver.findElement(By.xpath(locatorsFile.getProperty("gmail"))).sendKeys(mail);
		
		driver.findElement(By.xpath(locatorsFile.getProperty("mob"))).sendKeys(number);
		
		helpers.clickingButton(locatorsFile.getProperty("gender"));
		
		helpers.clickingButton(locatorsFile.getProperty("hobbies"));
		
		helpers.clickingButton(locatorsFile.getProperty("language"));
		
		helpers.clickingCountry(locatorsFile.getProperty("multiselect"));
		
		helpers.selectFromDropDown(locatorsFile.getProperty("skills"), "PHP");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("countries"), "India");
		
		helpers.clickOperation(locatorsFile.getProperty("selectcountry"));
		
		helpers.clickOperation(locatorsFile.getProperty("country"));
		
		helpers.selectFromDropDown(locatorsFile.getProperty("year"), "1996");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("month"), "August");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("date"), "11");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("password"))).sendKeys(password);
		
		driver.findElement(By.xpath(locatorsFile.getProperty("confirmpass"))).sendKeys(confirmpass);
		
		helpers.clickingButton(locatorsFile.getProperty("submit"));

	}
	
}
