//Joel Ostertag
//CSC 260-003
//Justin Fry
//3/19/2019
//A school has 100 lockers and 100 students. Students enter, the first student, denoted S1, opens every locker.
//Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker.
// Student S3 begins with the third locker and changes every third locker.
// Student S4 begins with locker L4 and changes every fourth locker. Student S5 starts with L5 and changes every fifth
//locker, and so on, until student S100 changes L100.
//This program outputs which lockers remain open after every student opens and closes lockers.

public class Lockers {
    
    public static void main(String[] args) {

        //Sets up boolean array
        boolean[] lockers = new boolean[101];

        //Loop to tell if the lockers are open or closed.
        for(int i = 1; i< lockers.length; i++) {
            lockers[i] = true;
        }

        //For loop with a nested For loop to calculate which locker numbers are open.
        for(int i = 2; i <= 100; i++) {
            for (int j = 1; i*j <= 100; j++) {
                lockers[i*j] = !lockers[i*j];
            }
        }

        //For loop to cycle the if statement multiple times
        for (int i =1; i < lockers.length; i ++) {

            //If statement to printout the locker number if it is open. Uses the above loop to print multiple times
            if (lockers[i]) {
                System.out.println("Locker " + i + " is open");
            }
        }
    }
}