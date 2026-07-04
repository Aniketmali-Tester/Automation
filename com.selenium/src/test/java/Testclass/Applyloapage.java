package Testclass;

import Baseclass.Baseclass;
import JsonUtilityData.ApplyLoanJsonData;
import Pages.ApplyLoanRequest;
import Pojoclass.ApplyloanRequest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Applyloapage extends Baseclass {




    @Test
    public void verifyloanpage() throws IOException {
        Login obj=new Login();
        obj.VerifyLogin();

        ApplyLoanRequest page=new ApplyLoanRequest(driver);
        ApplyloanRequest[] data=ApplyLoanJsonData.getApplyloandata();
        page.applyloan(data[0]);
        page.clickapply();





    }



}
