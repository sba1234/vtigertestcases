package com.vtiger.test;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import com.vtiger.generic.BaseTest;
import com.vtiger.generic.Excel;
import com.vtiger.pom.Login;
import com.vtiger.pom.Vtiger;
public class TestLogin extends BaseTest{
	
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
	String un = Excel.getData(XLPATH,SHEET,1,0);
	String pwd = Excel.getData(XLPATH,SHEET,1,1);
	String title= Excel.getData(XLPATH,SHEET,1,2);
	System.out.println(un+" "+pwd+" "+title);
	Login l = new Login(driver);
	l.inputUN(un);
	Thread.sleep(2000);
	l.inputPWD(pwd);
	Thread.sleep(2000);
	l.loginClick();
	Thread.sleep(2000);
	
	 Vtiger vt = new Vtiger(driver);
	vt.verifyHomePageIsDisplayed(driver, 5, title);
	}
	@Test
	public static void createvendor() throws InterruptedException {
		String un = Excel.getData(XLPATH,SHEET,1,0);
		String pwd = Excel.getData(XLPATH,SHEET,1,1);
		String title= Excel.getData(XLPATH,SHEET,1,2);
		Login l = new Login(driver);
		l.inputUN(un);
		Thread.sleep(2000);
		l.inputPWD(pwd);
		Thread.sleep(2000);
		l.loginClick();
		Thread.sleep(2000);
		l.more();
		Thread.sleep(2000);
		l.vendor();
		Thread.sleep(2000);
		l.newVendor();
		Thread.sleep(2000);
		String name = Excel.getData(XLPATH, SHEET, 2, 0);
		l.vendorName(name);
		l.save();
		String title1 = Excel.getData(XLPATH, SHEET, 2, 2);
		Vtiger vt = new Vtiger(driver);
		vt.verifyVendorPageIsDisplayed1(driver, 3, title1);
		
	}
}
