package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.generic.BaseTest;
import com.vtiger.generic.Excel;
import com.vtiger.pom.Login;
import com.vtiger.pom.Vtiger;

public class DeleteVendor extends BaseTest {
	@Test
	public static void vcatSearch() throws InterruptedException {
		String un = Excel.getData(XLPATH,SHEET,1,0);
		String pwd = Excel.getData(XLPATH,SHEET,1,1);
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
		l.delete();
		driver.switchTo().alert().accept();
		Vtiger vt=new Vtiger(driver);
		String title1=Excel.getData(XLPATH, SHEET, 2, 2);
		vt.verifyDeletedVendor(driver, 5, title1);
}
}
