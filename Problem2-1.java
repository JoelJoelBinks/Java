//Joel Ostertag
//CSC 260-003
//Justin Fry
//3/28/2019
//displayNumber method to display number from 1 to n. with 7 numbers per line separated by a space.

public class Problem2 {
    public static void main(String[] args) {
        displayNumber(15);
        displayNumber(41);
    }

    public static void displayNumber(int n) {

        //loop to increment the numbers by one and print them out
        for (int i =1; i <= n; i++){
            System.out.print(i + " ");

            //if statement to stop the loop
            if (i %7 == 0) {
                System.out.println();
            }
        }
    }
}