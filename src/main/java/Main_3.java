import java.util.ArrayList;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(60);
        numbers.add(30);
        numbers.add(70);
        numbers.add(40);

        for (int number : numbers) {
            if (number > 50) {
                System.out.println("Square of " + number + ": " + number*number);
            }
        }
    }
}

