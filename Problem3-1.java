// Joel Ostertag
// CSC 260 5-8-19
// This is a program that will allow the user to enter an array where it will
// then be tested if the list is sorted or is not sorted.

import java.util.Scanner;

// Main class is initialized
public class Problem3 {
    // Main method is created
    public static void main (String [] args) {

        // Scanner is initialized
        Scanner input = new Scanner(System.in);

        // User is prompted to enter their list
        System.out.print("Enter your list: ");

        // Variable is set with the next input to be put in array.
        int user = input.nextInt();

        // Array is created.
        int [] a = new int[user];

        // Loop is set up that will set the list values with the input.
        for(int i = 0; i < a.length; i++)
            a[i] = input.nextInt();

        // The answer variable is set to determine the if statement
        boolean answer = atest(a);

        // If statement will determine which outcome to display based the answer
        // variable
        if (answer)
            System.out.println("\nThe list is already sorted");
        else
            System.out.println("\nThe list is not sorted");
    }
    // Method that will determine whether the numbers are sorted
    public static boolean atest (int[] list) {

        // Boolean is set to true
        boolean answer = true;

        // For loop will go throught the array and determine whether any values
        // are out of order
        for(int i = 0; i < list.length - 1; i++) {

            // Returns false if a number is greater than any after it.
            if(list[i] > list [i + 1]) {
                answer = false;
            }
        }

        // Returns true if not false since it was set true.
        return answer;
    }
}