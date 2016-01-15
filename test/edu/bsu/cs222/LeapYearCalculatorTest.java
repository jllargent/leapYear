package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2016IsALeapYear(){
        LeapYearCalculator calc = new LeapYearCalculator();
        Assert.assertTrue(calc.isLeapYear(2016));
    }
}
