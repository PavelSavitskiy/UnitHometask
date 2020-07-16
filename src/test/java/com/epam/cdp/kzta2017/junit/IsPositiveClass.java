package com.epam.cdp.kzta2017.junit;

import org.junit.Assert;
import org.junit.Test;

public class IsPositiveClass extends BaseCalculatorPosNegTest{


    @Test
    public void isPositive(){

        Assert.assertTrue(calculator.isPositive(5));
    }

    @Test
    public void isPositive2(){

        Assert.assertTrue(calculator.isPositive(500));
    }
    @Test
    public void isPositive3(){

        Assert.assertFalse(calculator.isPositive(0));
    }
}
