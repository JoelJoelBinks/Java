//Joel Ostertag
//CSC 260 5-8-19
//This is a program that will display all positive integers less than 1000
//but are not divisible by 2 or 3.

public class Problem5 {

    //Main method
    public static void main(String[] args) {

        //loop statement to count up but not pass 1000
        for(int i = 1; i < 1000; i++) {

            //If statement will determine if the number is divisible by 2 or 3.
            if((i%2 != 0) && (i % 3 != 0)) {

                //If the number is found to have a remainder greater than 0, the
                //number is then printed out on a new line.
                System.out.println(i);
            }
        }
    }
}
