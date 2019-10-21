//Joel Ostertag
//CSC 260-003
//Justin T Fry
//2-12-2019
//Assignment 5, prompt for an letter input and output the corresponding number based on a Telephone. Using a switch statement

//Import Scanner
import java.util.Scanner;

public class Telephone {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//Prompt user to input uppercase letter
            System.out.print("Enter an uppercase letter:");
            String Letter = input.next();

//Switch statement with every case A-Z and break after each group
            switch (Letter) {
                case "A":
                case "B":
                case "C":
                    Letter = "The corresponding number is 2";
                    break;
                case "D":
                case "E":
                case "F":
                    Letter = "The corresponding number is 3";
                    break;
                case "G":
                case "H":
                case "I":
                    Letter = "The corresponding number is 4";
                    break;
                case "J":
                case "K":
                case "L":
                    Letter = "The corresponding number is 5";
                    break;
                case "M":
                case "N":
                case "O":
                    Letter = "The corresponding number is 6";
                    break;
                case "P":
                case "Q":
                case "R":
                case "S":
                    Letter = "The corresponding number is 7";
                    break;
                case "T":
                case "U":
                case "V":
                    Letter = "The corresponding number is 8";
                    break;
                case "W":
                case "X":
                case "Y":
                case "Z":
                    Letter = "The corresponding number is 9";
                    break;
//Default statement for invalid inputs
                default:
                    Letter = Letter + " is an invalid input";
                    break;

            }
//Print out variable Letter
            System.out.print(Letter);
    }
}