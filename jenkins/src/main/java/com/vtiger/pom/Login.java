package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
@FindBy(xpath="//input[@name='user_name']")
private WebElement un;
@FindBy(xpath="//input[@name='user_password']")
private WebElement pwd;
@FindBy(xpath="//input[@id='submitButton']")
private WebElement loginbutton;
@FindBy(xpath="//a[text()='More']")
private WebElement more;
@FindBy(xpath="//a[@name='Vendors']")
private WebElement vendor;
@FindBy(xpath="//td[@style='background-color:#efefef;height:340px']/descendant::td[@class='small']/b[1]")
private WebElement newvendor;
@FindBy(xpath="//input[@name='vendorname']")
private WebElement vendorname;
@FindBy(xpath="//tbody/tr[1]/td/div[@align='center']/descendant::input[@class='crmbutton small save']")
private WebElement save;
@FindBy(xpath="//img[@alt='Create Vendor...']")
private WebElement symbol;
@FindBy(xpath="//input[@id='email']")
private WebElement email;
@FindBy(xpath="//input[@id='category']")
private WebElement category;
@FindBy(xpath="//input[@id='phone']")
private WebElement phone;
@FindBy(xpath="//td[@style='padding-left:10px']/select[@id='qccombo']")
private WebElement quick;
@FindBy(xpath="//td[@style='padding-left:10px']/descendant::option[@value='Vendors']")
private WebElement vendor1;
@FindBy(xpath="//input[@name='vendorname']")
private WebElement name;
@FindBy(xpath="//input[@id='phone']")
private WebElement phoneno;
@FindBy(xpath="//tbody/tr[1]/td[1]/input[@name='button']")
private WebElement savebtn;
@FindBy(xpath="//input[@class='txtBox']")
private WebElement searchvno;
@FindBy(xpath="//select[@id='bas_searchfield']")
private WebElement searchscrolldown;
@FindBy(xpath="//select[@id='bas_searchfield']/option[@value='vendor_no']")
private WebElement vendorno;
@FindBy(xpath="//select[@id='bas_searchfield']/option[@value='vendorname']")
private WebElement venname;
@FindBy(xpath="//select[@id='bas_searchfield']/option[@value='phone']")
private WebElement venphn;
@FindBy(xpath="//select[@id='bas_searchfield']/option[@value='email']")
private WebElement venemail;
@FindBy(xpath="//select[@id='bas_searchfield']/option[@value='category']")
private WebElement vencategory;
@FindBy(xpath="//input[@name='submit']")
private WebElement searchbutton;
@FindBy(xpath="(//td[7]/a[1])[1]")//for edit
private WebElement edit;
@FindBy(xpath="//input[@name='vendorname']")
private WebElement editname;
@FindBy(xpath="//table[@class='lvt small']//tr[3]//a[text()='del']")
private WebElement delete;
public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void inputUN(String text)
{
	un.sendKeys(text);	
}
public void inputPWD(String text)
{
	pwd.sendKeys(text);	
}
public void loginClick()
{
	loginbutton.click();
}
public void more()
{
	more.click();
}
public void vendor() {
	vendor.click();
}
public void newVendor()
{
	newvendor.click();
}
public void vendorName(String text)
{
	vendorname.sendKeys(text);
}
public void save() {
	save.click();
}
public void symbol() {
	symbol.click();
}
public void email(String text) {
	email.sendKeys(text);
}
public void category(String text) {
	category.sendKeys(text);
}
public void phone(String text) {
	phone.sendKeys(text);
}
public void quick() {
	quick.click();
}
public void ven() {
	vendor1.click();
}
public void name(String text) {
	name.sendKeys(text);
}
public void phoneno(String text) {
	phoneno.sendKeys(text);
}
public void savebtn() {
	savebtn.click();
}
public void search(String text) {
	searchvno.sendKeys(text);
}
public void searchScrollDown() {
	searchscrolldown.click();
}
public void vendorno() {
	vendorno.click();
}
public void venname() {
	venname.click();
}
public void venphn() {
	venphn.click();
}
public void venemail() {
	venemail.click();
}
public void vencategory() {
	vencategory.click();
}
public void searchButton() {
	searchbutton.click();
}
public void edit() {
	edit.click();
}
public void editname() {
	editname.clear();
}
public void delete() {
	delete.click();
}
}
