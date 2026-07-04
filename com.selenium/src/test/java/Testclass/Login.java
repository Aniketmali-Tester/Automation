package Testclass;

import Baseclass.Baseclass;
import JsonUtilityData.LoginJsonData;
import Pages.LoginPage;
import Pojoclass.LoginData;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login extends Baseclass {


    @Test
    public void VerifyLogin() throws IOException {
        LoginPage obj=new LoginPage(driver);

        LoginData [] data= LoginJsonData.getLoginData();
        obj.LoginCredrntinal(data[0]);
        obj.Loginbutton();
    }



}
