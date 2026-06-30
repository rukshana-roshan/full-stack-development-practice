class Employee {

    // Parent class fields
    String name;
    int id;

    // Constructor
    Employee(String employeeName, int employeeId) {
        name = employeeName;
        id = employeeId;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
    }
}


// Child class - FullTimeEmployee
class FullTimeEmployee extends Employee {

    double monthlySalary;

    // Constructor
    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        monthlySalary = salary;
    }

    // Salary calculation method
    void calculateSalary() {
        System.out.println("Monthly Salary : Rs:" + monthlySalary);
    }
}


// Child class - PartTimeEmployee
class PartTimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    // Constructor
    PartTimeEmployee(String name, int id, int hours, double rate) {
        super(name, id);
        hoursWorked = hours;
        hourlyRate = rate;
    }

    // Salary calculation method
    void calculateSalary() {

        double salary = hoursWorked * hourlyRate;

        System.out.println("Hours Worked   : " + hoursWorked);
        System.out.println("Hourly Rate    : Rs:" + hourlyRate);
        System.out.println("Salary         : Rs:" + salary);
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        // Full-time employee object
        FullTimeEmployee fullTimeEmployee =
                new FullTimeEmployee("Rukshana", 101, 50000);

        System.out.println("Full-Time Employee Details");
        System.out.println("--------------------------");

        fullTimeEmployee.displayInfo();
        fullTimeEmployee.calculateSalary();


        System.out.println();


        // Part-time employee object
        PartTimeEmployee partTimeEmployee =
                new PartTimeEmployee("Ali", 102, 40, 500);

        System.out.println("Part-Time Employee Details");
        System.out.println("--------------------------");

        partTimeEmployee.displayInfo();
        partTimeEmployee.calculateSalary();
    }
}