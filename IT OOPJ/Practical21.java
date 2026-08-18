import java.util.*;

public class Practical21 {

    public static void main(String[] args) {

        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(101, "Java");
        hashMap.put(102, "Python");
        hashMap.put(103, "C++");
        hashMap.put(101, "Java Programming"); // Updates value

        System.out.println("HashMap: " + hashMap);


        // LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(101, "Java");
        linkedHashMap.put(102, "Python");
        linkedHashMap.put(103, "C++");

        System.out.println("LinkedHashMap: " + linkedHashMap);


        // Common Map operations
        System.out.println("Value for key 102: " + hashMap.get(102));

        hashMap.remove(103);

        System.out.println("Updated HashMap: " + hashMap);

        System.out.println("Does LinkedHashMap contain key 101? "
                + linkedHashMap.containsKey(101));
    }
}