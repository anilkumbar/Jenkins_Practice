package TestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SampleTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void sampleTest() {
        System.out.println("Hello World");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
}
