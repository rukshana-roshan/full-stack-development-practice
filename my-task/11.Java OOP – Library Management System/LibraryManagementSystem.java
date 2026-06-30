// Abstract Class (Abstraction)
abstract class LibraryItem {

    // Abstract method
    abstract void displayInfo();
}


// Interface (Interface Concept)
interface Borrowable {

    void borrowItem();

    void returnItem();
}


// Person Base Class (Inheritance)
class Person {

    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayPersonInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}


// Student inherits Person and implements Borrowable
class Student extends Person implements Borrowable {

    Student(String name, int id) {
        super(name, id);
    }


    public void borrowItem() {
        System.out.println(name + " borrowed a book.");
    }


    public void returnItem() {
        System.out.println(name + " returned a book.");
    }
}


// Librarian inherits Person
class Librarian extends Person {

    String department;

    Librarian(String name, int id, String department) {

        super(name, id);
        this.department = department;
    }


    void displayLibrarianInfo() {

        displayPersonInfo();
        System.out.println("Department : " + department);
    }
}


// Book extends LibraryItem and implements Borrowable
class Book extends LibraryItem implements Borrowable {


    // Encapsulation (private attributes)
    private int bookId;
    private String title;
    private String author;
    private double price;


    // Constructor
    Book(int bookId, String title, String author, double price) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    // Getters and Setters

    public int getBookId() {
        return bookId;
    }


    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    // Runtime Polymorphism (Method Overriding)
    public void displayInfo() {

        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : ₹" + price);
    }


    public void borrowItem() {

        System.out.println(title + " book borrowed.");
    }


    public void returnItem() {

        System.out.println(title + " book returned.");
    }
}


// Main Class
public class LibraryManagementSystem {


    public static void main(String[] args) {


        // Creating Book object
        Book book = new Book(
                101,
                "Java Programming",
                "James Gosling",
                2500
        );


        System.out.println("Book Details");
        System.out.println("--------------------");


        // Encapsulation using getter
        System.out.println("Book Title : " + book.getTitle());


        // Setter usage
        book.setPrice(3000);


        System.out.println("Updated Price : Rs:" + book.getPrice());


        System.out.println();


        // Abstraction + Runtime Polymorphism
        LibraryItem item = new Book(
                102,
                "Object Oriented Programming",
                "Bjarne",
                2000
        );


        System.out.println("Library Item Details");
        System.out.println("--------------------");

        item.displayInfo();


        System.out.println();


        // Student object (Inheritance + Interface)
        Student student = new Student("Rukshana", 1);


        System.out.println("Student Details");
        System.out.println("--------------------");

        student.displayPersonInfo();
        student.borrowItem();
        student.returnItem();


        System.out.println();


        // Librarian object (Inheritance)
        Librarian librarian =
                new Librarian("John", 10, "Computer Science");


        System.out.println("Librarian Details");
        System.out.println("--------------------");

        librarian.displayLibrarianInfo();


        System.out.println();


        // Book Interface methods
        book.borrowItem();
        book.returnItem();

    }
}
