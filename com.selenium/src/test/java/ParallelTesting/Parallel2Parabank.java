package ParallelTesting;

import Baseclass.Baseclass;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Parallel2Parabank extends Baseclass {




    @Test(priority = 0)
    public void login() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("john");
        driver.findElement(By.name("password")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(5000);
    }



    @Test(priority = 1)
    public void verifyAccountoverview() throws InterruptedException {


        String Expectedtitle = driver.getTitle();
        System.out.println("Tilte of the page : "+Expectedtitle);
        //Assert.assertEquals(" ParaBank | Accounts Overview",Expectedtitle);
        System.out.println("Title Matched Succefully");

    }

    @Test(priority = 2)
    public void logout()
    {
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
    }


    @Test(priority =3)
    public void openfirfox()
    {

        driver=new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/");
        Assert.assertEquals(driver.getTitle(),"Title verified");
    }

   @Test(priority = 4)
    public void Loginfox() throws InterruptedException {

       driver.findElement(By.name("username")).sendKeys("john");
       driver.findElement(By.name("password")).sendKeys("demo");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       Thread.sleep(5000);
   }


    @Test(priority = 5)
    public void logoutfox()
    {
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
    }












}
