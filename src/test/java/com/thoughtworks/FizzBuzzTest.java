package com.thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void Setup()
    {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void print_1_when_passing_1() {
        String result = fizzBuzz.of(1);
        Assert.assertEquals("1", result);
    }

    @Test
    public void print_2_when_passing_2() {
        String result = fizzBuzz.of(2);
        Assert.assertEquals("2", result);
    }

    @Test
    public void print_Fizz_when_passing_3() {
        String result = fizzBuzz.of(3);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void print_Buzz_when_passing_5() {
        String result = fizzBuzz.of(5);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void print_FizzBuzz_when_passing_15() {
        String result = fizzBuzz.of(15);
        Assert.assertEquals("FizzBuzz", result);
    }
}
