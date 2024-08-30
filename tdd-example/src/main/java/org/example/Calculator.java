package org.example;

import java.math.BigDecimal;

public class Calculator {

    public String sum(String arg1, String arg2) {

        final BigDecimal argument1 = new BigDecimal(arg1);
        final BigDecimal argument2 = new BigDecimal(arg2);
        if(argument1.scale() > 2 || argument2.scale() > 2 ){
            throw new IllegalArgumentException("Three decimal places are not allowed!");
        }

        return argument1.add(argument2).toString();
    }


    public int difference(int arg1, int arg2) {
        return arg1 - arg2;
    }
}
