package com.iqlab.calculator;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class InfixComponent {
    @ShellMethod("Evaluate text in infix notation")
    public int infix(String seq) {
        return 0;
    }
}
