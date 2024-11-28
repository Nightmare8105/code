// Student class
class Student {
    // Instance variable to store the name of the student
    String name;

    // Constructor with no parameters (default name is "Unknown")
    Student() {
        this.name = "Unknown";  // Default name
    }

    // Constructor with a parameter to set the student's name
    Student(String name) {
        this.name = name;  // Set the name to the provided value
    }

    // Method to print the student's name
    void printName() {
        System.out.println("Student Name: " + name);
    }
}

// Main class to test the Student class
public class Main {
    public static void main(String[] args) {
        // Creating a Student object without passing a name
        Student student1 = new Student();
        student1.printName();  // Should print "Unknown"

        // Creating a Student object with a name
        Student student2 = new Student("John Doe");
        student2.printName();  // Should print "John Doe"
    }
}

