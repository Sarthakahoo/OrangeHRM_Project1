package com.TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Test.ConfigFileReader;

public class TestScenario4 {
	
	WebDriver driver;
	ConfigFileReader con;
	SoftAssert softAssert = new SoftAssert();
	By Login_username1;
	By Login_password;
	By Login_Button;
	By Logout_Button;
	By Logout_Button1;
	By Performance_Button;
	By MyTrackers_xpath;
	By MyTracker_View;
	By Add_Log;
	By Log_Xpath;
	By Log_Comment_Xpath;
	By Log_save;
	By Log_cancel;
	
	public TestScenario4(WebDriver driver, ConfigFileReader con) {
		this.driver = driver;
		this.con = con;
		Login_username1 = By.xpath(con.username_Xpathpath());
		Login_password = By.name(con.password_Namepath());
		Login_Button = By.xpath(con.LoginButton());
		Logout_Button = By.cssSelector(con.Logout_button());
		Logout_Button1 = By.cssSelector(con.Logout_button1());
		Performance_Button = By.xpath(con.performance_xpath());
		MyTrackers_xpath = By.xpath(con.MyTrackers_xpath());
		
		MyTracker_View = By.xpath(con.MyTracker_View());
		Add_Log = By.xpath(con.Add_Log());
		Log_Xpath = By.xpath(con.Log_Xpath());
		Log_Comment_Xpath = By.xpath(con.Log_Comment_Xpath());
		Log_save = By.xpath(con.Log_save());
		Log_cancel = By.xpath(con.Log_cancel());
		PageFactory.initElements(driver, this);
		
	}
	
	public void open(String url) {
		driver.get(url);
		System.out.println("Url initiated. ");
	}

	public void logout() {
		try {
			Thread.sleep(2000);
			driver.findElement(Logout_Button).click();
			Thread.sleep(2000);
			driver.findElement(Logout_Button1).click();
			System.out.println("Logout completed.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void Testcase1() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			driver.findElement(MyTrackers_xpath).click();
			driver.findElement(MyTracker_View).click();
			driver.findElement(Add_Log).click();
			driver.findElement(Log_Xpath).sendKeys("qwe");
			driver.findElement(Log_Comment_Xpath).sendKeys("sasfc");
			driver.findElement(Log_save).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void Testcase2() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			driver.findElement(MyTrackers_xpath).click();
			driver.findElement(MyTracker_View).click();
			driver.findElement(Add_Log).click();
			driver.findElement(Log_Xpath).sendKeys("");
			driver.findElement(Log_Comment_Xpath).sendKeys("");
			driver.findElement(Log_save).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Testcase3() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			driver.findElement(MyTrackers_xpath).click();
			driver.findElement(MyTracker_View).click();
			driver.findElement(Add_Log).click();
			driver.findElement(Log_Xpath).sendKeys("qwe");
			driver.findElement(Log_Comment_Xpath).sendKeys("sasfc");
			driver.findElement(Log_cancel).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
