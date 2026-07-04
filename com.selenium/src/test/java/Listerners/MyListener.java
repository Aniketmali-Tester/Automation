/*package Listerners;

import JsonUtilityData.ScreenShotutility;
//import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Baseclass.Baseclass;

import utilities.ExtentReport;

import java.io.IOException;

public class MyListener implements ITestListener {


    ExtentTest test;

        @Override
        public void onStart(ITestContext context) {

            ExtentReport.setupReport();

            System.out.println("Execution Started");
        }

        @Override
        public void onTestStart(ITestResult result) {

            test = ExtentReport.extent.createTest(result.getMethod().getMethodName());

            System.out.println(result.getMethod().getMethodName() + " Started");
        }

        @Override
        public void onTestSuccess(ITestResult result) {

            test.pass("Test Case Passed");

            System.out.println(result.getMethod().getMethodName() + " Passed");
        }

        @Override
        public void onTestFailure(ITestResult result) {

            test.fail(result.getThrowable());

            try {

                String path = ScreenShotutility.captureScreenshot(
                        Baseclass.driver,
                        result.getMethod().getMethodName());

                test.addScreenCaptureFromPath(path);

            } catch (IOException e) {

                e.printStackTrace();
            }

            System.out.println(result.getMethod().getMethodName() + " Failed");
        }

        @Override
        public void onTestSkipped(ITestResult result) {

            test.skip("Test Case Skipped");

            System.out.println(result.getMethod().getMethodName() + " Skipped");
        }

        @Override
        public void onFinish(ITestContext context) {

            ExtentReport.flushReport();

            System.out.println("Execution Finished");
        }
    }*/


