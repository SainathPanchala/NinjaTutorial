package org.QAfoxprojectGenericUtility;

import org.QAfoxprojectPageRepository.HomePage;
import org.QAfoxprojectPageRepository.LoginAccountPage;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


/**
 * 
 * This Class Describes The Configuration For Test This Class is Used for
 * configure All PreCondition and Post Condition For Test Script
 *
 * And also initializing All the Library-Utility class
 * 
 * @author Sai
 */
public class BaseConfiguration {

	public WebDriverLibrary webdriverobj;
	public ExcelFileLibrary excelutilityobj;
	public PropertyFileLibrary propertyfileobj;
	public javaLibrary javautilityobj;
	public JavaScriptLibrary jsutilityobj;
	public TakeScreenshotLibrary tsutilityobj;
	public LoginAccountPage loginobj;
     
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	/**
	 * This Method Used To Configure the setup
	 * 
	 * @param
	 **/
	@BeforeClass
	public void browserSetup() {
		// Initialize all the Libraries
		initobjects();
		String browser = "chrome";

		String url = "https://tutorialsninja.com/demo/";

		// Precondition1: Lunch the Browser
		webdriverobj.LunchBrowser(browser);
		Reporter.log("Browser Lunched Successfully", true);

		// Precondition2: Navigate to the Application Via URL
		webdriverobj.navigateToApp(url);
		Reporter.log("Navigate To the Application Succesful", true);
		// Precondition3:Maximize the Browser
		webdriverobj.maximizeBrowser();
		Reporter.log("Maximize the Browser Succesful", true);

		HomePage homeobj = new HomePage(webdriverobj.driver);

		// Click on My Account Header Link
		homeobj.getMyaccount_headerlink().click();
		Reporter.log("Clicked on My Account Header Link Successful", true);

		// Click on Login HeaderLink
		homeobj.getLogin_headerlink().click();
		Reporter.log("Clicked on Login HeaderLink Successful", true);
		
		//Click on Register HeaderLink
	//	homeobj.getRegister_headerlink().click();
		//org.testng.Reporter.log("Clicked on Register HeaderLink Successful",true);
		//Click On ShoppingCart Module
	

	}

	/**
	 * This Method Used To Configure the Browser Terminate
	 *
	 **/
	@AfterClass
	public void browserTerminate() {
		// PostCondition1:Close The Browser
		webdriverobj.closeAllBrowsers();
		Reporter.log("terminate succesful", true);
	}

	/**
	 * This Method Used To Perform Login Activity
	 * 
	 **/
	@BeforeMethod
	public void login() {
		
		String username ="p.sainath980@gmail.com";
		String password ="89898989";

		// Provide Wait Statement
		webdriverobj.waituntilElementFound();
		LoginAccountPage loginobj = new LoginAccountPage(webdriverobj.driver);
		// Enter Email
		loginobj.getEmailadd_TextField().sendKeys(username);
		// Enter password
		loginobj.getPassword_TextField().sendKeys(password);
		// Click Login
		loginobj.getLogin_button().click();
	Reporter.log("Login Successful", true);

	}

	/**
	 * This Method Used To Perform Logout Activity
	 **/
	@AfterMethod
	public void logout() {
		HomePage homeobj = new HomePage(webdriverobj.driver);
		//Click on MyAccount Button
				homeobj.getMyAccount_Button().click();
				//Click on Logout Button
				homeobj.getLogOut_Button().click();
		Reporter.log("Logout Succesful", true);
	}

	/**
	 * This Method Used To Get/Configure the TestRunner level Connection
	 * 
	 **/
	@BeforeTest
	public void getTestRunnerConnection() {
		// Test Log
		Reporter.log("Getting TestRunner Connection Succesful", true);
	}

	/**
	 * This Method Used To Get/Configure the Database or Advance Report Connection
	 * 
	 **/
	@BeforeSuite
	public void getReportConnection() {
		//Create the SparkReport
	ExtentSparkReporter	spark =new ExtentSparkReporter("./AdvanceReports/report.html");

		// 2.Configure the SparkReport Information
		spark.config().setDocumentTitle("FunctionalityTest||QaFox");
		spark.config().setReportName("FunctionalitySuite||Verify User Able to Add Desktop-Mac-Product");
		spark.config().setTheme(Theme.STANDARD);

		// 3.Create Extent Report
		 report = new ExtentReports();

		// 4.Attach the Spark with Extent Report
		report.attachReporter(spark);

		// 5.Configure the System information in extent Report
		report.setSystemInfo("DeviceName", "Sai");
		report.setSystemInfo("OperatingSystem", "WINDOWS10pro");
		report.setSystemInfo("Browser.", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-131.0.6778.264");

		
		org.testng.Reporter.log("Getting Report Connection", true);
	}

	/**
	 * This Method Used To Terminate the DataBase or Advance Report Connection
	 * 
	 **/
	@AfterSuite
	public void terminationConnection() {
		// Flush the Report Information
				report.flush();
		org.testng.Reporter.log("Terminate ReportConnection Succesful", true);
	}

	public void initobjects() {
		webdriverobj = new WebDriverLibrary();
		excelutilityobj = new ExcelFileLibrary();
		propertyfileobj = new PropertyFileLibrary();
		javautilityobj = new javaLibrary();
		jsutilityobj = new JavaScriptLibrary();
		tsutilityobj = new TakeScreenshotLibrary();

	}
}
