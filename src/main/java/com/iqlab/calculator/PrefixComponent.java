package com.iqlab.calculator;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class PrefixComponent {
    @ShellMethod("Evaluate text in prefix notation")
    public int prefix(String seq) {
        return 0;
    }
}
