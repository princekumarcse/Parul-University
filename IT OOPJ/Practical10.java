class Student {

    int rollNo;
    String name;
    double marks;
    // Default Constructor
    Student() {
        rollNo = 101;
        name = "Unknown";
        marks = 0.0;
    }
    // Parameterized Constructor
    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }
    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Practical10 {
    public static void main(String[] args) {

        // Object using Default Constructor
        Student s1 = new Student();

        System.out.println("Student 1 - Default Constructor");
        s1.display();

        System.out.println();

        // Object using Parameterized Constructor
        Student s2 = new Student(102, "Rahul", 85.5);

        System.out.println("Student 2 - Parameterized Constructor");
        s2.display();
    }
}

