package Dataprovider;

import Baseclass.Baseclass;
import Baseclass.Setupclass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginclass extends Baseclass {




    @DataProvider
    public Object[][] testdata()
    {
          Object [] [] reference={

                  {"john","demo"},
                  {"  "," "},
                  {"john","john"}

          };


          return reference;
    }




    @Test(dataProvider = "testdata")
    public void login( String u,String p)
    {


        driver.findElement(By.name("username")).sendKeys(u);
        driver.findElement(By.name("password")).sendKeys(p);
        driver.findElement(By.xpath("//input[@type='submit']")).click();



    }

    @AfterMethod
    public void logout()
    {
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
    }





}
