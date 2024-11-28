class Employee {
    String name, address, jobTitle;
    double salary;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; // Default 10% bonus
    }

    public void displayInfo() {
        System.out.println(name + " (" + jobTitle + ")");
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus for Manager
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // 15% bonus for Developer
    }

    public void develop() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
}

class Programmer extends Developer {
    String project;

    public Programmer(String name, String address, double salary, String programmingLanguage, String project) {
        super(name, address, salary, programmingLanguage);
        this.project = project;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.12; // 12% bonus for Programmer
    }

    public void workOnProject() {
        System.out.println(name + " is working on the " + project + " project.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", "123 Main St", 80000);
        Developer d = new Developer("Bob", "456 Elm St", 60000, "Java");
        Programmer p = new Programmer("Charlie", "789 Oak St", 50000, "Python", "AI Development");

        // Display information and calculate bonuses
        m.displayInfo();
        System.out.println("Bonus: $" + m.calculateBonus());
        System.out.println();

        d.displayInfo();
        d.develop();
        System.out.println("Bonus: $" + d.calculateBonus());
        System.out.println();

        p.displayInfo();
        p.workOnProject();
        System.out.println("Bonus: $" + p.calculateBonus());
    }
}
