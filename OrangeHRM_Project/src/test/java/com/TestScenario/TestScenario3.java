package com.TestScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.Test.ConfigFileReader;

public class TestScenario3 {
	
	WebDriver driver;
	ConfigFileReader con;
	SoftAssert softAssert = new SoftAssert();
	By Login_username1;
	By Login_password;
	By Login_Button;
	By Logout_Button;
	By Logout_Button1;
	By Performance_Button;
	By ManageReviews1;
	By My_Reviews;
	By Evaluate_button;
	By Formal_management_Rating;
	By Formal_management_Comments;
	By General_Comment;
	By Evaluate_cancel;
	By Evaluate_save;
	By Evaluate_complete;
	
	public TestScenario3(WebDriver driver, ConfigFileReader con) {
		this.driver = driver;
		this.con = con;
		Login_username1 = By.xpath(con.username_Xpathpath());
		Login_password = By.name(con.password_Namepath());
		Login_Button = By.xpath(con.LoginButton());
		Logout_Button = By.cssSelector(con.Logout_button());
		Logout_Button1 = By.cssSelector(con.Logout_button1());
		Performance_Button = By.xpath(con.performance_xpath());
		ManageReviews1 = By.xpath(con.ManageReviews1());
		My_Reviews = By.xpath(con.ManageReviews2());
		Evaluate_button = By.xpath(con.Evaluate_button());
		Formal_management_Rating = By.xpath(con.Formal_management_Rating());
		Formal_management_Comments = By.xpath(con.Formal_management_Comments());
		General_Comment = By.xpath(con.General_Comment());
		Evaluate_cancel = By.xpath(con.Evaluate_cancel());
		Evaluate_save = By.xpath(con.Evaluate_save());
		Evaluate_complete = By.xpath(con.Evaluate_complete());
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
	
	public void Testcase13() {
		try {
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			driver.findElement(Performance_Button).click();
			driver.findElement(ManageReviews1).click();
			driver.findElement(My_Reviews).click();
			driver.findElement(Evaluate_button).click();
			
			driver.findElement(Formal_management_Rating).sendKeys("50");;
			driver.findElement(Formal_management_Comments).sendKeys("Abcd");
			driver.findElement(General_Comment).sendKeys("Hello");
			driver.findElement(Evaluate_cancel).click();
			
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
			driver.findElement(ManageReviews1).click();
			driver.findElement(My_Reviews).click();
			driver.findElement(Evaluate_button).click();
			
			driver.findElement(Formal_management_Rating).sendKeys("50");;
			driver.findElement(Formal_management_Comments).sendKeys("Abcd");
			driver.findElement(General_Comment).sendKeys("Hello");
			driver.findElement(Evaluate_save).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
