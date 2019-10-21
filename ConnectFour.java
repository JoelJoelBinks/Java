//Joel Ostertag
//CSC 260-003
//Justin Fry
//4-2-2019
//Connect four java program that takes a 2d array and test if the same number repeats 4 times in the array.
import java.util.Arrays;
public class ConnectFour {
    //Main statement with a 2d array to test my method
    public static void main(String[] args) {
        int[][] values = {{0, 1, 0, 3, 1, 6, 1,},
                {0, 1, 6, 8, 6, 0, 1},
                {5, 6, 2, 1, 6, 2, 9},
                {6, 5, 6, 6, 1, 9, 1},
                {1, 3, 6, 1, 4, 0, 7},
                {3, 6, 3, 3, 4, 0, 7}};
        System.out.println(Arrays.deepToString(values).replace("], ", "]\n"));
        System.out.println(
                (isConsecutiveFour(values)));
    }
    //isConsecutiveFour method to check if the same number repeats 4 times in an array
    public static boolean isConsecutiveFour(int[][] values) {

        //for statement for the y plane
        for (int i = 0; i < values.length; i++) {

            //for statement for the x plane
            for (int j = 0; j < values[i].length; j++) {

                //if statement that checks horizontally
                if (j < values[i].length - 3 && values[i][j] == values[i][j+1] && values[i][j] == values[i][j+2] && values[i][j] == values[i][j+3])
                    return true;

                //if statement that checks vertically
                if (i < values.length - 3 && values[i][j] == values[i +1][j] && values[i][j] == values[i +2][j] && values[i][j] == values[i +3][j])
                    return true;

                //if statement that checks downward diagonal
                if (i < values.length -3 && j < values[i].length - 3 && values[i][j] == values[i+1][j+1] &&
                        values[i][j] == values[i+2][j+2] && values[i][j] == values[i+3][j+3])
                    return true;
                //Checks upwards diagonal. NOTE: I tried using [i-1}[j+1]... etc. Like you said to in class but it kept
                //giving me an out of bounds exception. I had to change the code so my other if statements would still run
                if (i < values.length - 3 && j < values[i].length - 3 && values[i][j] == values[i+3][j+3] &&
                        values[i][j] == values[i+2][j+2] && values[i][j] == values[i+1][j+1])
                    return true;
            }
        }
        return false;
    }
}