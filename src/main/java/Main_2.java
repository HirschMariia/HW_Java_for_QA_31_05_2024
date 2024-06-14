
import java.util.Arrays;

public class Main_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Filtering even numbers and multiplying by 2
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] *= 2;
            }
        }

        System.out.println("Result: " + Arrays.toString(numbers));
    }
}


