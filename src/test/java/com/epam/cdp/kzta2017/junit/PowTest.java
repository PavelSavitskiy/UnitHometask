package com.epam.cdp.kzta2017.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

    @RunWith(Parameterized.class)
    public class PowTest extends BaseJUnitTest {
    public PowTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List numbers() {
       return Arrays.asList( new Object[][]{
                {2.2, 2, 4.84},
                {3.0,2.88,9.0},
                {2,-2,0.25},
                {-2,2,4},
                {-7.525,3.99,-426.107828125}
       });
      }
    @Test
    public void testPow(){
        Assert.assertEquals(expected,calculator.pow(a,b),1e-9);
    }
}