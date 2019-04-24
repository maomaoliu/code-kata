package com.thoughtworks;

public class Fibonacci {
    public int of(int i) {
        return i > 2 ? of(i - 1) + of(i - 2) : 1;
    }
}
