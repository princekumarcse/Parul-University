import java.util.Scanner;

public class Practical8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- String ----------------
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();

        System.out.println("\n--- String ---");
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Concatenation: " + str.concat(" " + str2));


        // ---------------- StringBuffer ----------------
        StringBuffer sb = new StringBuffer(str);

        System.out.println("\n--- StringBuffer ---");
        System.out.println("Original StringBuffer: " + sb);

        sb.append(" ").append(str2);
        System.out.println("After Append: " + sb);

        sb.insert(0, "Java ");
        System.out.println("After Insert: " + sb);

        sb.reverse();
        System.out.println("After Reverse: " + sb);


        // ---------------- StringBuilder ----------------
        StringBuilder sbuilder = new StringBuilder(str);

        System.out.println("\n--- StringBuilder ---");
        System.out.println("Original StringBuilder: " + sbuilder);

        sbuilder.append(" ").append(str2);
        System.out.println("After Append: " + sbuilder);

        sbuilder.delete(0, str.length());
        System.out.println("After Delete: " + sbuilder);

        sbuilder.reverse();
        System.out.println("After Reverse: " + sbuilder);

        sc.close();
    }
}
