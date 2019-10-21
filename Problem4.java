//Joel Ostertag
//CSC 260-003
//Justin Fry
//3/28/2019
//Uses the indexOfSmallestElement to output the index of the smallest double in the array.
public class Problem4 {

    //mmain method to test the program
    public static void main(String[] args) {

        //puts the array into a variable for easier use
        double[] numbers1 = {4.5, 9.67, 2.34, 9.2, 71.4, 16.54, 1.323, 9.7, 14.72, 98.3, 34.0, 3.75, 2.39, 23.9, 14.5};
        double[] numbers2 = {6.2, 97.8, 1.45, 6.3, 1.239, 9.67, 1.24, 6.75, 79.3, 24.25, 6.75, 35.99, 1.24, 5.234, 8.2};

        //prints out the solution of the method indexOfSmallestElement
        System.out.print(indexOfSmallestElement(numbers1) +"\n");
        System.out.print(indexOfSmallestElement(numbers2));

    }

    //indexOfSmallest method to find the minimum double in the arrays from above
    public static int indexOfSmallestElement(double[] array) {

        //creates variables for the method
        double min = array[0];
        int minimumIndex = 0;

        //for loop to increment through the array and find the minimum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minimumIndex = i;
            }
        }
        //returns the index of the minimum value in the array
        return minimumIndex;
    }
}