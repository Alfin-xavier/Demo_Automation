package com.atmecs.demo_automation.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.demo_automation.basetest.BaseTest;
import com.atmecs.demo_automation.pagehelper.HandlingWindows;

public class HandlingIconWindows extends BaseTest
{
	@Test
	public void handlingIconWindows() throws IOException
	{
		HandlingWindows windows = new HandlingWindows(driver);
		
		windows.windowsHandling();
	}
	
}
