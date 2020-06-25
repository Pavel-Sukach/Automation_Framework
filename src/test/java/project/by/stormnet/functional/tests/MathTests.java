package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MathTests {
    @BeforeTest
    public void init(){
        System.out.println("Testing has started");
    }

    @Test
    public void multiply(){
        double expectedResult = 25;
        double actualResult = 5 * 5;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void division(){
        double expectedResult = 1;
        double actualResult = 10 / 5;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void subtraction(){
        double expectedResult = 0;
        double actualResult = 100 - 100;
        Assert.assertEquals(expectedResult,actualResult);
        throw new SkipException("Skip this test!");
    }
    @AfterTest
    public void finish(){
        System.out.println("Test is finished");
    }

}
