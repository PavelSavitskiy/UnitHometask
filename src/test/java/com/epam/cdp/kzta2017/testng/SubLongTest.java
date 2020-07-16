package com.epam.cdp.kzta2017.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubLongTest extends BaseCalculatorTestLong {
    @Test(dataProvider = "SubDataProvider", groups = "testNGLong")
    @Parameters({"a", "b", "expected"})
    public void testSubLong(Object a, Object b, Object expected) {

        if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
            stringToLong(a,b,expected);
            long subLong = calculator.sub(super.a,super.b);
            Assert.assertEquals(subLong, super.expected);
        } else {
            objectToLong(a,b,expected);
            long subLong = calculator.sub(super.a, super.b);
            Assert.assertEquals(subLong, super.expected);
        }
    }

    @DataProvider(name = "SubDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {1L, 1L, 0L},
                {0L, 0L, 0L},
                {-9223372036854775808L, 9223372036854775807L, 1L},
                {9223372036854775807L, 9223372036854775807L, 0L},
                {"1", "1", "0"},
                {"0", "0", "0"},
                {"-9223372036854775808", "9223372036854775807", "1"},
                {"9223372036854775807", "9223372036854775807", "0"},
        };
    }
}
