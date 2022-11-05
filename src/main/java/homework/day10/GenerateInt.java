package homework.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateInt {

    public static void main(String[] args) {

        List<Integer> chisla = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            chisla.add(new Random().nextInt());
        }
        System.out.println(chisla.stream().anyMatch(x -> x % 3 == 0 && x % 5 == 0));

    }
}
