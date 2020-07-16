package com.epam.cdp.kzta2017.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseCalculatorTestDouble {

    @Test(dataProvider = "SumDataProvider1", groups = "testNgDouble", alwaysRun = true)
    @Parameters({"a", "b", "expected"})
    public void testSumDouble(Object a, Object b, Object expected) {


        if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
            stringToDouble(a,b,expected);
            double sumDouble = calculator.sum(super.a,super.b);
            Assert.assertEquals(sumDouble, super.expected);
        } else {
            objectToDouble(a,b,expected);
            double sumDouble = calculator.sum(super.a, super.b);
            Assert.assertEquals(sumDouble, super.expected);
        }
    }

    @DataProvider(name = "SumDataProvider1")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {1.1, 1.1, 2.2},
                {0.0, 0.0, 0.0},
                {2.2, 2.2, 4.4},
                {100.10, 100.10, 200.20},
                {"3.3", "3.3", "6.6"}
        };
    }
}