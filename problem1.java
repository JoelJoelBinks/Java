//Joel Ostertag
//CSC 260-003
//Justin Fry
//2-21-2019
//Exam 1 Programming Problem1. Prompt user to input the exchange rate of dollars to RMB then Prompt user to enter a
//0 or 1 for converting into RMB or Dollars then Prompt user to enter Dollar or RMB amount then compute the
// Dollar or RMB amount after conversion.
import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {

        //Scanner input with the import method at the top of the code.
        Scanner input = new Scanner(System.in);

        //Prompt user to enter the exchange rate of Dollars to RMB. Getting the input as a variable
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double Conversion = input.nextDouble();

        //Prompting the user to enter a 0 or 1 to choose between Dollar conversion or RMB conversion and getting that as a variable
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int RMBtoDollars = input.nextInt();

        //If block if the user types 0 for the RMBtoDollars variable
        if (RMBtoDollars == 0) {

            //Prompting the user to enter Dollar amount
            System.out.print("Enter dollar amount: ");
            double DollarAmount = input.nextDouble();

            //Variable to do the Dollar to RMB conversion
            double YuanConversion = (DollarAmount * Conversion);

            //Using a variable to round off to the first two decimals
            double RoundOffYuan = (int) (YuanConversion * 100.0) / 100.0;
            System.out.print("$" + DollarAmount + " is " + RoundOffYuan + " Yuan");
        }

        //Else If block if the user enters a 1 for the RMBtoDollars variable. I used Else if here so the else block wouldn't print for the if block above
        else if (RMBtoDollars == 1) {

            //Prompting the user to enter RMB amount
            System.out.print("Enter the RMB amount: ");
            double RMBAmount = input.nextDouble();

            //Using a variable to do the RMB to Dollar conversion
            double DollarConversion = (RMBAmount / Conversion);

            //Using a variable to round off to the first two decimals
            double RoundOffDollar = (int)(DollarConversion * 100.0) / 100.0;
            System.out.print(RMBAmount + " Yuan is $" + RoundOffDollar);
        }
        //Else block if the user enters anything other than a 0 or 1
        else {
            System.out.print("Incorrect input");

        }
    }
}
