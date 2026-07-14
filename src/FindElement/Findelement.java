package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Findelement {

    public static void main(String[] args) throws InterruptedException {



        //Lauch a Browser
        WebDriver driver=new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //open a url
        driver.get("https://parabank.parasoft.com/");

        //locate username name element
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("john");
        Thread.sleep(3000);


        //locate password name element
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("demo");
        Thread.sleep(3000);

        //locate loginbutton element
         driver.findElement(By.xpath("//input[@value='Log In']")).click();

      //Findelemnts
        List<WebElement> Elemnts = driver.findElements(By.tagName("input"));
        System.out.println("Size of list : "+Elemnts.size());


    }
}
