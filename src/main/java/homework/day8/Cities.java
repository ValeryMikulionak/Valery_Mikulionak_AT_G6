package homework.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        cities.stream().peek(System.out::println).collect(Collectors.toList());

//        for (String str : cities) {
//            System.out.printf(str + "\n");
//        }

        int counter = 0;
        for (String str : cities) {
            counter += str.length();
        }
        System.out.println(counter);

        cities.stream().peek(x -> System.out.printf(x + ' ')).collect(Collectors.toList());

//        for (int i = 0; i < cities.size(); i++) {
//            System.out.printf(cities.get(i) + " ");
//        }
    }
}