package TestScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest2 {

    @BeforeMethod
    public void beforeMethod2() {
        System.out.println("Before Method 2");
    }

    @Test
    public void sampleTest2() {
        System.out.println("Hello World 2");
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void afterMethod2() {
        System.out.println("After Method 2");
    }
}
