package com.thoughtworks;

public class FizzBuzz {
    public String of(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (i % 3 > 0 && i % 5 > 0) {
            result += i;
        }

        return result;
    }
}
