package com.TestScenario;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.Test.ConfigFileReader;

public class TestScenario5 {
	

	WebDriver driver;
	ConfigFileReader con;
	SoftAssert softAssert = new SoftAssert();
	By Login_username1;
	By Login_password;
	By Login_Button;
	By Logout_Button;
	By Logout_Button1;
	By Performance_Button;
	By EmployeeTrackers_xpath;
	By Emp_Tracker_Name;
	By Include_xpath1;
	By Include_xpath2;
	By Search_xpath;
	By Reset_xpath;
	
	public TestScenario5(WebDriver driver, ConfigFileReader con) {
		this.driver = driver;
		this.con = con;
		Login_username1 = By.xpath(con.username_Xpathpath());
		Login_password = By.name(con.password_Namepath());
		Login_Button = By.xpath(con.LoginButton());
		Logout_Button = By.cssSelector(con.Logout_button());
		Logout_Button1 = By.cssSelector(con.Logout_button1());
		Performance_Button = By.xpath(con.performance_xpath());
		EmployeeTrackers_xpath = By.xpath(con.EmployeeTrackers_xpath());
		
		Emp_Tracker_Name = By.xpath(con.Emp_Tracker_Name());
		Include_xpath1 = By.xpath(con.Include_xpath1());
		Include_xpath2 = By.xpath(con.Include_xpath2());
		Search_xpath = By.xpath(con.Search_xpath());
		Reset_xpath = By.xpath(con.Reset_xpath());
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
			driver.findElement(EmployeeTrackers_xpath).click();
			driver.findElement(Emp_Tracker_Name).sendKeys("Charlie Carter");
			
			WebElement dd = driver.findElement(Include_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(Include_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Current employee Only")) 
				{
					webElement.click();
					break;
				}
			}
			 
			 driver.findElement(Search_xpath).click();
			
			
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
			driver.findElement(EmployeeTrackers_xpath).click();
			driver.findElement(Emp_Tracker_Name).sendKeys("Charlie Carter");
			
			WebElement dd = driver.findElement(Include_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(Include_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Current employee Only")) 
				{
					webElement.click();
					break;
				}
			}
			 
			 driver.findElement(Reset_xpath).click();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
