import java.util.HashSet;

public class Main  {
    public static void main(String[] args) {
        // Create a HashSet and add some elements
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Get the number of elements in the HashSet
        int numberOfElements = set.size();

        // Print the number of elements
        System.out.println("Number of elements in the HashSet: " + numberOfElements);
    }
}
