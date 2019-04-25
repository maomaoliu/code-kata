package com.thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setup()
    {
        fibonacci = new Fibonacci();
    }

    @Test
    public void setup_should_be_ready() {
        Assert.assertEquals(0, 0);
    }

    @Test
    public void get_1_when_passing_1() {
        BigInteger result = fibonacci.of(1);
        Assert.assertEquals(result, new BigInteger("1"));
    }

    @Test
    public void get_1_when_passing_2() {
        BigInteger result = fibonacci.of(2);
        Assert.assertEquals(result, new BigInteger("1"));
    }

    @Test
    public void get_2_when_passing_3() {
        BigInteger result = fibonacci.of(3);
        Assert.assertEquals(result, new BigInteger("2"));
    }

    @Test
    public void get_3_when_passing_4() {
        BigInteger result = fibonacci.of(4);
        Assert.assertEquals(result, new BigInteger("3"));
    }

    @Test
    public void get_5_when_passing_5() {
        BigInteger result = fibonacci.of(5);
        Assert.assertEquals(result, new BigInteger("5"));
    }

    @Test
    public void get_8_when_passing_6() {
        BigInteger result = fibonacci.of(6);
        Assert.assertEquals(result, new BigInteger("8"));
    }

    @Test
    public void get_big_number_when_passing_200() {
        BigInteger result = fibonacci.of(200);
        Assert.assertEquals(result, new BigInteger("280571172992510140037611932413038677189525"));
    }
}
