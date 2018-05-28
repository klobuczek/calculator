package com.iqlab.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorComponentTest {
    private CalculatorComponent calc = new CalculatorComponent();

    @Test
    public void add() {
        assertEquals(3, calc.add(1,2));
    }

}
