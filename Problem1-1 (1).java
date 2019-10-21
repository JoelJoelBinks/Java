// Joel Ostertag
// CSC 260 5-8-19
// method named finalSearch() which accepts two arguments. The first will be an array of integer values
// and the second will be a single integer value. The method returns a count of the number of times
// the given value is found within the array.

public class Problem1 {
    //Main method to test finalSearch method.
    public static void main(String[] args) {
        int[] array = {4, 4, 4, 5, 4, 4, 4, 5,7 ,7};
        int num = 4;
        System.out.print(finalSearch(array, num) + "\n");
        int[] array1 = {5,6,7,8,9,1,2,3,3,4,4,5,6,6,6,6,5,5,4,1,1};
        int num1 = 3;
        System.out.print(finalSearch(array1, num1) + "\n");
        int[] array2 = {25,36,45,25,33,60,7,21,25,102,21,34,22,22,123,55,43,25};
        int num2 = 25;
        System.out.print(finalSearch(array2, num2));


    }
    //finalSearch() method that takes an array argument and a int argument and counts how many times it appears
    //in the array
    public static int finalSearch(int[] array, int num) {
        //initiates variable
        int i;
        int j;
        int count = 0;
        //for loop to count up the array
        for (i=0; i < array.length; i++) {
            //if statement to check if the number in the array is equal to the number given
            if (array[i] == num) {
                    count ++;

            }


        }
    //returns number of times the value repeats
    return count;
    }
}
