package com.epam.cdp.kzta2017.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class SqrtTest extends BaseJUnitTest {
    public SqrtTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List numbers() {
        return Arrays.asList( new Object[][]{
                {1,1},
                {9,3},
                {8,2.8284271247461903},
                {-1,1},
                {0,0.0}
        });
    }
    @Test
    public void testSqrt(){
        Assert.assertEquals(expected,calculator.sqrt(a),1e-9);
    }
}