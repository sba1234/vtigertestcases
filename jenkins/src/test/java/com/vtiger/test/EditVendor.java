package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.generic.BaseTest;
import com.vtiger.generic.Excel;
import com.vtiger.pom.Login;
import com.vtiger.pom.Vtiger;

public class EditVendor extends BaseTest {
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
		l.edit();
		l.editname();
		String edit = Excel.getData(XLPATH, SHEET, 3, 0);
		l.name(edit);
		Thread.sleep(2000);
		l.save();
		Vtiger vt=new Vtiger(driver);
		String title1=Excel.getData(XLPATH, SHEET, 2, 2);
		vt.verifyEditedVendor(driver, 5, title1);

}
}
