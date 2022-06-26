package com.vth.algo.utils;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FibonacciTest {

    @Test
    public void testFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int number = 0;
        String result;

        //Test 1 : no series printed if num <= 0
        result = fibonacci.print(0);
        Assert.assertEquals(result, "");

        //Test 2 : num = 1, print 0
        result = fibonacci.print(1);
        Assert.assertEquals(result, "0");

        //Test 3 : num = 2, print 0 1
        result = fibonacci.print(2);
        Assert.assertEquals(result, "0 1");

        //Test 4 : num = 3, print 0 1 1
        result = fibonacci.print(3);
        Assert.assertEquals(result, "0 1 1");
    }
}
