package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String str : cities) {
            System.out.printf(str + "\n");
        }

        int counter = 0;
        for (String str : cities) {
            counter += str.length();
        }
        System.out.println(counter);

        for (int i = 0; i < cities.size(); i++) {
            System.out.printf(cities.get(i) + " ");
        }
    }
}