//Joel Ostertag
//CSC 260-003
//Justin Fry
//3/28/2019
//Uses a method called m() to compute a series and outputs it into a chart
public class Problem1 {
    public static void main(String[] args) {

        //setting n to 20 to output 20 results
        int number = 20;

        //prints the top of the table
        System.out.println("\n i    m(i)");

        //loops the method below into a chart
        for (int i = 1; i <= number; i++) {
            System.out.printf("%2d\t%8.4f\n", i, m(i));
        }
    }

    //m() method to compute the series
    private static double m(int i) {
        double numbers = 0;

        //loop to output every solution from 1 to 20
        for (double j = 1; j <= i; j++) {

            //series equation
            numbers = (double) i / (2 * i + 1) + m(i-1);
        }
        return numbers;
    }
}