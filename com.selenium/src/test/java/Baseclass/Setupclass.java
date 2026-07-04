package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class Setupclass {

   public static  WebDriver driver;
    @BeforeClass
    @Parameters("browser")
    public void setup(String browser )
    {

        if(browser.equals("chrome"))
        {
            driver=new ChromeDriver();

        } else if (browser.equals("Firefox"))
        {
            driver=new FirefoxDriver();

        } else if (browser.equals("edge"))
        {
            driver=new EdgeDriver();

        }
        else
        {

            throw new RuntimeException("Browser Not support : "+browser);
        }
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }

    }




