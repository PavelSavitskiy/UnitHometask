package com.epam.cdp.kzta2017.junit;

import com.epam.tat.module4.Calculator;
import org.junit.Before;

public class BaseCalculatorPosNegTest {
    Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }
}
