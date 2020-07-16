package com.epam.cdp.kzta2017.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class CosTest extends BaseJUnitTest {
    public CosTest(double a, double expected) {
        this.a =  a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List numbers() {
        return Arrays.asList(new Object[][]{
                {0.0, 1.0},
                {90.0, 0.0},
                {180.0, -1.0},
                {270.0, 0.0}
        });
    }

    @Test
    public void testCos() {
        Assert.assertEquals(expected, calculator.cos(a), 1e-9);
    }
}