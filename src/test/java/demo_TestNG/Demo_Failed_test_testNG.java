package demo_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo_Failed_test_testNG {

    @BeforeMethod
    public void setUp(){
        System.out.println("Set the flag from admin on true ");
    }

    @Parameters({"Username"})
    @Test
    public void checkUsernameSuccess(String Username){
        System.out.println("Invoke test to check " + Username);
        assert "user123@gmail.com" .equals(Username);
    }

    @Parameters({"Username"})
    @Test
    public void checkUsernameFail(String Username){
        System.out.println("Invoke test to check " + Username);
        assert "user123" .equals(Username);
    }

    @Parameters({"mobile_number"})
    @Test
    public void checkMobileNumber(String mobile_number){
        System.out.println("Invoke test to check " + mobile_number );
        assert "1234567899" .equals(mobile_number);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Set the flag in Admin to false");
    }
}
