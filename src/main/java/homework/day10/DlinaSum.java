package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class DlinaSum {

    public static void main(String[] args) {

        List<Integer> dlina = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            dlina.add(i + 1);
        }

        double d = dlina.stream()
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)
                .mapToDouble(x -> x *2.54).sum();

        System.out.println(d);

    }
}