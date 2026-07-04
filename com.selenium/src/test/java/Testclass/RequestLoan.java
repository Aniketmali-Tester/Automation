package Testclass;

import Baseclass.Baseclass;
import Pages.LoginPage;
import Pages.RequestLoanpage;
import org.testng.annotations.Test;

public class RequestLoan extends Baseclass {


    @Test
    public void verifyApplyloan()
    {
        LoginPage obj1=new LoginPage(driver);
       // obj1.Username("Raju");
       // obj1.Password("Demo");
       // obj1.Loginbutton();
        RequestLoanpage obj=new RequestLoanpage(driver);

        obj.clickRegisterButton();
        obj.EnterAmount("23000");
        obj.EnterDown("10000");
        obj.SelectAccount("54321");
        obj.ClickApplybutton();

    }



}
