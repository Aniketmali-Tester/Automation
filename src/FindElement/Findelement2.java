package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement2 {

    public static void main(String[] args) throws InterruptedException {
        //Lauch a Browser
        WebDriver driver=new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //open a url
        driver.get("https://parabank.parasoft.com/");

        //absolute xpath
        WebElement username = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/input[1]"));
        username.sendKeys("john");
        Thread.sleep(3000);



        //locate password name element
        WebElement password = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[1]"));
        password.sendKeys("demo");
        Thread.sleep(3000);

        //locate loginbutton element
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

    }
}
