//Joel Ostertag
//CSC 260-003
//Justin Fry
//3/5/2019
//The Luhn Algorithm Identifies if the Credit card is valid, doubling every second digit from right to left
//then adding all the single digits from that step then checking if that number is divisible by 10 reporting back if
//the number is valid and determining which type of credit card it is Mastercard, Visa, American Express, and Discover.

import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        //Getting Credit Card number as a long from user input, this part was provided to me
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long ccNum = input.nextLong();
        if (isValid(ccNum)) {
            System.out.println(ccNum + " is valid");
            System.out.println("Type is: " + getType(ccNum));
        } else {
            System.out.println(ccNum + " is invalid");
        }
    }
    //getType method to determine which card it is via the prefix on the card
    public static String getType(long num) {
        //Creating a variable then assigning it to if the prefix starts with the certain prefix
        String type = null;

        //If the prefix begins with a 4 it outputs Visa Card using the prefixMatched method
        if (prefixMatched(num, 4)) {
            type = "Visa Card";
        }

        //If the prefix begins with a 5 it outputs a MasterCard using the prefixMatched method
        if (prefixMatched(num, 5)) {
            type = "MasterCard";
        }
        //If the prefix begins with 37 it outputs American Express using the prefixMatched method
        if (prefixMatched(num, 37)) {
            type = "American Express";
        }
        //If the prefix begins with 6 it outputs Discover Card using the prefixMatched method
        if (prefixMatched(num, 6)) {
            type = "Discover Card";
        }
        //Returns the variable that is assigned
        return type;
    }
    //isValid method that returns valid if the number is divisible by 10
    public static boolean isValid(long ccNum) {

        //getSize method used to tell if the card is between 13 and 16 digits
        return (getSize(ccNum) >= 13 && getSize(ccNum) <= 16) &&
                        (prefixMatched(ccNum, 4) || prefixMatched(ccNum, 5) ||
                                prefixMatched(ccNum, 37) || prefixMatched(ccNum, 6)) &&

                        //gets the sum of the sumOfEvensPlaceDoubled and sumofOddsPlace method and mods it by 10
                        //to check if it divisible by 10
                        ((sumOfEvensPlaceDoubled(ccNum) + sumOfOddsPlace(ccNum)) % 10 == 0);
    }
    //getSize method to count how many digits in the Credit Card number returns the length
    public static int getSize(long n) {
        String num = n + "";
        return num.length();
    }

    //prefixMatched method to match the given prefix by getPrefix
    public static boolean prefixMatched(long num, int d) {
        return getPrefix(num, getSize(d)) == d;
    }

    //getPrefix method to get the first digit or first two digits of the credit card number used to determine the type
    //returns the prefix
    public static long getPrefix(long num, int k) {
        if (getSize(num) > k) {
            String number = num + "";
            return Long.parseLong(number.substring(0, k));
        }
        return num;
    }
    //sumsOfEvensPlaceDoubled method gets every second digit from right to left then doubles them and adds them together
    public static int sumOfEvensPlaceDoubled(long num) {
        int sum = 0;
        String ccNum = num + "";
        for (int i = getSize(num) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(ccNum.charAt(i) + "") * 2);
        }
        return sum;
    }
    //sumOfOddsPlace method gets the odd digits adds them together and returns the sum variable
    public static int sumOfOddsPlace(long num) {
        int sum = 0;
        String number = num + "";
        for (int i = getSize(num) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(number.charAt(i) + "");
        }
        return sum;
    }
    //getDigit method to be used in the sumofEvensPlaceDoubled method 
    public static int getDigit(int num) {
        if (num < 9)
            return num;
        else
            return num / 10 + num % 10;

    }
}