import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_10 {

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(8);
            numbers.add(1);
            numbers.add(10);

            // Sort the list in descending order
            Collections.sort(numbers, Collections.reverseOrder());

            // Select the first three elements
            List<Integer> firstThree = numbers.subList(0, 3);

            // Print the sorted list and the first three elements
            System.out.println("Sorted list in descending order: " + numbers);
            System.out.println("First three elements: " + firstThree);
        }
    }

