// Joel Ostertag
// CSC 260 5-8-19
// This is a program that houses data of INF students. The data is stored in
// the InfStudent class which is an extension of the Student class. This will
// organize the data regarding INF into specific students.

// The main class is initialized
public class Problem2 {
    public static void main(String[] args) {

        // This is how the reults will be displayed. A test student is also
        // set for demonstration.
        InfStudent test = new InfStudent("Brendan Eich", "123 45 6789", "Mr. Wilson", 93.26);
        System.out.println("Name: " + test.getName());
        System.out.println("Ssnum: " + test.getSsnum());
        System.out.println("Advisor: " + test.getAdvisor());
        System.out.println("Average: " + test.getAverage());
    }
}

// This sets up the the InfStudent class which will inherit the information
// from the Student class. This will allow data to be found on a broad search
// or more narrow.
class InfStudent extends Student {

    // The variables are set for the INF specifics.
    private String advisor;
    private final double average;

    // This will create a super class constructor that will form the inheritance
    // from Student.
    public InfStudent(String name, String ssnum, String advisor, double average) {

        // This will allow the variables to be pulled from Student as well as
        // update the variables once the method is ran with the correct string and double
        super(name, ssnum);
        this.advisor = advisor;
        this.average = average;
    }

    // This will use the get method to get the advisor string value.
    public String getAdvisor() {
        return advisor;
    }

    // This will use the get method to get the average double value.
    public double getAverage() {
        return average;
    }
}

// Student class is set up which will pass down variables to InfStudent.
class Student {

    // Variables are set
    protected String name;
    protected String ssnum;

    // Student method is ran where the arguments are set.
    public Student(String name, String ssnum) {
        this.name = name;
        this.ssnum = ssnum;
    }
    // Use the get method to get the name.
    public String getName() {
        return name;
    }
    // Use the get method to get the Ssnum.
    public String getSsnum() {
        return ssnum;
    }
}