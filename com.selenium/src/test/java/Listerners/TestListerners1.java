package Listerners;

import Baseclass.Baseclass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListerners1 implements ITestListener {

    //Execute before method the suite starts
       @Override
     public void onStart(ITestContext Context)
     {
        System.out.println("Test Execution start");
     }

    //Executes before every test methods starts
    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println(("Started : "+result.getMethod().getMethodName()));
    }

    //Execute When a test cases passes
    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Pass : "+result.getMethod().getMethodName());
    }

    //Executes When a test method fail
    @Override
    public void onTestFailure(ITestResult result)
    {
        // System.out.println("fail : "+result.getMethod().getMethodName());
        //captured Screenshot

        //Get Failed Test method name
        String testname=result.getMethod().getMethodName();

        //call Screenshot method from Baseclass
        try {
            String path= Baseclass.ScreenshotMethod(testname);
            System.out.println(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println("Skip : "+result.getMethod().getMethodName());
    }


    //Executes after all test methods are completed
    @Override
    public void onFinish(ITestContext context)
    {

        System.out.println("Completed Execution");
    }





}
