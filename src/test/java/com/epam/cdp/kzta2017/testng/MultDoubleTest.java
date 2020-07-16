package com.epam.cdp.kzta2017.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseCalculatorTestDouble {
    @Test(dataProvider = "MultDataProvider", groups = "testNgDouble",alwaysRun = true )
    @Parameters({"a","b","expected"})
    public void testMultDouble(Object a, Object b, Object expected) {


        if (((a) instanceof String)|((b) instanceof String)|((expected) instanceof String))   {
            stringToDouble(a,b,expected);
            double multDouble = calculator.mult(super.a,super.b);
            Assert.assertEquals(multDouble, super.expected);
        } else {
            objectToDouble(a,b,expected);
            double multDouble = calculator.mult(super.a, super.b);
            Assert.assertEquals(multDouble, super.expected);
        }
    }

    @DataProvider(name = "MultDataProvider")
    public Object[][] multDataProvider(){
        return new Object[][]{
                {5.50,5.50,30.25},
                {10.00,20.00,200.00},
                {-1.00,1.00,-1.00},
                {"5.50","5.50","30.00"},
                {"10.00","20.00","200.00"},
                {"-1.00","1.00","-1.00"}
        };
    }
}