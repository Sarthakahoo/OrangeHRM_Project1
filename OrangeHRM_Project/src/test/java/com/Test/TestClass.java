package com.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.TestScenario.TestScenario1;
import com.TestScenario.TestScenario2;
import com.TestScenario.TestScenario3;
import com.TestScenario.TestScenario4;
import com.TestScenario.TestScenario5;

public class TestClass {
	private WebDriver driver;
	ConfigFileReader con;

	@BeforeTest
	public void setUp() {
		con = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", con.getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(con.getImplicitlyWait(), TimeUnit.SECONDS);
		System.out.println("Setup method is initiated in testclass");
	}

	@Test(priority = 0)
	public void TestScenario1_1() {
		try {
			System.out.println("Testscenario1 started");
			TestScenario1 ts1 = new TestScenario1(driver, con);

			Thread.sleep(3000);
			ts1.open(con.getApplicationUrl());
			ts1.Testcase1();
			ts1.logout();
			System.out.println("Testcase1 class completed. ");

			Thread.sleep(3000);
			ts1.open(con.getApplicationUrl());
			ts1.Testcase2();
			System.out.println("Testcase2 class completed. ");

			Thread.sleep(3000);
			ts1.open(con.getApplicationUrl());
			ts1.Testcase3();
			System.out.println("Testcase3 class completed. ");

			Thread.sleep(3000);
			ts1.open(con.getApplicationUrl());
			ts1.Testcase4();
			System.out.println("Testcase4 class completed. ");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	public void TestScenario2_1() {
		try {
			System.out.println("Testscenario2 started");
			TestScenario2 ts2 = new TestScenario2(driver, con);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase1();
			ts2.logout();
			System.out.println("Testcase2 completed. ");

			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase2();
			ts2.logout();
			System.out.println("Testcase2 class completed. ");

			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase3();
			ts2.logout();
			System.out.println("Testcase3 class completed. ");

			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase4();
			ts2.logout();
			System.out.println("Testcase4 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase5();
			ts2.logout();
			System.out.println("Testcase5 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase6();
			ts2.logout();
			System.out.println("Testcase6 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase7();
			ts2.logout();
			System.out.println("Testcase7 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase8();
			ts2.logout();
			System.out.println("Testcase8 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase9();
			ts2.logout();
			System.out.println("Testcase9 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase10();
			ts2.logout();
			System.out.println("Testcase10 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase11();
			ts2.logout();
			System.out.println("Testcase11 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase12();
			ts2.logout();
			System.out.println("Testcase12 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase13();
			ts2.logout();
			System.out.println("Testcase13 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase14();
			ts2.logout();
			System.out.println("Testcase14 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase15();
			ts2.logout();
			System.out.println("Testcase15 class completed. ");
			
			Thread.sleep(3000);
			ts2.open(con.getApplicationUrl());
			ts2.Testcase16();
			ts2.logout();
			System.out.println("Testcase16 class completed. ");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Testscenario2 ended");
	}

	@Test(priority = 2)
	public void TestScenario3_1() {
		try {
			System.out.println("Testscenario3 started");
			TestScenario3 ts3 = new TestScenario3(driver, con);
			
			ts3.open(con.getApplicationUrl());
			ts3.Testcase13();
			ts3.logout();
			Thread.sleep(3000);

			ts3.open(con.getApplicationUrl());
			ts3.Testcase14();
			ts3.logout();
			System.out.println("Testcase3 class completed. ");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Testscenario3 ended");
	}

	@Test(priority = 3)
	public void TestScenario4_1() {
		try {
		System.out.println("Testscenario4 started");
		
		TestScenario4 ts4 = new TestScenario4(driver, con);
		
		ts4.open(con.getApplicationUrl());
		ts4.Testcase1();
		ts4.logout();
		System.out.println("Testcase1 class completed. ");
		
		ts4.open(con.getApplicationUrl());
		ts4.Testcase2();
		ts4.logout();
		System.out.println("Testcase2 class completed. ");
		
		ts4.open(con.getApplicationUrl());
		ts4.Testcase3();
		ts4.logout();
		System.out.println("Testcase3 class completed. ");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		System.out.println("Testscenario4 ended");
	}

	@Test(priority = 4)
	public void TestScenario5_1() {
		try {
		System.out.println("Testscenario5 started");
		TestScenario5 ts5 = new TestScenario5(driver, con);
		
		ts5.open(con.getApplicationUrl());
		ts5.Testcase1();
		ts5.logout();
		System.out.println("Testcase1 class completed. ");
		
		ts5.open(con.getApplicationUrl());
		ts5.Testcase3();
		ts5.logout();
		System.out.println("Testcase3 class completed. ");
		
	} catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println("Testscenario5 ended");
	}

	@AfterTest
	public void close() {
		driver.quit();
		System.out.println("Browser closed. ");
	}

}
