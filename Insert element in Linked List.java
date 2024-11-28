import java.util.LinkedList;

public class Main  {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + list);

        // Specify the element and position
        String elementToInsert = "Date";
        int position = 1;  // Insert at position 1 (second position)

        // Insert the specified element at the specified position
        if (position >= 0 && position <= list.size()) {
            list.add(position, elementToInsert);
            System.out.println("LinkedList after insertion: " + list);
        } else {
            System.out.println("Invalid position! The position should be between 0 and " + list.size());
        }
    }
}



