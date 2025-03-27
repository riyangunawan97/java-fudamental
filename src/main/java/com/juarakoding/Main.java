package com.juarakoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
            camelCase
            snake_case
            SNAKE_CASE (khusus java backend)
            PascalCase
            kebab-case
        */
        int x = 10;
        System.out.println("JuaraKoding");

        if (true) {
            System.out.println("ifStatement");
            System.out.println(x);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println(x);
        }
    }
}