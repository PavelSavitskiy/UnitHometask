package com.epam.cdp.kzta2017.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseCalculatorTestDouble {
    Calculator calculator;

    double a;
    double b;
    double expected;

    public void stringToDouble(Object aTemp, Object bTemp, Object expectedTemp) {
        a = Double.parseDouble((String) aTemp);
        b = Double.parseDouble((String) bTemp);
        expected = Double.parseDouble((String) expectedTemp);
    }

    public void objectToDouble(Object aTemp, Object bTemp, Object expectedTemp) {
        a = (double) aTemp;
        b = (double) bTemp;
        expected = (double) expectedTemp;
    }

        @BeforeClass
        public void createCalculator() {
            calculator = new Calculator(); }
    }