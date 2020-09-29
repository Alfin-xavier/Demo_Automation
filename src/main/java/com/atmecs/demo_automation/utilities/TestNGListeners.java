package com.atmecs.demo_automation.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNGListeners implements ITestListener
{

	public WebDriver driver;
	
	TakeScreenshots takeScreenshot = new TakeScreenshots(driver);

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName()+" "+"Started!!");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName()+" "+"Falied!!");

		try 
		{
			takeScreenshot.takeScreenshot(result.getName());
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println(result.getName()+" "+"Skipped!!");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}
}
