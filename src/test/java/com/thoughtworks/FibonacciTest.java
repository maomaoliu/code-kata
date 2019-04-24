package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void setup_should_be_ready() {
        Assert.assertEquals(0, 0);
    }

    @Test
    public void get_1_when_passing_1() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.of(1);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void get_1_when_passing_2() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.of(2);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void get_2_when_passing_3() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.of(3);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void get_3_when_passing_4() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.of(4);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void get_5_when_passing_5() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.of(5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void get_8_when_passing_6() {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.of(6);
        Assert.assertEquals(result, 8);
    }
}
