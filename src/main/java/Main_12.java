import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main_12 {
        public static void main(String[] args) {
            List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "apple");

            Set<String> uniqueWords = strings.stream()
                    .filter(s -> s.length() > 4)
                    .map(String::toLowerCase)
                    .collect(Collectors.toCollection(HashSet::new));

            System.out.println(uniqueWords);
        }
    }


