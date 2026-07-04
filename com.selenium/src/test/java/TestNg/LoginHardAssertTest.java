package TestNg;


import Baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginHardAssertTest extends Baseclass {



    @Test(priority = 0)
    public static void verifyLogin() throws InterruptedException {

        driver.findElement(By.name("username"))
                .sendKeys("john");

        driver.findElement(By.name("password"))
                .sendKeys("demo");

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();

        Thread.sleep(3000);

        // Hard Assertions

        String title=driver.getTitle();


        Assert.assertEquals("ParaBank | Accounts Overview",title);
        System.out.println("title of the page : "+title);

        //Assert.fail();
        driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();

        boolean enable=driver.findElement(By.id("amount")).isEnabled();
        Assert.assertTrue(enable);

        System.out.print("The Amount field is enabled");

        Assert.assertNotNull(enable);
        System.out.print("Amount field is notnull");


    }



    @Test(priority = 4)
    public void Base()
    {
        WebElement logout = driver.findElement(By.xpath("//a[text()='Log Out']"));
        logout.click();
        System.out.println("Logout Succesfully");
    }





}
