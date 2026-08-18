import java.util.*;

public class Practical18 {

    public static void main(String[] args) {

        // ArrayList
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();

        linkedList.add("HTML");
        linkedList.add("CSS");
        linkedList.add("JavaScript");

        System.out.println("LinkedList: " + linkedList);

        // Common List operations
        arrayList.add("SQL");
        arrayList.remove("C++");

        System.out.println("Updated ArrayList: " + arrayList);
        System.out.println("First element: " + linkedList.get(0));
        System.out.println("Size of LinkedList: " + linkedList.size());
    }
}