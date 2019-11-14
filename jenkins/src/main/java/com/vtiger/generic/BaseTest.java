package com.vtiger.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.vtiger.generic.Excel;
import com.vtiger.generic.IAutoConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String browser_name="";
	static int r=1,c=0;
	static
	{		
			try {
			fis = new FileInputStream(CONFIGPATH);
			Properties con= new Properties();
			con.load(fis);
			browser_name=con.getProperty("browser");
			if(browser_name.contains("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
			}
			else
			{
				System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@BeforeMethod()
	public static void beforeM() 
		{
		if(browser_name.contains("chrome"))
			{
			 driver = new ChromeDriver();
			}
			else
			{
			driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.get(URL);
		}

	@AfterMethod
	public static void afterM(ITestResult result) throws Throwable
	{
		int status=result.getStatus();
		String testcase = result.getName();
		if (status==1) {
			Reporter.log(testcase + "is pass", true);
			Excel.setData(testcase,"pass",r,c,SHEET,write_data);
			r++;
			c=0;
		}
		else {
			Reporter.log(testcase+ "is fail", true);
			Screenshot.getScreenShot(driver,testcase);
			Excel.setData(testcase,"pass",r,c,SHEET,write_data);
			r++;
			c=0;
		}
	driver.close();
	}

}
