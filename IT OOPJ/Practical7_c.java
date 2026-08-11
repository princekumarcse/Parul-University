import java.util.Scanner;
public class Practical7_c {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        System.out.println("Enter First Matrix:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Second Matrix:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println("Addition of Matrices:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    
    }
}