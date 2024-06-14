import java.util.ArrayList;
import java.util.List;


public class Main_7 {



        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(2);
            numbers.add(4);
            numbers.add(6);
            numbers.add(8);

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            System.out.println("Sum of numbers: " + sum);
        }
    }

