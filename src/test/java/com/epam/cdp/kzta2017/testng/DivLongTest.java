package com.epam.cdp.kzta2017.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivLongTest extends BaseCalculatorTestLong {

    @Test(dataProvider = "DivDataProvider", groups = "testNGLong")
    @Parameters({"a", "b", "expected"})
    public void testDivLong(Object a, Object b, Object expected) {

        if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
            stringToLong(a,b,expected);
            long divLong = calculator.div(super.a,super.b);
            Assert.assertEquals(divLong, super.expected);
        } else {
            objectToLong(a,b,expected);
            long divLong = calculator.div(super.a, super.b);
            Assert.assertEquals(divLong, super.expected);
        }
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        calculator.div(5, 0);
    }

    @DataProvider(name = "DivDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {1L, 1L, 1L},
                {100L, 100L, 1L},
                {-100L, 100L, -1L},
                {"1", "1", "1"},
                {"100", "100", "1"},
                {"-100", "100", "-1"},
        };
    }
}