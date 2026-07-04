package Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class groupingclass {


    @Test(groups = {"Smoke"},priority = 0)
    public void login()
    {
        System.out.println("Login succesfully");
    }

    @Test(groups = {"Sanity"},priority = 1)
    public void verifyAccountpage()
    {
        //Assert.fail();
        System.out.println("Verified");

    }

    @Test(groups = {"Smoke"},priority = 2)
    public void opennewaccount()
    {
        System.out.println("New Account created");
    }


    @Test(groups = {"Smoke"},priority = 3)
    public void updatedcontactinfo()
    {

        System.out.println("updated Succefully ");
    }













}

