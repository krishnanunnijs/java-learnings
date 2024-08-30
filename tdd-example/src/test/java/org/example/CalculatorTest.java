package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void shouldReturnInstance(){
        Calculator calculator = new Calculator();
        Assertions.assertNotNull(calculator);
    }

    @Test
    public void shouldReturnSum(){
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5,result);
    }

    @Test
    public void shouldReturnDifference(){
        Calculator calculator = new Calculator();
        int result = calculator.difference(2, 3);
        Assertions.assertEquals(-1,result);
    }



}
