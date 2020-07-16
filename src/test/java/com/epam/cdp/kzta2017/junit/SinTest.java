package com.epam.cdp.kzta2017.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
@RunWith(Parameterized.class)
public class SinTest  extends BaseJUnitTest{
    public SinTest(double a, double expected) {
        this.a = a;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static List numbers() {
        return Arrays.asList( new Object[][]{
                {0,0},
                {90,1},
                {180,0},
                {270,-1}
        });
    }
    @Test
    public void testSin(){
        Assert.assertEquals(expected,calculator.sin(a),1e-9);
    }
}