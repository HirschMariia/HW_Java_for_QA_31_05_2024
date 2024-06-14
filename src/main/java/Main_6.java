import java.util.List;
import java.util.stream.Collectors;

public class Main_6 {
    public static List<Integer> convertStringListToNumberList(List<String> stringList) {

        return stringList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("1", "2", "3", "4", "5");

        List<Integer> numberList = convertStringListToNumberList(stringList);

        System.out.println("Original String List: " + stringList);
        System.out.println("Converted Number List: " + numberList);
    }
}

