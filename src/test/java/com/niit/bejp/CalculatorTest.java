/*
 * Author : Ketki Keni
 * Date : 18-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.niit.bejp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp()
    {
        calculator = new Calculator();
    }
    @After
    public void tearDown()
    {
        calculator = null;
    }

    @Test
    public void givenTwoPositiveNumbersThenReturnResult()
    {
        int addResult = calculator.add(15,17);
        int subResult = calculator.subtract(37,7);
        int mulResult = calculator.multiply(8,5);
        int divResult = calculator.divide(30,6);
        assertEquals(32,addResult);
        assertEquals(30,subResult);
        assertEquals(40,mulResult);
        assertEquals(5,divResult);

    }

    @Test
    public void givenTwoNegativeNumbersThenReturnResult()
    {
        int addResult = calculator.add(-15,17);
        int subResult = calculator.subtract(37,-7);
        int mulResult = calculator.multiply(8,-5);
        int divResult = calculator.divide(30,-6);
        assertEquals(2,addResult);
        assertEquals(44,subResult);
        assertEquals(-40,mulResult);
        assertEquals(-5,divResult);
    }

    @Test
    public void givenZeroAsOneNumberThenReturnException()
    {
        assertEquals(0, calculator.divide(30,0));
    }

}
