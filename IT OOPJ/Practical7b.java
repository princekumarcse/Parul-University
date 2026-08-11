import java.util.Arrays;

public class Practical7b   {
    public static void main(String[] args) {

        String[] names = {"Prince", "Rahul", "Amit", "Neha", "Karan"};

        System.out.println("Before Sorting:");
        for (String name : names) {
            System.out.println(name);
        }

        // Sort names in ascending order
        Arrays.sort(names);

        System.out.println("\nAfter Sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}