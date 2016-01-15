package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearCalculatorTest {

    private LeapYearCalculator calc = new LeapYearCalculator();

    @Test
    public void test2016IsALeapYear() {
        Assert.assertTrue(calc.isLeapYear(2016));
    }

    @Test
    public void test2015IsNotALeapYear() {
        Assert.assertFalse(calc.isLeapYear(2015));
    }

    @Test
    public void test2000IsALeapYear() {
        Assert.assertTrue(calc.isLeapYear(2000));
    }

    @Test
    public void test1900IsNotALeapYear() {
        Assert.assertFalse(calc.isLeapYear(1900));
    }

    @Test
    public void test1752IsALeapYear() {
        Assert.assertTrue(calc.isLeapYear(1752));
    }


}
