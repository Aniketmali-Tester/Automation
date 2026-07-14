package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("https://parabank.parasoft.com/");
		
		//Maximize window
		driver.manage().window().maximize();
		
		
	    // Findelement Syntax
		//WebElement element = driver.findElement(By.id("username"));
		
		//Enter user name
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("john");
		
		//Enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demo");
		
		//Click on loginbutton
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();
		Thread.sleep(2000);
		
		
		
		//Findelements
	List<WebElement> elements = driver.findElements(By.xpath("//table[@id='accountTable']//a"));
	System.out.println(elements.size());
		
		
		//click on logout 
		WebElement logout = driver.findElement(By.xpath("//a[text()='Log Out']"));
		logout.click();
		
		
		
		
		
		
		
		

	}

}
