public class Practical2 {
    public static void main(String[] args) {

        int a = 10, b = 5;
        boolean x = true, y = false;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));

        // Assignment Operator
        a += b;
        System.out.println("\nAssignment Operator");
        System.out.println("a += b = " + a);

        // Unary Operator
        System.out.println("\nUnary Operator");
        System.out.println("++b = " + (++b));

        // Ternary Operator
        System.out.println("\nTernary Operator");
        String result = (a > b) ? "a is Greater" : "b is Greater";
        System.out.println(result);
    }
}