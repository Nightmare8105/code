import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry"); // This will be the third element
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original List: " + list);

        // Check if the list has at least 3 elements to avoid IndexOutOfBoundsException
        if (list.size() >= 3) {
            // Remove the third element (index 2)
            list.remove(2);
            System.out.println("List after removing the third element: " + list);
        } else {
            System.out.println("The list does not have enough elements.");
        }
    }
}



