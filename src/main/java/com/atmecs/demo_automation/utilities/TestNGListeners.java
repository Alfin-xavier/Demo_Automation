package com.atmecs.demo_automation.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener
{

	public static WebDriver driver;
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getName()+" "+"Started!!");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName()+" "+"Passed!!");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName()+" "+"Failed!!");

		TakeScreenshots.takeScreenshot(driver, result.getName());
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
