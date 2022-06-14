package testng;

import org.testng.annotations.*;

public class Annotations {


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @BeforeClass
    public void beforeCLass(){
        System.out.println("Before Class");
    }

    @Test
    public void test(){
        System.out.println("Test");
    }

    @AfterSuite
    public void aftereSuite(){
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterCLass(){
        System.out.println("After Class");
    }



}
