package com.epam.cdp.kzta2017.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultLongTest extends BaseCalculatorTestLong {
    @Test(dataProvider = "MultDataProvider" , groups = "testNGLong")
    @Parameters({"a","b","expected"})
    public void testMultLong(Object a, Object b, Object expected){

        if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
            stringToLong(a,b,expected);
            long multLong = calculator.mult(super.a,super.b);
            Assert.assertEquals(multLong, super.expected);
        } else {
            objectToLong(a,b,expected);
            long multLong = calculator.mult(super.a, super.b);
            Assert.assertEquals(multLong, super.expected);
        }
    }

    @DataProvider(name = "MultDataProvider")
    public Object[][] multDataProvider(){
        return new Object[][]{
                {1L, 0L, 0L},
                {0L, 0L,0L},
                {-100L,100L,-10000L},
                {100L,100L,10000L},
                {"1", "0", "0"},
                {"0", "0","0"},
                {"-100","100","-10000"},
                {"100","100","10000"},
        };
    }
}