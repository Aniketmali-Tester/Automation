package Testclass;

import Baseclass.Baseclass;
import JsonUtilityData.JsonUtility;
import Listerners.ExtentListerners;
import Listerners.TestListerners1;
import Pages.RegisterClass1;
import Pages.RegisterPage;
import Pojoclass.RegisterData;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentListerners.class)
public class Register extends Baseclass {


    @Test
    public void VerifyRegisteration()


    {


       // RegisterPage obj=new RegisterPage(driver);

        RegisterClass1 obj=new RegisterClass1(driver);

        obj.clickRegisterLink();

        // Read data from JSON file
        RegisterData[] data = JsonUtility.getRegisterData();

        obj.registerCustomer(data[0]);
    }





}
