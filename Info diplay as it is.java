import java.util.Scanner;

class Student {
    
    String name;
    String city;
    int age;
    
    
    public void addData(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    
    public void printData() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        Student s2 = new Student();

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter details for student 1:");
        System.out.print("Enter name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter city: ");
        String city1 = scanner.nextLine();
        System.out.print("Enter age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();  
        
       
        s1.addData(name1, city1, age1);

        
        System.out.println("\nEnter details for student 2:");
        System.out.print("Enter name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter city: ");
        String city2 = scanner.nextLine();
        System.out.print("Enter age: ");
        int age2 = scanner.nextInt();

       
        s2.addData(name2, city2, age2);

       
        System.out.println("\nDisplaying student 1 data:");
        s1.printData();

        System.out.println("\nDisplaying student 2 data:");
        s2.printData();
        
       
        scanner.close();
    }
}
