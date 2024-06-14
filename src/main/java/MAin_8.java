import java.util.ArrayList;
import java.util.List;

public class MAin_8 {



        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(30);
            numbers.add(20);
            numbers.add(50);

            int max = numbers.get(0);
            for(int i=1; i<numbers.size(); i++){
                if(numbers.get(i) > max){
                    max = numbers.get(i);
                }
            }

            System.out.println("The maximum value in the list is: " + max);
        }
    }


