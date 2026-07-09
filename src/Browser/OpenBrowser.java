package Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {


    public static void main(String[] args) throws InterruptedException {

        //Launch Browser
        ChromeDriver driver=new ChromeDriver();


        //open url
         driver.get("https://parabank.parasoft.com");


         //Maximize
         driver.manage().window().maximize();

         //Minimize
        //driver.manage().window().maximize();


        //get title
        String title = driver.getTitle();
        System.out.println("title of webpage : "+title);

        //getcurrenturl

        String Currenturl = driver.getCurrentUrl();
        System.out.println("Currenturl : "+Currenturl);
        Thread.sleep(4000);

        driver.get("https://www.hdfc.bank.in");
        String Currenturl2 = driver.getCurrentUrl();
        System.out.println("Second currenturl : "+Currenturl2);

        //close browser
        driver.close();






    }
}
