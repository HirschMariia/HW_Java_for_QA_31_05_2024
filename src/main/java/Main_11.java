import java.util.ArrayList;
import java.util.List;

public class Main_11 {
        public static void main(String[] args) {
            List<String> strings = new ArrayList<>();
            strings.add("apple");
            strings.add("banana");
            strings.add("Cherry");
            strings.add("orange");

            char filterLetter = 'b';

            List<String> filteredStrings = new ArrayList<>();
            for (String s : strings) {
                if (s.toLowerCase().startsWith(String.valueOf(filterLetter).toLowerCase())) {
                    filteredStrings.add(s.toUpperCase());
                }
            }

            for (String s : filteredStrings) {
                System.out.println(s);
            }
        }
    }


