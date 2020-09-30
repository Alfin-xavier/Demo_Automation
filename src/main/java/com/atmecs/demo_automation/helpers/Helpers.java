package com.atmecs.demo_automation.helpers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers
{
	public WebDriver driver;
	
	public Helpers(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickingIcons(String xpath, String xpath1)
	{
		WebElement subdriver = driver.findElement(By.xpath(xpath));
		WebElement subdriver1 = subdriver.findElement(By.xpath(xpath1));
		for(int i=0;i<subdriver1.findElements(By.tagName("a")).size();i++)
		{
			String link=Keys.chord(Keys.CONTROL,Keys.ENTER);
			subdriver1.findElements(By.tagName("a")).get(i).sendKeys(link);
		}
		
	}
	public void switchingTabs() 
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) 
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
	}
	
	public void textData(String xpath, String value)
	{
		 WebElement susername = driver.findElement(By.xpath(xpath));
		  susername.sendKeys(value);
	}
	public void selectFromDropDown(String xpath, String value)
	{
		Select skills = new Select(driver.findElement(By.xpath(xpath)));
		skills.selectByValue(value);
	}
	public void clickingButton(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement submit = driver.findElement(By.xpath(xpath));
		
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		
		submit.click();
	}
	public void clickOperation(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	public void clickingCountry(String xpath)
	{
		for(int i=1;i<=4;i++)
			driver.findElement(By.xpath(xpath)).click();
			
	}
	
}
