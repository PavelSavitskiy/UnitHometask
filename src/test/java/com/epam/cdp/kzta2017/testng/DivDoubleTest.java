package com.epam.cdp.kzta2017.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class DivDoubleTest extends BaseCalculatorTestDouble {

    @Test(dataProvider = "DivDataProvider", groups = "testNgDouble", alwaysRun = true)
    @Parameters({"a", "b", "expected"})
    public void testDivDouble(Object a, Object b, Object expected) {

        if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
            stringToDouble(a,b,expected);
            double divDouble = calculator.div(super.a,super.b);
            Assert.assertEquals(divDouble, super.expected);
        } else {
            objectToDouble(a,b,expected);
            double divDouble = calculator.div(super.a, super.b);
            Assert.assertEquals(divDouble, super.expected);
        }
    }

    @DataProvider(name = "DivDataProvider")
    public Object[][] divDataProvider() {
        return new Object[][]{
                {5.50, 5.50, 1.00},
                {0.00, 0.00, NaN},
                {-1.00, 1.00, -1.00},
                {"5.5", "5.5", "1.00"},
                {"0.00", "0.00", "NaN"},
                {"-1.00", "1.00", "-1.00"}
        };
    }
}