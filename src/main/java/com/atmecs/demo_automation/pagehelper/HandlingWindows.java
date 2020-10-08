package com.atmecs.demo_automation.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import com.atmecs.demo_automation.constants.Constants;
import com.atmecs.demo_automation.helpers.Helpers;
import com.atmecs.demo_automation.utilities.Logging;
import com.atmecs.demo_automation.utilities.PropertyReader;


public class HandlingWindows 
{
	public WebDriver driver;

	Helpers helpers;

	Properties locatorsFile;
	
	Logging log;

	public HandlingWindows(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void windowsHandling() throws IOException 
	{
		helpers = new Helpers(driver);
		
		log = new Logging();

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);

		helpers.clickingIcons(locatorsFile.getProperty("footer"), locatorsFile.getProperty("icons"));
		
		log.info("Clicking on the social icons");

		helpers.switchingTabs();
		
		log.info("Switching to tabs and handling those windows and getting titles");
	}

}