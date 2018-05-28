package com.iqlab.calculator;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;

@ShellComponent
public class CalculatorComponent {
    @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }
}
