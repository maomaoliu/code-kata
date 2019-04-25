package com.thoughtworks;

import java.math.BigInteger;

public class Fibonacci {
    public BigInteger of(int i) {
        return i > 2 ? of(i - 1).add(of(i - 2)) : new BigInteger("1");
    }
}
