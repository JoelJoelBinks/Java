//Joel Ostertag
//CSC 260-003
//Justin Fry
//2-26-2019
//Prompts the user to input a loan amount, then the number of years and calculates
//the monthly payment and total payment based on interest rates between 5%-8% incrementing by 1/8th
//and outputs it into a table.
import java.util.Scanner;

public class Loans {

    public static void main(String[] args) {

        //Scanner to get user input
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a Loan Amount and assigns it to a variable
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        //Prompt the user to enter the Number of years and assigns it to a variable
        System.out.print("Number of Years: ");
        int numOfYears = input.nextInt();

        //Variable to take the Number of years and converts it into the number of months for later calculation
        int numOfMonths = numOfYears * 12;

        //creating the count variable for the for loop
        double count;

        //Setting up the format for the table that is computed in the for loop
        System.out.format("%s\t" + "%s\t" + "%s\t\n", "Interest Rate", "Monthly Payment", "Total Payment");

        //for loop to calculate and output the Monthly Payment and Total Payment based on a incrementing variable count
        //which represents interest rate
        for (count = 5.0; count <= 8.0; count += 0.125) {

            //takes a whole number converts it into a present then splits it up based on months of a years
            double monthlyRate = (count / 100) / 12;

            //formula for calculating Monthly Payment and assigns it into a variable
            double formula = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numOfMonths));

            //formats and prints the output into columns
            System.out.printf("%.3f%%\t\t\t" + "%.2f\t\t\t" + "%.2f\n", count, formula, (formula *numOfMonths));
        }
    }
}
