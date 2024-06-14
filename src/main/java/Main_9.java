import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_9 {
    List<String> strings = Arrays.asList("apple", "banana", "avocado", "apricot", "berry");
    List<String> filteredStrings = strings.stream()
            .filter(s -> s.startsWith("A") || s.startsWith("a"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());
       //System.out.println();

        //не пойму что с саутом, не могу ни заимпортировать ничего
}

