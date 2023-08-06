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
    public void sampleTest1() {
        System.out.println("Hello World 1 ");
    }

    @Test
    public void sampleTest2() {
        System.out.println("Hello World 2 ");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }
}
