package com.TestScenario;

import java.lang.module.Configuration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import com.Test.ConfigFileReader;


public class TestScenario2 {

	WebDriver driver;
	ConfigFileReader con;
	SoftAssert softAssert = new SoftAssert();
	By Login_username1;
	By Login_password;
	By Login_Button;
	By Performance_Button;
	By configure_xpath;
	By KPI_search_button;
	By Logout_Button;
	By Logout_Button1;
	By jobtitle_xpath;
	By configure_CSS;
	By KPI_Option_xpath;
	By DB_Admin;
	By KPI_Reset;
	By KPI_Add_Save;
	By KPI_Add_button;
	By Key_Performance_Indicator;
	By Minimum_Rating1;
	By Maximum_Rating1;
	By jobtitle_xpath1;
	By jobtitle_xpath2;
	By Edit_button1;
	By Make_default_button1;
	By KPI_Cancel;
	By KPI_Alert_delete;
	By KPI_delete;
	By Config_Trackers;
	By Tracker_Employee_Name;
	By Employee_Tracker_Reset; 
	By Employee_Tracker_search;
	By Employee_Tracker_add;
	By Tracker_EmployeeName_Add;
	By Tracker_Name; 
	By Tracker_Reviewers; 
	By Tracker_Save; 
	By Tracker_Cancel;
	By Tracker_delete;

