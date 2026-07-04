package Pages;

import Pojoclass.LoginData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    WebDriver driver;


    //Constructor


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //Loacated WebElement

    @FindBy(name = "username")
    WebElement Username;


    @FindBy(name = "password")
    WebElement Password;


    @FindBy(xpath = "//input[@value='Log In']")
    WebElement Loginbutton;



    //Actions/Methods

  /*  public void Username(String Un)
    {
        Username.sendKeys(Un);
    }

    public void Password(String p)
    {
        Password.sendKeys(p);
    }*/

    public void LoginCredrntinal(LoginData data)
    {

        Username.sendKeys(data.getUsername());
        Password.sendKeys(data.getUsername());
    }




    public void Loginbutton()
    {
        Loginbutton.click();
    }






}
