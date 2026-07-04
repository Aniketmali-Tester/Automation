package Pages;

import Pojoclass.ApplyloanRequest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplyLoanRequest {


          WebDriver driver;


    //constructor
    public ApplyLoanRequest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //located Element

    @FindBy(id="amount")
    WebElement LoanAmount;

    @FindBy(id="downPayment")
    WebElement Downamount;

    @FindBy(id="fromAccountId")
    WebElement FroAccountID;


    @FindBy(xpath = "//input[@value='Apply Now']")
    WebElement Applyclickbutton;


    //Methods (or) Actions
       public void applyloan(ApplyloanRequest data)
       {
           LoanAmount.sendKeys(data.getlonamount());
           Downamount.sendKeys(data.getdownpayment());
           Select s=new Select (FroAccountID);
           s.selectByVisibleText(data.getfromAccount());


       }

       public void clickapply()
       {

           Applyclickbutton.click();
       }











}
