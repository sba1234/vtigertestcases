package com.vtiger.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.vtiger.generic.IAutoConstant;
import com.vtiger.generic.Screenshot;



public class Vtiger implements IAutoConstant {
	public  Vtiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public  void verifyHomePageIsDisplayed(WebDriver driver,long ETO,String title) throws EncryptedDocumentException, InvalidFormatException 
	{	
		
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("HomePage is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Home Page is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifyVendorPageIsDisplayed(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("newly create vendor page is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("newly create vendor Page is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifyVendorPageIsDisplayed1(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("newly create vendor page is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("newly create vendor Page is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifyVendorPageIsDisplayed2(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("newly create vendor page is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("newly create vendor Page is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifySearchedVendorIsDisplayedWithVennum(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("searched vendor with vennumber is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("searched vendor with vennumber is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifySearchedVendorIsDisplayedWithName(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("searched vendor with name is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("searched vendor with name is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifySearchedVendorIsDisplayedWithEmail(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("searched vendor with email is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("searched vendor with email is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifySearchedVendorIsDisplayedWithPhoneno(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("searched vendor with phoneno is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("searched vendor with phoneno is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifySearchedVendorIsDisplayedWithCategory(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("searched vendor with category is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("searched vendor with category is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifyEditedVendor(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Edited vendor is Displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Edited vendor is not displayed",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
	public void verifyDeletedVendor(WebDriver driver,long ETO,String title) {
		try 
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Vendor is deleted",true);
		}
		catch(Exception e)
		{
			Reporter.log("Vendor is not deleted",true);
			try {
				Screenshot.getScreenShot(driver, title);
			
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
}
