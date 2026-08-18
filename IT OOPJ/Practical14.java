class Calculator {

    // Method with 2 parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Practical14 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of 2 integers: " + c.add(10, 20));
        System.out.println("Sum of 3 integers: " + c.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + c.add(10.5, 20.5));
    }
}