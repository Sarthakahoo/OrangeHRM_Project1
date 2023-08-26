package com.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private final String propertyFilePath = "configuration_folder//configuration.properties";
	private Properties properties;

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("Chromedriverpath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("Chromedriverpath not specified in the Configuration.properties file.");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	public String LoginButton() {
		String LoginButton = properties.getProperty("LoginButton");
		if (LoginButton != null)
			return LoginButton;
		else
			throw new RuntimeException("LoginButton not specified in the Configuration.properties file.");
	}

	public String username_Xpathpath() {
		String username_Xpathpath = properties.getProperty("username_Xpathpath1");
		if (username_Xpathpath != null)
			return username_Xpathpath;
		else
			throw new RuntimeException("username_Xpathpath not specified in the Configuration.properties file.");
	}

	public String password_Namepath() {
		String password_Namepath = properties.getProperty("password_Namepath");
		if (password_Namepath != null)
			return password_Namepath;
		else
			throw new RuntimeException("password_Namepath not specified in the Configuration.properties file.");
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String username1() {
		String username1 = properties.getProperty("username1");
		if (username1 != null)
			return username1;
		else
			throw new RuntimeException("username1 not specified in the Configuration.properties file.");
	}

	public String password1() {
		String password1 = properties.getProperty("password1");
		if (password1 != null)
			return password1;
		else
			throw new RuntimeException("password1 not specified in the Configuration.properties file.");
	}

	public String username2() {
		String username2 = properties.getProperty("username2");
		if (username2 != null)
			return username2;
		else
			throw new RuntimeException("username2 not specified in the Configuration.properties file.");
	}

	public String password2() {
		String password2 = properties.getProperty("password2");
		if (password2 != null)
			return password2;
		else
			throw new RuntimeException("password2 not specified in the Configuration.properties file.");
	}

	public String performance_xpath() {
		String performance_xpath = properties.getProperty("performance_xpath");
		if (performance_xpath != null)
			return performance_xpath;
		else
			throw new RuntimeException("performance_xpath not specified in the Configuration.properties file.");
	}

	public String configure_xpath() {
		String configure_xpath = properties.getProperty("configure_xpath");
		if (configure_xpath != null)
			return configure_xpath;
		else
			throw new RuntimeException("configure_xpath not specified in the Configuration.properties file.");
	}
	
	public String configure_CSSSelector() {
		String configure_cssselect = properties.getProperty("configure_cssselect");
		if (configure_cssselect != null)
			return configure_cssselect;
		else
			throw new RuntimeException("configure_cssselect not specified in the Configuration.properties file.");
	}

	public String jobtitle_xpath() {
		String jobtitle_xpath = properties.getProperty("jobtitle_xpath");
		if (jobtitle_xpath != null)
			return jobtitle_xpath;
		else
			throw new RuntimeException("jobtitle_xpath not specified in the Configuration.properties file.");
	}

	public String KPI_search() {
		String KPI_search = properties.getProperty("KPI_search");
		if (KPI_search != null)
			return KPI_search;
		else
			throw new RuntimeException("KPI_search not specified in the Configuration.properties file.");
	}

	public String Logout_button() {
		String Logout_button = properties.getProperty("Logout_cssselector");
		if (Logout_button != null)
			return Logout_button;
		else
			throw new RuntimeException("Logout_button not specified in the Configuration.properties file.");
	}
	
	
	public String Logout_button1() {
		String Logout_button1 = properties.getProperty("Logout_cssselector1");
		if (Logout_button1 != null)
			return Logout_button1;
		else
			throw new RuntimeException("Logout_button1 not specified in the Configuration.properties file.");
	}
	
	public String KPI_Option_xpath() {
		String KPI_Option = properties.getProperty("KPI_Option_xpath");
		if (KPI_Option != null)
			return KPI_Option;
		else
			throw new RuntimeException("KPI_Option not specified in the Configuration.properties file.");
	}
	public String KPI_Option_cssSelector() {
		String KPI_Option_cssSelector = properties.getProperty("KPI_Option_cssSelector");
		if (KPI_Option_cssSelector != null)
			return KPI_Option_cssSelector;
		else
			throw new RuntimeException("KPI_Option_cssSelector not specified in the Configuration.properties file.");
	}
	public String KPI_Option_JSpath() {
		String KPI_Option_JSpath = properties.getProperty("KPI_Option_JSpath");
		if (KPI_Option_JSpath != null)
			return KPI_Option_JSpath;
		else
			throw new RuntimeException("KPI_Option_JSpath not specified in the Configuration.properties file.");
	}
	
	public String DB_Admin() {
		String DB_Admin = properties.getProperty("DB_Admin");
		if (DB_Admin != null)
			return DB_Admin;
		else
			throw new RuntimeException("DB_Admin not specified in the Configuration.properties file.");
	}
	
	public String ManageReviews1() {
		String ManageReviews_Tab_xpath = properties.getProperty("ManageReviews_Tab_xpath");
		if (ManageReviews_Tab_xpath != null)
			return ManageReviews_Tab_xpath;
		else
			throw new RuntimeException("ManageReviews_Tab_xpath not specified in the Configuration.properties file.");
	}
	
	public String ManageReviews2() {
		String ManageReviews_selectOption_xpath = properties.getProperty("ManageReviews_selectOption_xpath");
		if (ManageReviews_selectOption_xpath != null)
			return ManageReviews_selectOption_xpath;
		else
			throw new RuntimeException("ManageReviews_selectOption_xpath not specified in the Configuration.properties file.");
	}
	
	public String MyTrackers_xpath() {
		String MyTrackers_xpath = properties.getProperty("MyTrackers_xpath");
		if (MyTrackers_xpath != null)
			return MyTrackers_xpath;
		else
			throw new RuntimeException("MyTrackers_xpath not specified in the Configuration.properties file.");
	}
	
	public String EmployeeTrackers_xpath() {
		String EmployeeTrackers_xpath = properties.getProperty("EmployeeTrackers_xpath");
		if (EmployeeTrackers_xpath != null)
			return EmployeeTrackers_xpath;
		else
			throw new RuntimeException("EmployeeTrackers_xpath not specified in the Configuration.properties file.");
	}
	
	public String KPI_Reset() {
		String KPI_Reset = properties.getProperty("KPI_Reset");
		if (KPI_Reset != null)
			return KPI_Reset;
		else
			throw new RuntimeException("KPI_Reset not specified in the Configuration.properties file.");
	}
	
	public String KPI_Add_button() {
		String KPI_Add_button = properties.getProperty("KPI_Add_button");
		if (KPI_Add_button != null)
			return KPI_Add_button;
		else
			throw new RuntimeException("KPI_Add_button not specified in the Configuration.properties file.");
	} 
	
	public String KPI_Add_Save() {
		String KPI_Add_Save = properties.getProperty("KPI_Add_Save");
		if (KPI_Add_Save != null)
			return KPI_Add_Save;
		else
			throw new RuntimeException("KPI_Add_Save not specified in the Configuration.properties file.");
	}
	
	public String Key_Performance_Indicator() {
		String Key_Performance_Indicator = properties.getProperty("Key_Performance_Indicator");
		if (Key_Performance_Indicator != null)
			return Key_Performance_Indicator;
		else
			throw new RuntimeException("Key_Performance_Indicator not specified in the Configuration.properties file.");
	}
	
	public String Minimum_Rating1() {
		String Minimum_Rating1 = properties.getProperty("Minimum_Rating1");
		if (Minimum_Rating1 != null)
			return Minimum_Rating1;
		else
			throw new RuntimeException("Minimum_Rating1 not specified in the Configuration.properties file.");
	}
	
	public String Maximum_Rating1() {
		String Maximum_Rating1 = properties.getProperty("Maximum_Rating1");
		if (Maximum_Rating1 != null)
			return Maximum_Rating1;
		else
			throw new RuntimeException("Maximum_Rating1 not specified in the Configuration.properties file.");
	}
	
	public String jobtitle_xpath1() {
		String jobtitle_xpath1 = properties.getProperty("jobtitle_xpath1");
		if (jobtitle_xpath1 != null)
			return jobtitle_xpath1;
		else
			throw new RuntimeException("jobtitle_xpath1 not specified in the Configuration.properties file.");
	}
	
	public String jobtitle_xpath2() {
		String jobtitle_xpath2 = properties.getProperty("jobtitle_xpath2");
		if (jobtitle_xpath2 != null)
			return jobtitle_xpath2;
		else
			throw new RuntimeException("jobtitle_xpath2 not specified in the Configuration.properties file.");
	}
	
	public String Edit_button1() {
		String Edit_button1 = properties.getProperty("Edit_button1");
		if (Edit_button1 != null)
			return Edit_button1;
		else
			throw new RuntimeException("Edit_button1 not specified in the Configuration.properties file.");
	}
	
	
	public String Make_default_button1() {
		String Make_default_button1 = properties.getProperty("Make_default_button1");
		if (Make_default_button1 != null)
			return Make_default_button1;
		else
			throw new RuntimeException("Make_default_button1 not specified in the Configuration.properties file.");
	}
	
	public String KPI_Cancel() {
		String KPI_Cancel = properties.getProperty("KPI_Cancel");
		if (KPI_Cancel != null)
			return KPI_Cancel;
		else
			throw new RuntimeException("KPI_Cancel not specified in the Configuration.properties file.");
	}
	
	public String KPI_delete() {
		String KPI_delete = properties.getProperty("KPI_delete");
		if (KPI_delete != null)
			return KPI_delete;
		else
			throw new RuntimeException("KPI_delete not specified in the Configuration.properties file.");
	}
	
	public String KPI_Alert_delete() {
		String KPI_Alert_delete = properties.getProperty("KPI_Alert_delete");
		if (KPI_Alert_delete != null)
			return KPI_Alert_delete;
		else
			throw new RuntimeException("KPI_Alert_delete not specified in the Configuration.properties file.");
	}
	
	public String Config_Trackers() {
		String Config_Trackers = properties.getProperty("Config_Trackers");
		if (Config_Trackers != null)
			return Config_Trackers;
		else
			throw new RuntimeException("Config_Trackers not specified in the Configuration.properties file.");
	}	
	
	public String Tracker_Employee_Name() {
		String Tracker_Employee_Name = properties.getProperty("Tracker_Employee_Name");
		if (Tracker_Employee_Name != null)
			return Tracker_Employee_Name;
		else
			throw new RuntimeException("Tracker_Employee_Name not specified in the Configuration.properties file.");
	}
	
	public String Employee_Tracker_Reset() {
		String Employee_Tracker_Reset = properties.getProperty("Employee_Tracker_Reset");
		if (Employee_Tracker_Reset != null)
			return Employee_Tracker_Reset;
		else
			throw new RuntimeException("Employee_Tracker_Reset not specified in the Configuration.properties file.");
	}
	
	public String Employee_Tracker_search() {
		String Employee_Tracker_search = properties.getProperty("Employee_Tracker_search");
		if (Employee_Tracker_search != null)
			return Employee_Tracker_search;
		else
			throw new RuntimeException("Employee_Tracker_search not specified in the Configuration.properties file.");
	}	
	
	public String Employee_Tracker_add() {
		String Employee_Tracker_add = properties.getProperty("Employee_Tracker_add");
		if (Employee_Tracker_add != null)
			return Employee_Tracker_add;
		else
			throw new RuntimeException("Employee_Tracker_add not specified in the Configuration.properties file.");
	}
	
	public String Tracker_EmployeeName_Add() {
		String Tracker_EmployeeName_Add = properties.getProperty("Tracker_EmployeeName_Add");
		if (Tracker_EmployeeName_Add != null)
			return Tracker_EmployeeName_Add;
		else
			throw new RuntimeException("Tracker_EmployeeName_Add not specified in the Configuration.properties file.");
	}
	
	public String Tracker_Name() {
		String Tracker_Name = properties.getProperty("Tracker_Name");
		if (Tracker_Name != null)
			return Tracker_Name;
		else
			throw new RuntimeException("Tracker_Name not specified in the Configuration.properties file.");
	}
	
	public String Tracker_Reviewers() {
		String Tracker_Reviewers = properties.getProperty("Tracker_Reviewers");
		if (Tracker_Reviewers != null)
			return Tracker_Reviewers;
		else
			throw new RuntimeException("Tracker_Reviewers not specified in the Configuration.properties file.");
	}
	
	public String Tracker_Save() {
		String Tracker_Save = properties.getProperty("Tracker_Save");
		if (Tracker_Save != null)
			return Tracker_Save;
		else
			throw new RuntimeException("Tracker_Save not specified in the Configuration.properties file.");
	}
	
	public String Tracker_Cancel() {
		String Tracker_Cancel = properties.getProperty("Tracker_Cancel");
		if (Tracker_Cancel != null)
			return Tracker_Cancel;
		else
			throw new RuntimeException("Tracker_Cancel not specified in the Configuration.properties file.");
	}
	
	public String Tracker_delete() {
		String Tracker_delete = properties.getProperty("Tracker_delete");
		if (Tracker_delete != null)
			return Tracker_delete;
		else
			throw new RuntimeException("Tracker_delete not specified in the Configuration.properties file.");
	}
	
	public String My_Reviews() {
		String My_Reviews = properties.getProperty("My_Reviews");
		if (My_Reviews != null)
			return My_Reviews;
		else
			throw new RuntimeException("My_Reviews not specified in the Configuration.properties file.");
	}
	
	public String Evaluate_button() {
		String Evaluate_button = properties.getProperty("Evaluate_button");
		if (Evaluate_button != null)
			return Evaluate_button;
		else
			throw new RuntimeException("Evaluate_button not specified in the Configuration.properties file.");
	}
	
	public String Formal_management_Rating() {
		String Evaluate_button = properties.getProperty("Evaluate_button");
		if (Evaluate_button != null)
			return Evaluate_button;
		else
			throw new RuntimeException("Evaluate_button not specified in the Configuration.properties file.");
	}
	
	public String Formal_management_Comments() {
		String Formal_management_Comments = properties.getProperty("Formal_management_Comments");
		if (Formal_management_Comments != null)
			return Formal_management_Comments;
		else
			throw new RuntimeException("Formal_management_Comments not specified in the Configuration.properties file.");
	}
	
	public String General_Comment() {
		String General_Comment = properties.getProperty("General_Comment");
		if (General_Comment != null)
			return General_Comment;
		else
			throw new RuntimeException("General_Comment not specified in the Configuration.properties file.");
	}
	
	public String Evaluate_cancel() {
		String Evaluate_cancel = properties.getProperty("Evaluate_cancel");
		if (Evaluate_cancel != null)
			return Evaluate_cancel;
		else
			throw new RuntimeException("Evaluate_cancel not specified in the Configuration.properties file.");
	}
	
	public String Evaluate_save() {
		String Evaluate_save = properties.getProperty("Evaluate_save");
		if (Evaluate_save != null)
			return Evaluate_save;
		else
			throw new RuntimeException("General_Comment not specified in the Configuration.properties file.");
	}
	public String Evaluate_complete() {
		String Evaluate_complete = properties.getProperty("Evaluate_complete");
		if (Evaluate_complete != null)
			return Evaluate_complete;
		else
			throw new RuntimeException("Evaluate_complete not specified in the Configuration.properties file.");
	}
	
	public String My_Tracker_Tab() {
		String My_Tracker_Tab = properties.getProperty("My_Tracker_Tab");
		if (My_Tracker_Tab != null)
			return My_Tracker_Tab;
		else
			throw new RuntimeException("My_Tracker_Tab not specified in the Configuration.properties file.");
	}
	public String MyTracker_View() {
		String MyTracker_View = properties.getProperty("MyTracker_View");
		if (MyTracker_View != null)
			return MyTracker_View;
		else
			throw new RuntimeException("MyTracker_View not specified in the Configuration.properties file.");
	}
	public String Add_Log() {
		String Add_Log = properties.getProperty("Add_Log");
		if (Add_Log != null)
			return Add_Log;
		else
			throw new RuntimeException("Add_Log not specified in the Configuration.properties file.");
	}
	public String Log_Xpath() {
		String Log_Xpath = properties.getProperty("Log_Xpath");
		if (Log_Xpath != null)
			return Log_Xpath;
		else
			throw new RuntimeException("Evaluate_complete not specified in the Configuration.properties file.");
	}
	public String Log_Comment_Xpath() {
		String Log_Comment_Xpath = properties.getProperty("Log_Comment_Xpath");
		if (Log_Comment_Xpath != null)
			return Log_Comment_Xpath;
		else
			throw new RuntimeException("Log_Comment_Xpath not specified in the Configuration.properties file.");
	}
	public String Log_save() {
		String Log_save = properties.getProperty("Log_save");
		if (Log_save != null)
			return Log_save;
		else
			throw new RuntimeException("Log_save not specified in the Configuration.properties file.");
	}
	public String Log_cancel() {
		String Log_cancel = properties.getProperty("Log_cancel");
		if (Log_cancel != null)
			return Log_cancel;
		else
			throw new RuntimeException("Log_cancel not specified in the Configuration.properties file.");
	}
	
	public String Emp_Tracker_Name() {
		String Emp_Tracker_Name = properties.getProperty("Emp_Tracker_Name");
		if (Emp_Tracker_Name != null)
			return Emp_Tracker_Name;
		else
			throw new RuntimeException("Emp_Tracker_Name not specified in the Configuration.properties file.");
	}
	
	public String Include_xpath1() {
		String Include_xpath1 = properties.getProperty("Include_xpath1");
		if (Include_xpath1 != null)
			return Include_xpath1;
		else
			throw new RuntimeException("Include_xpath1 not specified in the Configuration.properties file.");
	}
	
	public String Include_xpath2() {
		String Include_xpath2 = properties.getProperty("Include_xpath2");
		if (Include_xpath2 != null)
			return Include_xpath2;
		else
			throw new RuntimeException("Include_xpath2 not specified in the Configuration.properties file.");
	}
	
	public String Search_xpath() {
		String Search_xpath = properties.getProperty("Search_xpath");
		if (Search_xpath != null)
			return Search_xpath;
		else
			throw new RuntimeException("Search_xpath not specified in the Configuration.properties file.");
	}
	
	public String Reset_xpath() {
		String Reset_xpath = properties.getProperty("Reset_xpath");
		if (Reset_xpath != null)
			return Reset_xpath;
		else
			throw new RuntimeException("Reset_xpath not specified in the Configuration.properties file.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
