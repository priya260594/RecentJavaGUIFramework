package GenericUtility;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImpClass implements ITestListener{
	ExtentReports report;
	ExtentTest test;
	public WebDriverUtility wUtil=new WebDriverUtility();

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvancedReports"+new Date().toString().replace(" ", "_").replace(":", "_")+".png");
		spark.config().setDocumentTitle("Report");
		spark.config().setReportName("My reports");
		spark.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Reporter_Name", "Priyanka");
		report.setSystemInfo("OS", "windows-10");
		report.setSystemInfo("BROWSER", "Chrome-130");	
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		test=report.createTest(testName);
		test.log(Status.INFO,testName+ " is created");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		test.log(Status.PASS,testName+ " is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		String destpath;
			try {
				destpath=wUtil.screenshotForReport(BaseClass.sDriver, testName);
				test.addScreenCaptureFromBase64String(destpath);
			} catch (Throwable e) {
				e.printStackTrace();
			}

			test.log(Status.FAIL,testName+ " is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		test.log(Status.SKIP,testName+ " is skipped");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
