package org.example;

import java.math.BigDecimal;

public class Calculator {

    public int sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public String sumOfString(String arg1, String arg2) {
        return new BigDecimal(arg1).add(new BigDecimal(arg2)).toString();
    }


    public int difference(int arg1, int arg2) {
        return arg1 - arg2;
    }
}
