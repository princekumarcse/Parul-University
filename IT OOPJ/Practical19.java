import java.util.*;

public class Practical19 {

    public static void main(String[] args) {

        // HashSet
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // Duplicate element

        System.out.println("HashSet: " + hashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10); // Duplicate element

        System.out.println("TreeSet: " + treeSet);

        // Common Set operations
        hashSet.remove(20);

        System.out.println("Updated HashSet: " + hashSet);
        System.out.println("Does TreeSet contain 20? " + treeSet.contains(20));
        System.out.println("Size of TreeSet: " + treeSet.size());
    }
}