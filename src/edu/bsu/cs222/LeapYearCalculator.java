package edu.bsu.cs222;

/**
 * Created by jon on 1/13/16.
 */
public class LeapYearCalculator {
    public boolean isLeapYear(int year) {

        if( isDivisibleByFour(year) && isDivisibleBy100(year) && isDivisibleBy400(year)){
            return true;
        }else if (isDivisibleByFour(year) && isDivisibleBy100(year)){
            return false;
        }else if (isDivisibleByFour(year)){
            return true;
        }else{
            return false;
        }
    }


    private boolean isDivisibleByFour(int year) {
        return year % 4 == 0;
    }
    private boolean isDivisibleBy100(int year) {return year % 100 == 0;}
    private boolean isDivisibleBy400(int year) {return year % 400 == 0;}
}

