package edu.bsu.cs222;

/**
 * Created by jon on 1/13/16.
 */
public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        if (isDivisibleByFour(year)) {
            return true;
        }else {
            return false;
        }
    }

    private boolean isDivisibleByFour(int year) {
        return year % 4 == 0;
    }
}

