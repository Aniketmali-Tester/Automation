package ParallelTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Parallel {


    @Test(priority = 1 )
    public void openUrl()
    {
        System.out.println("Url Open succefully");
    }


    @Test(priority =2,dependsOnMethods = {"openUrl"})
    public void Register()
    {
       // System.out.println("Register Done succesfully");
        Assert.fail();

    }

    @Test(priority =3 ,dependsOnMethods = {"Register"})
    public static void Login()
    {
        System.out.println("login Done Succefully");

    }


}
