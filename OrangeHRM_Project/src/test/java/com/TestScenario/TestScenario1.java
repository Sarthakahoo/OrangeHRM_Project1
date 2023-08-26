package com.TestScenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.Test.ConfigFileReader;

public class TestScenario1 {
	WebDriver driver;
	ConfigFileReader con;
	SoftAssert softAssert = new SoftAssert();
	By Login_username1;
	By Login_password;
	By Login_Button;
	By Logout_Button;
	By Logout_Button1;

	public TestScenario1(WebDriver driver, ConfigFileReader con) {
		this.driver = driver;
		this.con = con;
		Login_username1 = By.xpath(con.username_Xpathpath());
		Login_password = By.name(con.password_Namepath());
		Login_Button = By.xpath(con.LoginButton());
		Logout_Button = By.cssSelector(con.Logout_button());
		Logout_Button1 = By.cssSelector(con.Logout_button1());
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
			String currentUrl = driver.getCurrentUrl();
			System.out.println("currentUrl1: " + currentUrl);
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			Thread.sleep(3000);
			softAssert.assertNotEquals(currentUrl,
					"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			System.out.println("Entered valid username and password. TestCase1 completed. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Testcase2() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("currentUrl2: " + currentUrl);
			driver.findElement(Login_username1).sendKeys(con.username1());
			driver.findElement(Login_password).sendKeys(con.password2());
			driver.findElement(Login_Button).click();
			softAssert.assertNotEquals(currentUrl,
					"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			System.out.println("Entered valid username and invalid password. TestCase2 completed. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Testcase3() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("currentUrl3: " + currentUrl);
			driver.findElement(Login_username1).sendKeys(con.username2());
			driver.findElement(Login_password).sendKeys(con.password1());
			driver.findElement(Login_Button).click();
			softAssert.assertNotEquals(currentUrl,
					"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			System.out.println("Entered invalid username and valid password. TestCase3 completed. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Testcase4() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("currentUrl4: " + currentUrl);
			driver.findElement(Login_username1).sendKeys(con.username2());
			driver.findElement(Login_password).sendKeys(con.password2());
			driver.findElement(Login_Button).click();
			softAssert.assertNotEquals(currentUrl,
					"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			System.out.println("Entered invalid username and invalid password. TestCase4 completed. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
