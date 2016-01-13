package edu.bsu.cs222;

import junit.framework.framework.Assert;
import org.junit.Test;

public class LeapYearCalculatorTest {
    @Test
    public void test2015IsALeapYear(){
        LeapYearCalculator calc = new LeapYearCalculator();
        Assert.assertTrue(calc.isLeapYear(2016));
    }
}
