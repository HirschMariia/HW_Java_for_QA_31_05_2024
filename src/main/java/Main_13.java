
public class Main_13 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            int sum = 0;

            for (int number : numbers) {
                if (number % 3 == 0 || number % 5 == 0) {
                    sum += number;
                }
            }

            System.out.println("Sum of numbers that are multiples of 3 and 5: " + sum);
        }
    }


