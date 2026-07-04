package Listerners;

import Reports.Report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static Reports.Report.extent;

public class ExtentListerners implements ITestListener {

    ExtentReports extent=Report.Report();
    ExtentTest Test;

    @Override
    public void onTestStart(ITestResult result)
    {
        Test=extent.createTest(result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result)
    {
        Test.pass("Test Passed");
    }
    @Override
    public void onTestFailure(ITestResult result)
    {
        Test.fail(result.getThrowable());

    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        Test.skip(result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context)
    {
        extent.flush();
    }












}
