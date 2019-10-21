//Joel Ostertag
//CSC 260-003
//Justin Fry
// 2/5/2019
//Programming Assignment #2 compute future investment value with user inputs.

//Importing decimal format and the scanner for inputs.
import java.text.DecimalFormat;
import java.util.Scanner;

public class FutureInvestmentCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    //Getting the investment Amount as a double user input using Scanner
        System.out.print("Enter the investment amount (for example 12500.00):");
        double investmentAmount = input.nextDouble();
    //Getting the Annual Interest Rate as a double user input using Scanner
        System.out.print("Enter the annual interest rate (for example 8.25):");
        double annualInterest = input.nextDouble();
    //Taking Annual interest rate and turning it into monthly by turning it into a percent then dividing by 12
    //Also adding one to simplify my equation later
        double monthlyInterestRate = (((annualInterest / 100)/12) + 1);
    //Getting number of years as a integer input and multiplying by 12 to get the number of months
        System.out.print("Enter the number of years (as an integer, for example, 5):");
        int numberOfYears = input.nextInt();
        int numberofMonths = numberOfYears * 12;
    //The equation to calculate the future investment value using all the user inputs
        double futureInvestmentValue = investmentAmount * Math.pow(monthlyInterestRate,numberofMonths);
    //Limiting the output to 2 decimal places using math.round then printing the result of my equation above.
        System.out.print("Future Value is " + (double) Math.round(futureInvestmentValue *100d) / 100);
    }
}
