package com.atmecs.demo_automation.pagehelper;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.demo_automation.constants.Constants;
import com.atmecs.demo_automation.helpers.Helpers;
import com.atmecs.demo_automation.utilities.Logging;
import com.atmecs.demo_automation.utilities.PropertyReader;

public class RegistrationFormFilling 
{
public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	Logging log;
	
	public RegistrationFormFilling(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void registerationTest(String firstname, String lastname, String address, String mail, String number, String password, String confirmpass) throws IOException 
	{
		helpers = new Helpers(driver);
		
		log = new Logging();

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		driver.findElement(By.xpath(locatorsFile.getProperty("firstname"))).sendKeys(firstname);
		
		log.info("Providing Firstname");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("lastname"))).sendKeys(lastname);
		
		log.info("Providing Lasttname");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("address"))).sendKeys(address);
		
		log.info("Providing Address");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("gmail"))).sendKeys(mail);
		
		log.info("Providing Mail_Id");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("mob"))).sendKeys(number);
		
		log.info("Providing Mobile Number");
		
		helpers.clickingButton(locatorsFile.getProperty("gender"));
		
		log.info("Selecting the gender");
		
		helpers.clickingButton(locatorsFile.getProperty("hobbies"));
		
		log.info("Selecting Hobbies");
		
		helpers.clickingButton(locatorsFile.getProperty("language"));
		
		log.info("Clicking Languages");
		
		helpers.clickingCountry(locatorsFile.getProperty("multiselect"));
		
		log.info("Selecting Languages");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("skills"), "PHP");
		
		log.info("Selecting value from dropdown");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("countries"), "India");
		
		log.info("Selecting value from dropdown");
		
		helpers.clickOperation(locatorsFile.getProperty("selectcountry"));
		
		log.info("Selecting Country");
		
		helpers.clickOperation(locatorsFile.getProperty("country"));
		
		log.info("Selecting Country");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("year"), "1996");
		
		log.info("Selecting Year");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("month"), "August");
		
		log.info("Selecting Month");
		
		helpers.selectFromDropDown(locatorsFile.getProperty("date"), "11");
		
		log.info("Selecting Date");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("password"))).sendKeys(password);
		
		log.info("Providing Password");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("confirmpass"))).sendKeys(confirmpass);
		
		log.info("Providing Confirm Password");
		
		helpers.clickingButton(locatorsFile.getProperty("submit"));
		
		log.debug("Clicking the Submit button");

	}
	
}