package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Two methods sum and difference accepting two integers
 * Change : Input type and return to String, add a new method than breaking tests by refactoring original method
 *          Throw exception when input contains more than 3 decimal places
 */
public class CalculatorTest {

    @Test
    public void shouldReturnInstance(){
        Calculator calculator = new Calculator();
        Assertions.assertNotNull(calculator);
    }

    @Test
    public void shouldReturnSum() {
        Calculator calculator = new Calculator();
        String result = calculator.sum("1.11", "1.11");
        Assertions.assertEquals("2.22",result);
    }

    @Test
    public void shouldThrowExceptionWithThreeDecimalPlaces(){
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.sum("1.111", "1.111"));
        Assertions.assertEquals("Three decimal places are not allowed!",exception.getMessage());
    }

    @Test
    public void shouldReturnDifference(){
        Calculator calculator = new Calculator();
        int result = calculator.difference(2, 3);
        Assertions.assertEquals(-1,result);
    }



}
