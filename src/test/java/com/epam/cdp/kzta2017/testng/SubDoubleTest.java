package com.epam.cdp.kzta2017.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseCalculatorTestDouble {

    @Test(dataProvider = "SubDataProvider", groups = "testNgDouble", alwaysRun = true)
    @Parameters({"a", "b", "expected"})
    public void testSubDouble(Object a, Object b, Object expected) {


        if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
            stringToDouble(a,b,expected);
            double subDouble = calculator.sub(super.a,super.b);
            Assert.assertEquals(subDouble, super.expected);
        } else {
            objectToDouble(a,b,expected);
            double subDouble = calculator.sub(super.a, super.b);
            Assert.assertEquals(subDouble, super.expected);
        }
    }

    @DataProvider(name = "SubDataProvider")
    public Object[][] subDataProvider() {
        return new Object[][]{
                {1.1, 1.1, 0.0},
                {0.0, 0.0, 0.0},
                {-2.2, 2.2, -4.4},
                {-100.10, 100.10, -200.20},
                {"1.1", "1.1", "0.0"},
                {"0.0", "0.0", "0.0"},
                {"-2.2", "2.2", "-4.4"},
                {"-100.10", "100.10", "-200.20"}
        };
    }
}