	public TestScenario2(WebDriver driver, ConfigFileReader con) {
		this.driver = driver;
		this.con = con;
		Login_username1 = By.xpath(con.username_Xpathpath());
		Login_password = By.name(con.password_Namepath());
		Login_Button = By.xpath(con.LoginButton());
		Performance_Button = By.xpath(con.performance_xpath());
		configure_xpath = By.xpath(con.configure_xpath());
		KPI_search_button = By.cssSelector(con.KPI_search());
		Logout_Button = By.cssSelector(con.Logout_button());
		Logout_Button1 = By.cssSelector(con.Logout_button1());
		jobtitle_xpath = By.xpath(con.jobtitle_xpath());
		configure_CSS = By.cssSelector(con.configure_CSSSelector());
		KPI_Option_xpath = By.xpath(con.KPI_Option_xpath());
		DB_Admin=By.xpath(con.DB_Admin());
		KPI_Reset = By.xpath(con.KPI_Reset());
		KPI_Add_Save = By.xpath(con.KPI_Add_Save());
		KPI_Add_button = By.xpath(con.KPI_Add_button());
		Key_Performance_Indicator = By.xpath(con.Key_Performance_Indicator());
		Minimum_Rating1=By.xpath(con.Minimum_Rating1());
		Maximum_Rating1=By.xpath(con.Maximum_Rating1());
		jobtitle_xpath1=By.xpath(con.jobtitle_xpath1());
		jobtitle_xpath2=By.xpath(con.jobtitle_xpath2());
		Edit_button1 = By.xpath(con.Edit_button1());
		Make_default_button1 = By.xpath(con.Make_default_button1());
		KPI_Cancel = By.xpath(con.KPI_Cancel());
		KPI_Alert_delete = By.xpath(con.KPI_Alert_delete());
		KPI_delete = By.xpath(con.KPI_delete());
		Config_Trackers = By.xpath(con.Config_Trackers());
		Tracker_Employee_Name = By.xpath(con.Tracker_Employee_Name());
		Employee_Tracker_Reset=By.xpath(con.Employee_Tracker_Reset());
		Employee_Tracker_search= By.xpath(con.Employee_Tracker_search());
		Employee_Tracker_add = By.xpath(con.Employee_Tracker_add());
		Tracker_EmployeeName_Add  = By.xpath(con.Tracker_EmployeeName_Add());
		Tracker_Name  = By.xpath(con.Tracker_Name());
		Tracker_Reviewers = By.xpath(con.Tracker_Reviewers());  
		Tracker_Save = By.xpath(con.Tracker_Save());	
		Tracker_Cancel = By.xpath(con.Tracker_Cancel());
		Tracker_delete = By.xpath(con.Tracker_delete());
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
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			WebElement dd = driver.findElement(jobtitle_xpath);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(DB_Admin);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Database Administrator")) 
				{
					webElement.click();
					break;
				}
			}
			driver.findElement(KPI_search_button).click();
			

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
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			WebElement dd = driver.findElement(jobtitle_xpath);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(DB_Admin);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Database Administrator")) 
				{
					webElement.click();
					break;
				}
			}
			driver.findElement(KPI_Reset).click();
			

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
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			driver.findElement(KPI_Add_button).click();
			driver.findElement(Key_Performance_Indicator).sendKeys("Testing");
			driver.findElement(Minimum_Rating1).sendKeys("0");
			driver.findElement(Maximum_Rating1).sendKeys("100");
			WebElement dd = driver.findElement(jobtitle_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(jobtitle_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Account Assistant")) 
				{
					webElement.click();
					break;
				}
			}
			 
			 
			driver.findElement(KPI_Add_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void Testcase4() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			WebElement dd = driver.findElement(jobtitle_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(jobtitle_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Account Assistant")) 
				{
					webElement.click();
					break;
				}
			}
			 
			 
			driver.findElement(KPI_search_button).click();
			driver.findElement(Edit_button1).click();
			driver.findElement(Make_default_button1).click();
			driver.findElement(KPI_Add_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Testcase5() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			WebElement dd = driver.findElement(jobtitle_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(jobtitle_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Account Assistant")) 
				{
					webElement.click();
					break;
				}
			}
			 
			 
			driver.findElement(KPI_search_button).click();
			driver.findElement(Edit_button1).click();
			driver.findElement(Key_Performance_Indicator).sendKeys("");
			driver.findElement(Minimum_Rating1).sendKeys("");
			driver.findElement(Maximum_Rating1).sendKeys("");
			driver.findElement(KPI_Add_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Testcase6() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			WebElement dd = driver.findElement(jobtitle_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(jobtitle_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Account Assistant")) 
				{
					webElement.click();
					break;
				}
			}
			 
			 
			driver.findElement(KPI_search_button).click();
			driver.findElement(Edit_button1).click();
			driver.findElement(Minimum_Rating1).sendKeys("-1");
			driver.findElement(KPI_Add_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Testcase7() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			WebElement dd = driver.findElement(jobtitle_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(jobtitle_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Account Assistant")) 
				{
					webElement.click();
					break;
				}
			}
			 
			 
			driver.findElement(KPI_search_button).click();
			driver.findElement(Edit_button1).click();
			driver.findElement(Maximum_Rating1).sendKeys("101");
			driver.findElement(KPI_Add_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Testcase8() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			WebElement dd = driver.findElement(jobtitle_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(jobtitle_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Account Assistant")) 
				{
					webElement.click();
					break;
				}
			}
			driver.findElement(KPI_search_button).click();
			driver.findElement(Edit_button1).click();
			driver.findElement(Key_Performance_Indicator).sendKeys("Testing1");
			driver.findElement(KPI_Cancel).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Testcase9() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement config = driver.findElement(configure_xpath);
			js.executeScript("arguments[0].click();", config);
			Thread.sleep(2000);
			
			WebElement KPI_link_xpath = driver.findElement(KPI_Option_xpath);
			js.executeScript("arguments[0].click();", KPI_link_xpath);
			Thread.sleep(2000);
			
			WebElement dd = driver.findElement(jobtitle_xpath1);
			dd.click();
			Thread.sleep(2000);
			
			List<WebElement> list = driver.findElements(jobtitle_xpath2);
			Iterator<WebElement> iterator = list.iterator();
			 while (iterator.hasNext()) {
				WebElement webElement = (WebElement) iterator.next();
				System.out.println(webElement.getText());
				if(webElement.getText().equals("Account Assistant")) 
				{
					webElement.click();
					break;
				}
			}
			 
			driver.findElement(KPI_search_button).click();
			driver.findElement(KPI_delete).click();
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void Testcase10() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			
			driver.findElement(configure_xpath).click();
			Thread.sleep(2000);
			
			driver.findElement(Config_Trackers).click();
			Thread.sleep(2000);
			
			driver.findElement(Tracker_Employee_Name).sendKeys("Anthony");
			Thread.sleep(2000);
			
			driver.findElement(Employee_Tracker_search).click();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Testcase11() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			
			driver.findElement(configure_xpath).click();
			Thread.sleep(2000);
			
			driver.findElement(Config_Trackers).click();
			Thread.sleep(2000);
			
			driver.findElement(Tracker_Employee_Name).sendKeys("Anthony");
			Thread.sleep(2000);
			
			driver.findElement(Employee_Tracker_Reset).click();
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void Testcase12() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			
			driver.findElement(configure_xpath).click();
			Thread.sleep(2000);
			
			driver.findElement(Config_Trackers).click();
			Thread.sleep(2000);
			driver.findElement(Employee_Tracker_add).click();
			driver.findElement(Tracker_Name).sendKeys("Tracker made for Anthoni Raj samuvel");;
			driver.findElement(Tracker_EmployeeName_Add).sendKeys("Anthoni Raj samuvel");;
			driver.findElement(Tracker_Reviewers).sendKeys("shahiq ahmed M | Mahmoud Ali Ahmed");;
			driver.findElement(Tracker_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Testcase13() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			
			driver.findElement(configure_xpath).click();
			Thread.sleep(2000);
			
			driver.findElement(Config_Trackers).click();
			Thread.sleep(2000);
			driver.findElement(Employee_Tracker_add).click();
			driver.findElement(Tracker_Name).sendKeys("");;
			driver.findElement(Tracker_EmployeeName_Add).sendKeys("");;
			driver.findElement(Tracker_Reviewers).sendKeys("");;
			driver.findElement(Tracker_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Testcase14() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			
			driver.findElement(configure_xpath).click();
			Thread.sleep(2000);
			
			driver.findElement(Config_Trackers).click();
			Thread.sleep(2000);
			driver.findElement(Employee_Tracker_add).click();
			driver.findElement(Tracker_Name).sendKeys("Tracker made for qwerty");;
			driver.findElement(Tracker_EmployeeName_Add).sendKeys("qwerty zxcv");;
			driver.findElement(Tracker_Reviewers).sendKeys("shahiq ahmed M");;
			driver.findElement(Tracker_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Testcase15() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			
			driver.findElement(configure_xpath).click();
			Thread.sleep(2000);
			
			driver.findElement(Config_Trackers).click();
			Thread.sleep(2000);
			driver.findElement(Employee_Tracker_add).click();
			driver.findElement(Tracker_Name).sendKeys("Tracker made for Anthoni Raj samuvel");;
			driver.findElement(Tracker_EmployeeName_Add).sendKeys("Jacqueline White");;
			driver.findElement(Tracker_Reviewers).sendKeys("qsed aa");;
			driver.findElement(Tracker_Save).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Testcase16() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			Thread.sleep(2000);
			
			driver.findElement(configure_xpath).click();
			Thread.sleep(2000);
			
			driver.findElement(Config_Trackers).click();
			Thread.sleep(2000);
			
			driver.findElement(Tracker_Employee_Name).sendKeys("Jacqueline White");
			driver.findElement(Employee_Tracker_search).click();
			driver.findElement(Tracker_delete).click();
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
