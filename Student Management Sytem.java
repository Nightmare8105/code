// Base class Student
class Student {
    String name;
    int studentID;
    double grade;

    // Constructor to initialize student details
    Student(String name, int studentID, double grade) {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

    // Method to display student information (to be overridden in subclasses)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade);
    }
}

// Undergraduate class inherits from Student
class Undergraduate extends Student {
    String major;

    // Constructor to initialize undergraduate student details
    Undergraduate(String name, int studentID, double grade, String major) {
        super(name, studentID, grade);  // Call the parent class constructor
        this.major = major;
    }

    // Overriding the displayInfo() method
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
        System.out.println("Academic Status: Undergraduate");
        System.out.println("----------------------------");
    }
}

// Graduate class inherits from Student
class Graduate extends Student {
    String thesisTitle;

    // Constructor to initialize graduate student details
    Graduate(String name, int studentID, double grade, String thesisTitle) {
        super(name, studentID, grade);  // Call the parent class constructor
        this.thesisTitle = thesisTitle;
    }

    // Overriding the displayInfo() method
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Title: " + thesisTitle);
        System.out.println("Academic Status: Graduate");
        System.out.println("----------------------------");
    }
}

// PhD class inherits from Student
class PhD extends Student {
    String dissertationTopic;

    // Constructor to initialize PhD student details
    PhD(String name, int studentID, double grade, String dissertationTopic) {
        super(name, studentID, grade);  // Call the parent class constructor
        this.dissertationTopic = dissertationTopic;
    }

    // Overriding the displayInfo() method
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Dissertation Topic: " + dissertationTopic);
        System.out.println("Academic Status: PhD");
        System.out.println("----------------------------");
    }
}

// Main class to manage student records
public class Main {
    public static void main(String[] args) {
        // Creating objects of different types of students
        Undergraduate undergrad1 = new Undergraduate("Alice", 101, 85.5, "Computer Science");
        Graduate grad1 = new Graduate("Bob", 102, 90.0, "Machine Learning in Healthcare");
        PhD phd1 = new PhD("Charlie", 103, 95.0, "Quantum Computing for Cryptography");

        // Displaying information of each student
        undergrad1.displayInfo();
        grad1.displayInfo();
        phd1.displayInfo();
    }
}

