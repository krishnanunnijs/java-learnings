package org.example;

public class FizzBuzz {

    public String test(int input) {

        StringBuilder sb = new StringBuilder();
        if(input %3 == 0) {
            sb.append("Fizz");
        }

        if(input %5 == 0) {
            sb.append("Buzz");
        }

        if(sb.length() == 0) {
            sb.append(input);
        }

        return sb.toString();
    }
}
