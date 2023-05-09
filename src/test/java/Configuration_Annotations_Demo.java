import org.testng.annotations.*;

public class Configuration_Annotations_Demo {
    /**
     * the annotations are displayed in order from lowest to highest level
     **/

    //@BeforeSuite runs before a suite starts.
    @BeforeSuite()
    public void beforeSuite() {
        System.out.println("Chrome - Set Up System property.");
    }
    //@BeforeTest runs before all tests.
    @BeforeTest
    public void beforeTest() {
        System.out.println("Open Chrome");
    }
    //@BeforeClass runs before a test class starts, so let's use that method to open the test application.
    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Test Application");
    }
    // @BeforeMethod which runs before each @Test method
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Sign in into the application");
    }

    //After all Before methods have executed, the @Test methods will run
    @Test(description = "test only search of a customer and then check the result for validation")
    public void searchCustomer() {
        System.out.println("Search for a Customer");
    }

    @Test
    public void searchProduct() {
        System.out.println("Search for a Product");
    }

    //@AfterMethod runs after each @Test method
    @AfterMethod
    public void afterMethod() {
        System.out.println("Sign out from application");
    }

    //@AfterClass runs after all @Test methods
    @AfterClass
    public void afterClass() {
        System.out.println("Close Test Application");
    }

    //@AfterTest runs after all @Test methods.
    @AfterTest
    public void afterTest() {
        System.out.println("Close Chrome browser");
    }

    //@AfterSuite runs after all @Test methods within the suite have completed running.
    @AfterSuite
    public void afterSuite() {
        System.out.println("Chrome - Clean Up All Cookies");
    }



}
