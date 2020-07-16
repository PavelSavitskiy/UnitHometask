package com.epam.cdp.kzta2017.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumLongTest extends BaseCalculatorTestLong {

    @Test(dataProvider = "SumDataProvider", groups = "testNGLong")
    @Parameters({"a", "b", "expected"})
    public void testSumLong(Object a, Object b, Object expected) {

        if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
            stringToLong(a,b,expected);
            long sumLong = calculator.sum(super.a,super.b);
            Assert.assertEquals(sumLong, super.expected);
        } else {
            objectToLong(a,b,expected);
            long sumLong = calculator.sum(super.a, super.b);
            Assert.assertEquals(sumLong, super.expected);
        }
    }

    @DataProvider(name = "SumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {1l, 1l, 2l},
                {0l, 0l, 0l},
                {-9223372036854775808L, 9223372036854775807L, -1l},
                {9223372036854775807L, 9223372036854775807L, -2l},
                {"9223372036854775807", "9223372036854775807", "-2"},
                {"2", "2", "4"}
                // {2.2,2.2,4.4}
        };
    }
}
