package Browseropen;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Launch Browser
          WebDriver driver=new ChromeDriver();
          
          
          //Maximize window
           driver.manage().window().maximize();
           
           
           //open url
           driver.navigate().to("https://www.google.com");
          // Thread.sleep(3000);
           
           //open url with get()
           driver.get("https://www.hdfc.bank.in");
           //Thread.sleep(3000);
           
           //forward
          /* driver.navigate().forward();
           Thread.sleep(3000);
           
           //backward
           driver.navigate().back();
           Thread.sleep(3000);
           
           //refresh
           driver.navigate().refresh();https://www.hdfc.bank.in/
           Thread.sleep(3000);*/
           
           
           //gettitle on webpage
		String title = driver.getTitle();
		System.out.println("title of webpage : "+title);
		
		//getcurrenturl
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current url : "+currenturl);
		
		
		   
           //getwindowsize
		   Dimension WindowSize = driver.manage().window().getSize();
		   System.out.println("WindowSize : "+WindowSize);
          
		   
		   //SetBorwserSize
		   Dimension dmen=new Dimension(1500, 700);
		   driver.manage().window().setSize(dmen);
		   System.out.println("Dimensional : "+dmen);
		   
		   //getposition
		 Point position = driver.manage().window().getPosition();
		 System.out.println("Position : "+position);
		  
		  //setposition
		 /* Point p=new Point(7, 8);
		  driver.manage().window().setPosition(p);
		  System.out.println(p);*/
		  
		  
		  //Browser close
		  driver.close();

	}

}
