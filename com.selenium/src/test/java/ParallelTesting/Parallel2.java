package ParallelTesting;

import org.testng.annotations.Test;

public class Parallel2 {


    @Test(priority = 4,dependsOnMethods = {"Login"})
    public void Search()
    {
        System.out.println("Search product");
    }

    @Test(priority = 5,dependsOnMethods={"Search"})
    public void Addtocart()
    {
        System.out.println("Added to cart");
    }

    @Test(priority = 6,dependsOnMethods={"Addtocart"})
    public void payment()
    {

        System.out.println("payment done Succesfully");
    }







}
