package com.thoughtworks;

import java.math.BigInteger;

public class Fibonacci {
    public BigInteger of(int i) {
        BigInteger resultOne = new BigInteger("1");
        BigInteger resultTwo = new BigInteger("1");
        if (i < 3) {
            return resultTwo;
        }
        int currentParam = 3;
        BigInteger result = null;
        while (currentParam <= i) {
            result = resultOne.add(resultTwo);
            resultOne = resultTwo;
            resultTwo = result;
            currentParam++;
        }
        return result;
    }
}
