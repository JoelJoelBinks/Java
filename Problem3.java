//Joel Ostertag
//CSC 260-003
//Justin Fry
//3/28/2019
//Uses the method getSuffix that returns a suffix of an integer with a specified number of digits.

public class Problem3 {
    public static void main(String[] args) {

        //Print statements to print out the result of the method below
        System.out.print(getSuffix(5323462, 3) + "\n");
        System.out.print(getSuffix(9876543, 4));
    }

    //getSuffix method that converts the integer to a string gets the last digits then converts back to an integer.
    public static int getSuffix(int value, int numberOfDigits) {
        String lastDigits = "";

        //converts the integer value into a string so we can use substring
        String value1 = Integer.toString(value);

        //if statement to check if the value is greater than the numberOfDigits
        if (value1.length() >  numberOfDigits) {

            //uses substring then subtracts by how many places we need
            lastDigits = value1.substring(value1.length() - numberOfDigits);
        }
        //converts from a string back to an integer then returns the suffix of the integer
        return Integer.parseInt(lastDigits);

        }
    }

