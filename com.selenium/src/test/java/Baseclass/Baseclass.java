package Baseclass;

//import ConfigReader.ConfigReaderfile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import utilities.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Baseclass {
   public static WebDriver driver;
   ConfigReader config;

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://parabank.parasoft.com/");

          //driver.get(config.geturl());
    }


    public static String ScreenshotMethod(String testname) throws IOException {

          //convert driver into Takescreenshot
        TakesScreenshot ts=(TakesScreenshot) driver;

        //Capture Screenshot
        File Source=ts.getScreenshotAs(OutputType.FILE);

        //Create Screenshot folder if it doesn't exist
      //  File Folder=new File(System.setProperty("user.dir")+"/Screenshot");

        String destinations = System.getProperty("user.dir") + "/Screenshot/" + testname + ".png";

        FileHandler.copy(Source,new File(destinations));

        return destinations;


        //
    }





    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}
