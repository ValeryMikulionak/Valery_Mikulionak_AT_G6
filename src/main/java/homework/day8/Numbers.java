package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));

        for (Integer in : numbers) {
            System.out.println(in);
        }
        System.out.println();

        int sum = 0;
        for (Integer in : numbers) {
            sum = sum + in;
        }
        System.out.println(sum);
        System.out.println();

        Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf(numbers.get(i) + " ");
        }
        System.out.println();

        Collections.reverse(numbers);
        for (Integer in : numbers) {
            System.out.printf(in + " ");
        }
    }
}
