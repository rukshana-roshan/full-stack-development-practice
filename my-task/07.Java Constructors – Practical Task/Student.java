class Student {

    // Attributes
    int studentId;
    String studentName;
    String course;

    // Default Constructor
    Student() {
        studentId = 0;
        studentName = "Not Assigned";
        course = "Not Assigned";
    }

    // Parameterized Constructor
    Student(int id, String name, String courseName) {
        studentId = id;
        studentName = name;
        course = courseName;
    }

    // Copy Constructor
    Student(Student s) {
        studentId = s.studentId;
        studentName = s.studentName;
        course = s.course;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("---------------------------");
    }

    // Main Method
    public static void main(String[] args) {

        // Object using Default Constructor
        Student student1 = new Student();

        // Object using Parameterized Constructor
        Student student2 = new Student(101, "Rukshana", "Java Programming");

        // Object using Copy Constructor
        Student student3 = new Student(student2);

        // Display Details
        System.out.println("Student 1 Details");
        student1.displayDetails();

        System.out.println("Student 2 Details");
        student2.displayDetails();

        System.out.println("Student 3 Details");
        student3.displayDetails();
    }
}