package Parameter;

import Baseclass.Setupclass;
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends Setupclass {


    @Test
    @Parameters({"Username","Password"})
    public void loginwithparameters(String u,String p)
    {


        driver.findElement(By.name("username")).sendKeys(u);
        driver.findElement(By.name("password")).sendKeys(p);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }





}
