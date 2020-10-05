package com.atmecs.demo_automation.utilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.atmecs.demo_automation.constants.Constants;

public class TakeScreenshots 
{
	public static void takeScreenshot(WebDriver driver, String screenshotName) 
	{
		try 
		{
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File(Constants.SCREEN_SHOTS+screenshotName+".png"));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}