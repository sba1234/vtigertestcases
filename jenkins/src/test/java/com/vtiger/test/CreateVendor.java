package com.vtiger.test;

import org.testng.annotations.Test;

import com.vtiger.generic.BaseTest;
import com.vtiger.generic.Excel;
import com.vtiger.pom.Login;
import com.vtiger.pom.Vtiger;

public class CreateVendor extends BaseTest {
@Test
public static void createvendor() throws InterruptedException {
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
	Thread.sleep(2000);
	l.symbol();
	String name = Excel.getData(XLPATH, SHEET, 3, 0);
	String email = Excel.getData(XLPATH, SHEET,3 , 1);
	String category = Excel.getData(XLPATH, SHEET, 4,0);
	String phone = Excel.getData(XLPATH, SHEET, 4, 1);
	l.vendorName(name);
	Thread.sleep(2000);
	l.email(email);
	Thread.sleep(2000);
	l.category(category);
	Thread.sleep(2000);
	l.phone(phone);
	l.save();
	String title1=Excel.getData(XLPATH, SHEET, 2, 2);
	Vtiger vt=new Vtiger(driver);
	vt.verifyVendorPageIsDisplayed1(driver, 5, title1);
	
}
@Test
public static void quickcreatevendor() throws InterruptedException {
	String un = Excel.getData(XLPATH,SHEET,1,0);
	String pwd = Excel.getData(XLPATH,SHEET,1,1);
	Login l = new Login(driver);
	l.inputUN(un);
	Thread.sleep(2000);
	l.inputPWD(pwd);
	Thread.sleep(2000);
	l.loginClick();
	Thread.sleep(2000);
	l.quick();
	Thread.sleep(2000);
	l.ven();
	String name = Excel.getData(XLPATH, SHEET, 6, 0);
	String phone = Excel.getData(XLPATH, SHEET, 6, 1);
	l.name(name);
	Thread.sleep(2000);
	l.phoneno(phone);
	Thread.sleep(2000);
	l.savebtn();
	String title1=Excel.getData(XLPATH, SHEET, 2, 2);
	Vtiger vt=new Vtiger(driver);
	vt.verifyVendorPageIsDisplayed2(driver, 5, title1);
}	
@Test
public static void vnoSearch() throws InterruptedException {
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
	String vno = Excel.getData(XLPATH, SHEET, 8, 0);
	l.search(vno);
	Thread.sleep(2000);
	l.vendorno();
	l.searchButton();
	Thread.sleep(2000);
	String title1=Excel.getData(XLPATH, SHEET, 2, 2);
	Vtiger vt=new Vtiger(driver);
	vt.verifySearchedVendorIsDisplayedWithVennum(driver, 5, title1);
	
}
@Test
public static void vnameSearch() throws InterruptedException {
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
	String vname = Excel.getData(XLPATH, SHEET, 6, 0);
	l.search(vname);
	Thread.sleep(2000);
	l.venname();
	l.searchButton();
	Thread.sleep(2000);
	String title1=Excel.getData(XLPATH, SHEET, 2, 2);
	Vtiger vt=new Vtiger(driver);
	vt.verifySearchedVendorIsDisplayedWithName(driver, 5, title1);
}
@Test
public static void vemailSearch() throws InterruptedException {
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
	String vemail = Excel.getData(XLPATH, SHEET, 3, 1);
	l.search(vemail);
	Thread.sleep(2000);
	l.venemail();
	l.searchButton();
	Thread.sleep(2000);
	String title1=Excel.getData(XLPATH, SHEET, 2, 2);
	Vtiger vt=new Vtiger(driver);
	vt.verifySearchedVendorIsDisplayedWithEmail(driver, 5, title1);
}
@Test
public static void vphnSearch() throws InterruptedException {
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
	String vphn = Excel.getData(XLPATH, SHEET, 4, 1);
	l.search(vphn);
	Thread.sleep(2000);
	l.venphn();
	l.searchButton();
	Thread.sleep(2000);
	String title1=Excel.getData(XLPATH, SHEET, 2, 2);
	Vtiger vt=new Vtiger(driver);
	vt.verifySearchedVendorIsDisplayedWithPhoneno(driver, 5, title1);
}
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
	String vcat = Excel.getData(XLPATH, SHEET, 4, 0);
	l.search(vcat);
	Thread.sleep(2000);
	l.vencategory();
	l.searchButton();
	Thread.sleep(2000);
	String title1=Excel.getData(XLPATH, SHEET, 2, 2);
	Vtiger vt=new Vtiger(driver);
	vt.verifySearchedVendorIsDisplayedWithCategory(driver, 5, title1);
}
}

