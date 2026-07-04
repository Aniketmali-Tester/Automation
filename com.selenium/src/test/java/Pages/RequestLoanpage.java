package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RequestLoanpage {


    WebDriver driver;


    //Constructor


    public RequestLoanpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //Locate element

    @FindBy(xpath = "//a[text()='Request Loan']")
    WebElement Registerbutton;


    @FindBy(id = "amount")
    WebElement Amount;

    @FindBy(id = "downPayment")
    WebElement Downpayment ;

    @FindBy(id = "fromAccountId")
    WebElement FromAccount ;

    @FindBy(xpath = "//input[@value='Apply Now']")
    WebElement Applybutton ;


    //Actions Methods


    public void clickRegisterButton()
    {
          Registerbutton.click();
    }

    public void EnterAmount(String Amt)
    {
        Amount.clear();
        Amount.sendKeys(Amt);
    }

    public void EnterDown(String Downamt)
    {
        Downpayment.clear();
        Downpayment.sendKeys(Downamt);
    }

    public void SelectAccount(String Acct)
    {

        Select S=new Select(FromAccount);
        S.selectByVisibleText("13233");
    }

    public void ClickApplybutton()
    {

        Applybutton.click();
    }




}
