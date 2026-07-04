package TestNg;

import Baseclass.Baseclass;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion extends Baseclass {




    @Test(priority = 0)
    public void HardAssertion()
    {
        String title = driver.getTitle();
        Assert.assertEquals(title,"ParaBank | Welcome | Online Banking");

        Assert.assertNotEquals("google",title);


        driver.findElement(By.name("username"))
                .sendKeys("john");

        driver.findElement(By.name("password"))
                .sendKeys("demo");

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();
        driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();

         String url = driver.getCurrentUrl();
        boolean enable=driver.findElement(By.id("amount")).isEnabled();
        Assert.assertTrue(enable);


        System.out.print("The Amount field is enabled");

        Assert.assertNull(url);

        System.out.println("String is not null ");


        driver.findElement(By.xpath("//a[text()='Log Out']")).click();



    }

    @Test(priority = 1)
    public void verifyloanpage()
    {


        driver.findElement(By.name("username"))
                .sendKeys("john");

        driver.findElement(By.name("password"))
                .sendKeys("demo");

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();
        driver.findElement(By.xpath("//a[text()='Request Loan']")).click();
         String Requestpage = driver.getTitle();
         System.out.println();

         Assert.assertEquals("ParaBank | Loan Request",Requestpage);


         System.out.println("Landed Succesfulll");
    }






}
