package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class Report {


    public static ExtentReports extent;

    public static ExtentReports Report()
    {


        //Create the Html Report
        ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")
                +"/Reports/ExtentReport .html");

        extent=new ExtentReports();


        //Connects Html Report to Extent Report
        extent.attachReporter(spark);


        return extent;


    }





}
