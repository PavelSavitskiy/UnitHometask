package com.epam.cdp.kzta2017.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TgTest  extends BaseJUnitTest {
    public TgTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List numbers() {
        return Arrays.asList( new Object[][]{
                {315,-1},
                {350,0},
                {0,0},
                {45,1}
        });
    }
    @Test
    public void testTg(){
        Assert.assertEquals(expected,calculator.tg(a),1e-9);
    }
}
