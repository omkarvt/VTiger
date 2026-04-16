package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {
	
	ExtentReports reports;
	ExtentTest test;
	JavaUtility jutil=new JavaUtility();
	String dateTimeStamp=jutil.getCalenderDetails("dd-MM-YYYY hh-mm-ss");
	@Override
	public void onTestStart(ITestResult result) {
	String methodName=result.getMethod().getMethodName();
	System.out.println(methodName+"--on test Start Executed");
	
	//Creating Fields for every @Test method in the report
	test=reports.createTest(methodName);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"--on test Success Executed");
		//logging the status as pass for test method
		test.log(Status.PASS, methodName+"--Success Executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"--on test failure Executed");
		
		//logging the status as FAIL
		test.log(Status.FAIL, methodName+"--failed");
		test.log(Status.INFO, result.getThrowable());
		
		//Capturing the screenshot of the webpage
		String screenshotnmae=methodName+"-"+dateTimeStamp;
		
		Seleniumutility sutil=new Seleniumutility();
		try {
			String path=sutil.webPageScreenshot(BaseClass.sDriver, screenshotnmae);
			//Attaching the screenshot to the failed test in report
			test.addScreenCaptureFromPath(path);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"--on test Skipped Executed");
		
		//logging status as SKIP
		test.log(Status.SKIP, methodName+"--Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start Executed");
		
		//Configuring the extent report
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\Extent_Report\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setReportName("VTiger Repoort");
		reporter.config().setTheme(Theme.STANDARD);
		
		//generate an empty report
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "https://localhost:8888");
		reports.setSystemInfo("Base browser", "chrome");
		reports.setSystemInfo("Base platform", "window");
		reports.setSystemInfo("Test Engineer", "Omkar");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish Executed");
		//Flushing the report
		reports.flush();
	}
	

}
