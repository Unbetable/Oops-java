import java.util.Scanner;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor
    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    // Constructor
    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    // Constructor
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class M4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Age: ");
        int empAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Phone Number: ");
        String empPhone = scanner.nextLine();
        System.out.print("Address: ");
        String empAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double empSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Specialization: ");
        String empSpecialization = scanner.nextLine();

        System.out.println();

        System.out.println("Enter Manager Details:");
        System.out.print("Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Age: ");
        int mgrAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Phone Number: ");
        String mgrPhone = scanner.nextLine();
        System.out.print("Address: ");
        String mgrAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        System.out.print("Department: ");
        String mgrDepartment = scanner.nextLine();

        // Creating objects with user inputs
        Employee emp = new Employee(empName, empAge, empPhone, empAddress, empSalary, empSpecialization);
        Manager mgr = new Manager(mgrName, mgrAge, mgrPhone, mgrAddress, mgrSalary, mgrDepartment);

        // Printing details
        System.out.println();
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println();

        System.out.println("Manager Details:");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone Number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        mgr.printSalary();
        System.out.println("Department: " + mgr.department);

        scanner.close();
    }
}
