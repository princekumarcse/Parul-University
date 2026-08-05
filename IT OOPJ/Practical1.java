public class Practical1 {

    public static void main(String[] args) {

        // Display Hello World
        System.out.println("Hello World");
        // Variables and Data Types
        byte age = 20;
        short year = 2026;
        int rollNo = 101;
        long mobile = 9876543210L;

        float marks = 89.5f;
        double salary = 35000.75;

        char grade = 'A';
        boolean result = true;

        // Display Variables
        System.out.println("\n--- Variables and Data Types ---");
        System.out.println("Age = " + age);
        System.out.println("Year = " + year);
        System.out.println("Roll Number = " + rollNo);
        System.out.println("Mobile = " + mobile);
        System.out.println("Marks = " + marks);
        System.out.println("Salary = " + salary);
        System.out.println("Grade = " + grade);
        System.out.println("Result = " + result);

        // Implicit Type Casting
        int num = 100;
        double d = num; // Automatic Conversion

        System.out.println("\n--- Implicit Type Casting ---");
        System.out.println("Integer Value = " + num);
        System.out.println("Converted Double Value = " + d);

        // Explicit Type Casting

        double pi = 3.14159;
        int value = (int) pi; // Manual Conversion

        System.out.println("\n--- Explicit Type Casting ---");
        System.out.println("Double Value = " + pi);
        System.out.println("Converted Integer Value = " + value);
    }
}