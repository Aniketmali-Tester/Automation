package TestNg;

import Baseclass.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion extends Baseclass {



    SoftAssert S=new SoftAssert();
    @Test(priority = 0)
    public  void VerifyrequestLoanpage()  {

        SoftAssert S=new SoftAssert();
        driver.findElement(By.name("username"))
                .sendKeys("john");

        driver.findElement(By.name("password"))
                .sendKeys("demo");

        driver.findElement(By.xpath("//input[@value='Log In']"))
                .click();

        WebElement requestloan = driver.findElement(By.xpath("//a[text()='Request Loan']"));
        requestloan.click();
        String titlepage=driver.getTitle();
        System.out.println("Title of the page is : "+titlepage);

        //S.assertEquals("ParaBank | Welcome | Online Banking",titlepage);
       S.assertEquals(driver.getTitle(),"Title Verified");
    }

    @Test(priority = 1)
    public void verifyloanfield()
    {
        boolean result =driver.findElement(By.id("amount")).isEnabled();
        S.assertTrue(result);
        System.out.println("Amount Textfield Enable");


        boolean downpay= driver.findElement(By.id("downPayment")).isEnabled();
        S.assertTrue(result);
        System.out.println("Downpayment Textfield Enable");


        //WebElement applybutton = driver.findElement(By.xpath("//input[@type='button']"));


    }









}
