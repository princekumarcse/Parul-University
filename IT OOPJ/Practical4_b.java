import java.util.Scanner;

public class Practical4_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 2;
        boolean prime = true;

        do {
            if (n % i == 0 && n != 2) {
                prime = false;
                break;
            }
            i++;
        } while (i < n);

        if (prime && n > 1)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
}