package com.qa;

import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class userCreation {
	ExtentTest test;
	public static ExtentReports report;

	public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeClass
	public static void initial() {
		report = new ExtentReports("C:\\Users\\Admin\\Desktop\\Friday\\Logs\\Taskone.html", true);
	}
	
	@Test
	public void newUser()  throws InterruptedException, IOException{
		test = report.startTest("On to the Welcome Page");
		manageUsers mUser = PageFactory.initElements(driver, manageUsers.class);
		
		driver.get(userCreationConstants.manage);
		test.log(LogStatus.INFO, "Webpage opened");
		test.log(LogStatus.INFO, "Need to enter admin username and password");
		mUser.username("admin");
		mUser.password("605d29828aae414b9d1d496acccedfa8");
		mUser.signIn();
		test.log(LogStatus.INFO, "Signed In");
		test.log(LogStatus.INFO, "Manage Opened");
		Thread.sleep(1000);
		mUser.goToUsers();
		test.log(LogStatus.INFO, "User Mnagement");
		Thread.sleep(1000);
		
		mUser.createUser();
		test.log(LogStatus.INFO, "Enter User details");
		
		createUser cUser = PageFactory.initElements(driver, createUser.class);
		String Username = "test7";
		cUser.username(Username);
		test.log(LogStatus.INFO, "Enter Username");
		cUser.password1("test1");
		test.log(LogStatus.INFO, "Enter Password");
		cUser.password2("test1");
		test.log(LogStatus.INFO, "Confirm Password");
		cUser.fullname("Test Testy");
		test.log(LogStatus.INFO, "Enter Fullname");
		cUser.email("test@gmail.com");
		test.log(LogStatus.INFO, "Enter Email");
		Thread.sleep(500);
		cUser.createButton();
		test.log(LogStatus.INFO, "Enter Confirm");
		Thread.sleep(1000);
		
		cUser.sortTable();
		test.log(LogStatus.INFO, "Sort Table");
		Thread.sleep(500);
		
	    if (cUser.users().getText().equals(Username)) {
	    	test.log(LogStatus.PASS, "User Has been sucessfully added.");
	    	
	    }
	    else {
	    	test.log(LogStatus.FAIL,"User had not been found");
	    }
	    
	    report.endTest(test);
		assertEquals(Username, cUser.users().getText());
		
		
		
	}
	
	
	@AfterClass
	public static void end() {
		report.flush();
	}

	@After
	public void tearDown() {
		//driver.quit();
	}
	
}
