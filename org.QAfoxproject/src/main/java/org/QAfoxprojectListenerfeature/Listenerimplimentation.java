package org.QAfoxprojectListenerfeature;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.QAfoxprojectGenericUtility.BaseConfiguration;
import org.QAfoxprojectGenericUtility.WebDriverLibrary;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listenerimplimentation extends BaseConfiguration implements ITestListener,IRetryAnalyzer {
	
	@Override
	public void onTestStart(ITestResult result) {
		
		Reporter.log("on TestStart....!!", true);
		String name = result.getName();
	}

	@Override
	public boolean retry(ITestResult result) {
		int count=1;
		int retryuntil = 5;
		//boolean flag = false;
		
		if (count < retryuntil) {
			Reporter.log("retry.....!!!",true);
			count++;
			 return true;
		}

		return false;
	}



	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSuccess...!!", true);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure.......!!", true);
		String methodname = result.getName();
		// Typecasting
		TakesScreenshot ts = (TakesScreenshot) WebDriverLibrary.static_driver;

		// Call the ScreenShot Method
		// Store in the Temp Path
		File source = ts.getScreenshotAs(OutputType.FILE);
		// Use TimeStamp
		String timestamp = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());

		// Store in the Permanent path
		File destination = new File("./TakeScreenShot/" + methodname+".png");

		// Copy to the Temp path to Permanent path
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		Reporter.log("Test Failure Method Executed----Screenshot Taken",true);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped....!!", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("onTestFailedButWithinSuccessPercentage....!!!", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout....!!", true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart.....!!", true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish...!!", true);
	}

}
