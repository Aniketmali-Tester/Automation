package ParallelTesting;

import Baseclass.Baseclass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Parallel1parabank extends Baseclass {


    @Test(priority = 0)
    public void login() throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys("john");
        driver.findElement(By.name("password")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //Thread.sleep(5000);
    }

    @Test(priority = 1)
    public void logout()
    {

        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
    }






}
