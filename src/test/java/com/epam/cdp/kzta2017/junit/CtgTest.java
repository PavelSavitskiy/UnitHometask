package com.epam.cdp.kzta2017.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class CtgTest extends BaseJUnitTest {
    public CtgTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List numbers() {
        return Arrays.asList(new Object[][]{
                {45, 1},
                {90, 0},
                {135, -1},
                {210, 1.7320508075}
        });
    }

    @Test
    public void testCtg() {
        Assert.assertEquals(expected, calculator.ctg(a), 1e-9);
    }
}