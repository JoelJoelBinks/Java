//Joel Ostertag
//CSC 260-003
//Justin Fry
//2-21-2019
//Prompt the user to input an Integer, if the integer is a multiple of 5 it prints HiFive if it's a divisible by 2 or 3 it prints Mississippi.
//If it is both then it prints HiFive Mississippi
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        //Scanner input with import method above
        Scanner input = new Scanner(System.in);

        //Prompts the user to enter an integer then assigns it to a variable
        System.out.print("Enter an integer: ");
        int Integer = input.nextInt();

        //If block if the integer is a multiple of 5 then prints HiFive
        if ((Integer % 5) == 0) {
            System.out.print("HiFive ");
        }
        //If block if the integer is divisible by 2 or 3 then prints Mississippi
        if ((Integer % 2) == 0 || (Integer % 3) == 0) {
            System.out.print("Mississippi");
        }
    }
}
