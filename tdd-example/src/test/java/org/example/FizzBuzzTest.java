package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnInstance(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertNotNull(fizzBuzz);
    }

    @Test
    public void shouldReturnFizzWhenInputDivisibleBy3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(3);
        Assertions.assertEquals("Fizz",result);
    }

    @Test
    public void shouldReturnFizzWhenInputNotDivisibleBy3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(2);
        Assertions.assertEquals("2", result);
    }

    @Test
    public void shouldReturnBuzzWhenInputDivisibleBy5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(5);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputDivisibleBy3And5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(15);
        Assertions.assertEquals("FizzBuzz", result);
    }



}
