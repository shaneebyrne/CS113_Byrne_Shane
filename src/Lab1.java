/**
 * Created by w7045893 on 1/23/2017.
 *
 * CS113 Lab1
 * Programmer: Shane Eire Byrne
 * Last Date Of Modification: 01/23/2017
 * Algorithm:
 *
 * Problem Statement:
 * Write a program that prints the numbers from 1 to 100,
 * but for multiples of 3 print “Fizz” instead of the number and for multiples of 5 print “Buzz”.
 * For numbers that are multiples of both three and five print “FizzBuzz”.
 *
 * Imported Packages:
 *
 */
public class Lab1 {
    private final String MULTIPLE_OF_THREE = "Fizz";
    private final String MULTIPLE_OF_FIVE = "Buzz";
    private final String MULTIPLE_OF_THREE_AND_FIVE = "FizzBuzz";
    private String aNumber;

    public Lab1(String aNumber) {
        this.aNumber = aNumber;
    }

    @Override
    public String toString() {
        return "Number:" + "\t" + aNumber)
    }

    public String getaNumber() {
        return aNumber;
    }

    public void setaNumber(String aNumber) {
        this.aNumber = aNumber;
    }

    /**
     * A Method that determines if a number is a multiple of 3
     */

    public boolean isMultipleOfThree() {
        return true;
    }

    /**
     * A Method that determines if aNumber is a multiple of 5
     */

    public boolean isMultipleOfFive() {
        return false;
    }

}
