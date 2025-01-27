package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTask {

	@Test
	public void demoTask1() {
		// 1.Create the sparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// 2.Configure the SparkReport Information
		spark.config().setDocumentTitle("FunctionalityTest||QaFox");
		spark.config().setReportName("FunctionalitySuite||Verify User Able to Add Desktop-Mac-Product");
		spark.config().setTheme(Theme.STANDARD);

		// 3.Create Extent Report
		ExtentReports report = new ExtentReports();

		// 4.Attach the Spark with Extent Report
		report.attachReporter(spark);

		// 5.Configure the System information in extent Report
		report.setSystemInfo("DeviceName", "Sai");
		report.setSystemInfo("OperatingSystem", "WINDOWS10pro");
		report.setSystemInfo("Browser.", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-131.0.6778.264");

		// 5.Create The test Information
		ExtentTest test = report.createTest("Functionality Test");

		// Steps Information
		test.log(Status.INFO, "Step1:Lunching The Browser Sucessful");
		test.log(Status.INFO, "Step2:Naviagting To Application via URL Sucessful");
		test.log(Status.PASS, "Step3:Verified the Webpage sucessful");

		if ("Sai".equals("Sai")) {
			test.log(Status.PASS, "Step4: verified the WebElement is Displayed");
		} else {
			test.log(Status.FAIL, "Step4: verified the WebElement is Not Displayed");

		}
		test.log(Status.SKIP, "Step5: verified the WebElement is Hidden");
		// Flush the Report Information
		report.flush();
		System.out.println("execution done");

	}

}
