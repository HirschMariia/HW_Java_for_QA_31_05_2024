import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main_4 {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("apple");
        listWithDuplicates.add("orange");
        listWithDuplicates.add("banana");

        List<String> listWithoutDuplicates = new ArrayList<>(new HashSet<>(listWithDuplicates));

        System.out.println("List with duplicates: " + listWithDuplicates);
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}
