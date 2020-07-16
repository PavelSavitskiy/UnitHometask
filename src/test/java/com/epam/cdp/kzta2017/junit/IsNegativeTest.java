package com.epam.cdp.kzta2017.junit;

import org.junit.Assert;
import org.junit.Test;

public class IsNegativeTest extends BaseCalculatorPosNegTest{


    @Test
    public void isNegative(){

        Assert.assertTrue(calculator.isNegative(-5));
    }

    @Test
    public void isNegative2(){

        Assert.assertTrue(calculator.isNegative(-500));
    }
    @Test
    public void isNegative3(){

        Assert.assertFalse(calculator.isNegative(0));
    }
}
