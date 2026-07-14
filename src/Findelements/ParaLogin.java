package Findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Launch browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/");
		
		//username
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("john");
		
		//password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demo");
		
		//loginbutton
		WebElement loginbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginbutton.click();
		
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements);
		

	}

}
