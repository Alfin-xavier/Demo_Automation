package com.atmecs.demo_automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.atmecs.demo_automation.constants.Constants;

public class TakeScreenshots 
{
	public WebDriver driver;
	
	public TakeScreenshots(WebDriver driver)
	{
		this.driver = driver;
	}
	public  void takeScreenshot(String screenshotName) throws IOException 
	{
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File(Constants.SCREEN_SHOTS+screenshotName+".png"));
		
	}
}
