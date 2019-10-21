//Joel Ostertag
//CSC 260 5-8-19
//count() method that finds the number of occurrences of a specified character in the string.
public class Problem4 {

    public static void main(String[] args) {

        //main method to test count() method
        System.out.print(count("welcome", 'e'));
        }

        //count method takes two arguments a string and a char
        public static int count(String str, char a) {

            //initializing variables
            int num = 0;

            //for loop to count up the string
            for (int i = 0; i < str.length(); i++)
            {
                //if statement to check if the char in the string are equal
                if (str.charAt(i) == a)
                    num++;
            }

            //returns the count
            return num;
        }
}
