package com.epam.cdp.kzta2017.junit;

import com.epam.tat.module4.Calculator;
import org.junit.Before;

public class BaseJUnitTest {
    Calculator calculator;
    double a, b, expected;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }
}